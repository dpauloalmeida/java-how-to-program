package Cap15_4_5_6;

import java.io.EOFException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

	private static ObjectOutputStream output;
	private static ObjectInputStream input;
	private static Scanner in;
	
	// constantes das opções do menu
	private static final int NEW_RECORD = 1;
	private static final int NEW_TRANSACTION = 2;
	private static final int LIST_ACCOUNT = 3;
	private static final int LIST_TRANSACTION = 4;
	private static final int UPDATE = 5;
	private static final int LIST_UPDATE = 6;
	private static final int EXIT = 0;
	
	public static void main(String[] args) {
		
		int choice;
		
		while((choice = displayMenu()) != EXIT) {
			switch(choice) {
				case NEW_RECORD:
					openFileWriting("oldmaster.dat");
					newRecord();
					closeFile();
					break;
					
				case NEW_TRANSACTION:
					openFileWriting("trans.dat");
					newTransaction();
					closeFile();
					break;
				
				case LIST_ACCOUNT:
					openFileRead("oldmaster.dat");
					readAccount();
					closeFile();
					break;
					
				case LIST_TRANSACTION:
					openFileRead("trans.dat");
					readTransaction();
					closeFile();
					break;
					
				case UPDATE:
					FileMatch.update();
					FileMatch.createLogTxt();
					break;
					
				case LIST_UPDATE:
					openFileRead("newmaster.dat");
					readAccount();
					closeFile();
					break;	
				
				default:
					System.out.println("Opção inválida.");
			}
		}

		System.out.println();
		System.out.println("Encerrando...");
	} // fim main
	
	// exibe menu principal
	private static int displayMenu() {
		in = new Scanner(System.in);
		int choice = 0;

		System.out.println("===================================");
		System.out.println("========= Menu Principal ==========");
		System.out.println("===================================");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Transação");
		System.out.println("3 - Listar Contas");
		System.out.println("4 - Listar Transações");
		System.out.println("5 - Atualizar");
		System.out.println("6 - Listar Contas Atualizadas");
		System.out.println("0 - Sair");
		System.out.print("? ");
		
		try {		
			choice = in.nextInt();
		}
		catch(NoSuchElementException e) {
			System.out.println("Entrada inválida, fechando...");
		}
		
		return choice;
	} // fim displayMenu
	
	// abre arquivo para gravação
	public static void openFileWriting(String path) {
		
		try {
			output = new ObjectOutputStream(
					Files.newOutputStream(Paths.get(path)));
		}
		catch(IOException e) {
			System.err.println("Erro ao abrir o arquivo, fechando...");
			System.exit(1);
		}
	} // fim openFileWrite
	
	// abri arquivo para leitura
	public static void openFileRead(String path) {
		
		try {
			input = new ObjectInputStream(
					Files.newInputStream(Paths.get(path)));
		}
		catch(IOException e) {
			System.err.println("Erro ao abrir o arquivo, fechando...");
			System.exit(1);
		}
	} // fim openFileWrite
	
	// grava novas contas
	public static void newRecord() {
		in = new Scanner(System.in);
		
		System.out.println("===================================");
		System.out.println("============ Cadastro =============");
		System.out.println("===================================");
		
		System.out.print("Conta: ");
		int code = in.nextInt();
	
		while(code != -1) {
			try {
				Account record = new Account();
				
				record.setAccount(code);
				
				System.out.print("Nome: ");
				record.setName(in.next());
				
				System.out.print("Saldo: ");
				record.setBalance(in.nextDouble());
				
				 output.writeObject(record);
				 
				 System.out.println();
				 
				 System.out.print("Conta: ");
				 code = in.nextInt();
			}
			catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
				in.nextLine();
			}
			catch(NoSuchElementException e) {
				System.err.println("Entrada inválida, tente novamente.");
				in.nextLine();
			}
			catch(IOException e) {
				System.err.println("Erro ao escrever o arquivo, fechando...");
				System.exit(1);
			}
		}
	} // fim newRecord
	
	// grava novas transações
	public static void newTransaction() {		
		in = new Scanner(System.in);
		
		System.out.println("===================================");
		System.out.println("============ Transação ============");
		System.out.println("===================================");
		
		System.out.print("Conta: ");
		int code = in.nextInt();
		
		while(code != -1) {
			try {
				TransactionRecord transaction = new TransactionRecord();
				
				transaction.setNumberAccount(code);
				
				System.out.print("Transação: ");
				transaction.setValueTransaction(in.nextDouble());
				
				output.writeObject(transaction);
				
				System.out.println();
				
				System.out.print("Conta: ");
				code = in.nextInt();
			}
			catch(NoSuchElementException e) {
				System.err.println("Entrada inválida, tente novamente");
				in.nextLine();
			}
			catch(IOException e) {
				System.out.println("Erro ao escrever o arquivo, fechando...");
				System.exit(1);
			}
		}
	} // fim newTransaction
	
	// ler o arquivo de contas
	public static void readAccount() {
		
		System.out.printf("%s%8s%12s%n", "Conta", "Nome", "Saldo");
		
		try {
			while(true) {
				Account account = (Account) input.readObject();
				
				System.out.printf("%d%10s%12.2f%n", account.getAccount(),
						account.getName(), account.getBalance());
			}
		}
		catch(EOFException e) {
			System.out.println("Fim do arquivo.");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Objeto inválido, fechando...");
		}
		catch(IOException e) {
			System.out.println("Erro ao ler o arquivo, fechando...");
		}
	} // fim readAccount
	
	// ler o aruivo de transações
	public static void readTransaction() {
		
		System.out.printf("%s%12s%n", "Conta", "Transação");
		
		try {
			while(true) {
				TransactionRecord transaction = (TransactionRecord) input.readObject();
				
				System.out.printf("%d%12.2f%n", transaction.getNumberAccount(),
						transaction.getValueTransaction());
			}
		}
		catch(EOFException e) {
			System.out.println("Fim do arquivo.");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Objeto inválido, fechando...");
		}
		catch(IOException e) {
			System.out.println("Erro ao ler o arquivo, fechando...");
		}
	} // fim readTransaction
	
	// fecha o arquivo
	public static void closeFile() {
		
		try {
			if(output != null) {
				output.close();
			}
		}
		catch(IOException e) {
			System.err.println("Erro ao fechar o arquivo, fechando...");
			System.exit(1);
		}
	} // fim closeSile

}
