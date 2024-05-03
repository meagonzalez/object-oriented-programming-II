package exercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(2040);
			System.out.println("Servidor aguardando por requisições de conexão...\n");
			
			while(true) {
				
				Socket socketS= server.accept();
				System.out.println("Conexão obtida de: "+socketS.getInetAddress().getHostAddress());
				
				BufferedReader br = new BufferedReader(new InputStreamReader(socketS.getInputStream()));
				PrintWriter pw = new PrintWriter(socketS.getOutputStream(), true);

				 while(true) {
					 String string = br.readLine();
					 System.out.println("\nMensagem recebida");
					 
					 if (string.equals("sair")) {
						 break;
					 }
					 
					String stringConv = string.toUpperCase();
					pw.println(stringConv);
					System.out.println("Mensagem enviada");
					 
				 }
				 
				 br.close();
				 pw.close();
				 socketS.close();
				 server.close();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
