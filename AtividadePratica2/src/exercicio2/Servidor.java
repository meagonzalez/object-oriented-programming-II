package exercicio2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	
	public static void main(String[] args) {
		
		
		try {
			ServerSocket server = new ServerSocket(2040);
			System.out.println("Servidor aguardando por requisições de conexão...\n");
			
			Socket socketS1= server.accept();
			System.out.println("Cliente 1 conectado");
			
			DataInputStream in1 = new DataInputStream(socketS1.getInputStream());
			DataOutputStream out1 = new DataOutputStream(socketS1.getOutputStream());
			
			Socket socketS2= server.accept();
			System.out.println("Cliente 2 conectado");
			
			DataInputStream in2 = new DataInputStream(socketS2.getInputStream());
			DataOutputStream out2 = new DataOutputStream(socketS2.getOutputStream());
			
			String palavra = in1.readUTF();
			
			StringBuilder palavraInv = new StringBuilder(palavra).reverse();
			out2.writeUTF(palavraInv.toString());
			out2.flush();
			System.out.println("\nPalavra invertida enviada para o Cliente 2");
			
			String confirmacao = in2.readUTF();
			System.out.println("Recebimento do Cliente 2 confirmado");
			
			out1.writeUTF(confirmacao);
			System.out.println("Mensagem de recebimento enviada para o Cliente 1");
			
			server.close();
			socketS1.close();
			socketS2.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
