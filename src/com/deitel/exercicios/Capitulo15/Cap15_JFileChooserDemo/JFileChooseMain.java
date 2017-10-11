package Cap15_JFileChooserDemo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.DirectoryStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JFileChooser;



public class JFileChooseMain extends JFrame {

	private JPanel contentPane;
	private JTextArea outputArea;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					JFileChooseMain frame = new JFileChooseMain();
					frame.setVisible(true);
				} 
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JFileChooseMain() throws IOException {
		setTitle("JFileChooseDemo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		outputArea = new JTextArea();
		outputArea.setLineWrap(true);
		contentPane.add(outputArea, BorderLayout.CENTER);
		contentPane.add(new JScrollPane(outputArea));
		analyzePath();
	}

	public void analyzePath() throws IOException {
		Path path = getFileOrDirectoryPath();
		
		if(path != null && Files.exists(path)) {
			StringBuilder builder = new StringBuilder();
			
			builder.append(String.format("%s:%n", path.getFileName()))
				   .append(String.format("%s a directory%n", Files.isDirectory(path) ? "Is" : "Is not"))
				   .append(String.format("%s an absolute path%n", path.isAbsolute() ? "Is" : "Is not"))
				   .append(String.format("Last modified: %s%n", Files.getLastModifiedTime(path)))
				   .append(String.format("Size: %s%n", Files.size(path)))
				   .append(String.format("Path: %s%n", path))
				   .append(String.format("Absolute path: %s%n", path.toAbsolutePath()));
			
			if(Files.isDirectory(path)) {
				builder.append(String.format("%nDirectory contests:%n"));
				
				DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
				
				for(Path p : directoryStream) {
					builder.append(String.format("%s%n", p));
				}
			}
			
			outputArea.setText(builder.toString());
		}
		else {
			javax.swing.JOptionPane.showMessageDialog(this, path.getFileName() + " does not existe.",
					"ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private Path getFileOrDirectoryPath() {
		JFileChooser fileChooser = new JFileChooser();
		
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		int result = fileChooser.showOpenDialog(this);
		
		if(result == JFileChooser.CANCEL_OPTION) {
			System.exit(1);
		}
		
		return fileChooser.getSelectedFile().toPath();
	}
	
}
