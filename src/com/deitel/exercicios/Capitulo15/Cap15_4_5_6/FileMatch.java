package Cap15_4_5_6;

import java.io.EOFException;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.FormatterClosedException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;

public class FileMatch {
	
	private static ObjectInputStream fileMaster;
	private static ObjectInputStream fileTrans;
	private static ObjectOutputStream fileNewMaster;
	private static Formatter fileLog;
	
	public static void update() {	
		
		openFileReadingOldMaster();
		openFileRecordingNewMaster();
		
		try {		
			while(true) {
				Account account = (Account) fileMaster.readObject();
				
				openFileReadingTrans();
	
				try {
					while(true) {
						TransactionRecord transaction = (TransactionRecord) fileTrans.readObject();
				
						if(account.getAccount() == transaction.getNumberAccount()) {
							account.combine(transaction);
						}
					}	
				}
				catch(EOFException e) {
					
				}
				catch(ClassNotFoundException e) {
					System.out.println("Objeto inválido, fechando...");
				}
				catch(IOException e) {
					System.out.println("Erro ao abrir o arquivo, fechando...");
				}

				closeFileReading(fileTrans);

				fileNewMaster.writeObject(account);
			}
		}
		catch(EOFException e) {
			
		}
		catch(ClassNotFoundException e) {
			System.out.println("Objeto inválido, fechando...");
		}
		catch(IOException e) {
			System.out.println("Erro ao abrir o arquivo, fechando...");
		}
		
		closeFileReading(fileMaster); // fecha arquivo de leitura fileMaster
		closeFileRecording(fileNewMaster); // fecha arquivo de gravação fileNewMaster
	} // fim update

	public static void createLogTxt() {
		try {
			fileLog = new Formatter("Log.txt");
		}
		catch(SecurityException e) {
			System.out.println("Sem permissão para gravar, ferchando...");
		}
		catch(FileNotFoundException e) {
			System.out.println("Erro ao abrir arquivo, fechando...");
		}
		
		openFileReadingTrans();
		
		try {
			while(true) {
				TransactionRecord transaction = (TransactionRecord) fileTrans.readObject();
				
				openFileReadingOldMaster();
				
				boolean check = true;
				
				try {
					while(true) {
						Account account = (Account) fileMaster.readObject();
						
						if(transaction.getNumberAccount() == account.getAccount()) {
							check = false;
						}
					}
				}
				catch(EOFException e) {
					
				}
				catch(ClassNotFoundException e) {
					System.out.println("Objeto inválido, fechando...");
					System.exit(1);
				}
				catch(IOException e) {
					System.out.println("Erro ao abrir o arquivo, fechando");
					System.exit(1);
				}

				closeFileReading(fileMaster);
				
				if(check == true) {				
					try {
						fileLog.format("%d %.2f %s%n", transaction.getNumberAccount(),
								transaction.getValueTransaction(), "conta não econtrada");
					}
					catch(FormatterClosedException e) {
						System.out.println("Sem permissão para gravar, fechando...");
						System.exit(1);
					}
				}
			}
		}
		catch(EOFException e) {
			
		}
		catch(ClassNotFoundException e) {
			System.out.println("Objeto inválido, fechando...");
			System.exit(1);
		}
		catch(IOException e) {
			System.out.println("Erro ao abrir o arquivo, fechando");
			System.exit(1);
		}
		
		if(fileLog != null) {
			fileLog.close();
		}
		
		closeFileReading(fileTrans);
	}
	
	// abri arquivo para leitura oldmaster.dat
	private static void openFileReadingOldMaster() {
		try {	
			fileMaster = new ObjectInputStream(
					Files.newInputStream(Paths.get("oldmaster.dat")));
		}
		catch(IOException e) {
			System.out.println("Erro ao abrir o arquivo, fechando...");
			System.exit(1);
		}
	} // fim openFileReadingOldMaster
	
	// abri arquivo para leitura trans.dat
	private static void openFileReadingTrans() {
		try {	
			fileTrans = new ObjectInputStream(
			Files.newInputStream(Paths.get("trans.dat")));
		}
		catch(IOException e) {
			System.out.println("Erro ao abrir o arquivo, fechando...");
			System.exit(1);
		}
	} // fim openFileReadingTrans
	
	// abre arquivo para gravação newmaster.dat
	private static void openFileRecordingNewMaster() {
		try {
			fileNewMaster = new ObjectOutputStream(
					Files.newOutputStream(Paths.get("newmaster.dat")));
		}
		catch(IOException e) {
			System.out.println("Erro ao abrir o arquivo, fechando...");
		}
	} // fim openFileRecordingNewMaster
	
	// fecha arquivo de leitura
	private static void closeFileReading(ObjectInputStream input) {	
		try {
			if(input != null) {
				input.close();
			}
		}
		catch(IOException e) {
			System.err.println("Erro ao fechar o arquivo, fechando...");
			System.exit(1);
		}
	} // fim closeFileReading

	// fecha arquivo de gravação
	private static void closeFileRecording(ObjectOutputStream output) {
		try {
			if(output != null) {
				output.close();
			}
		}
		catch(IOException e) {
			System.out.println("Erro ao fechar o arquivo, fechando...");
			System.exit(1);
		}
	} // fim closeFileRecording
}
