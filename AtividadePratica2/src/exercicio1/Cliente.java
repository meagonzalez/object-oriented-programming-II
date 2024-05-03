package exercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		
		String string;
		
		try {
		
			Socket s = new Socket("localhost", 2040);
			System.out.println("Conectado\n");
			
			
			while (true) {
				
				BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
				PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			
				Scanner leitura = new Scanner(System.in);
				
				System.out.println("Digite uma mensagem (Para sair digite sair):");
				
				string = leitura.nextLine();
				pw.println(string);
				pw.flush();
				
				
				 if (string.equalsIgnoreCase("sair")) {
					br.close();
					pw.close();
					leitura.close();
					s.close();
	                System.out.println("\nConexão encerrada.");
	                break;
	             }
				
				
				String conversao = br.readLine();
				System.out.println("\nConversão: " + conversao + "\n");
				
			}
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}


