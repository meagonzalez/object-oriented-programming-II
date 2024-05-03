package exercicio2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente2 {

	public static void main(String[] args) {
		
		try {
			Socket s = new Socket("localhost", 2040);
			System.out.println("Conectado");
			
			DataInputStream in = new DataInputStream(s.getInputStream());
			DataOutputStream out= new DataOutputStream(s.getOutputStream());
			
			String palavraInv = in.readUTF();
			System.out.println("\nPalavra invertida: " + palavraInv);
			
			String confirmacao = "Recebido";
			out.writeUTF(confirmacao);
			System.out.println("\nResposta do servidor: "+ confirmacao);
			
			s.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
