package exercicio2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente1 {
	
	public static void main(String[] args) {
		
		String palavra;
		
		try {
			Socket s = new Socket("localhost", 2040);
			System.out.println("Conectado");
			
			DataInputStream in = new DataInputStream(s.getInputStream());
			DataOutputStream out= new DataOutputStream(s.getOutputStream());
			
			Scanner leitura = new Scanner(System.in);
			
			System.out.println("\nDigite a palavra que deseja enviar: ");
			palavra = leitura.nextLine();
			out.writeUTF(palavra);
			
			String confirmacao = in.readUTF();
			System.out.println("\nResposta do servidor: "+ confirmacao);
			
			leitura.close();
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
