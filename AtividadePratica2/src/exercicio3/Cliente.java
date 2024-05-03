package exercicio3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		
		int voto;
		
		try {
			Socket s = new Socket("localhost", 2040);
			
			DataInputStream in = new DataInputStream(s.getInputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
			
            Scanner leitura = new Scanner(System.in);
            
            do {
            	
            	System.out.println("Escolha uma opção: "+
            			"\n(1) Candidato 1"+
            			"\n(2) Candidato 2"+
            			"\n(3) Nulo"+
            			"\n(4) Branco");
            	
            	voto = leitura.nextInt();
            	
            } while ((voto<=0) || (voto>4));
            
            out.writeInt(voto);
        	
        	String resp = in.readUTF();
        	System.out.println(resp);
		
        	s.close();
        	System.out.println("Votação encerrada.");
            
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
