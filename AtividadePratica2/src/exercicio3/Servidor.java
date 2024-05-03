package exercicio3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) {
		
		try {
			
			int candidato1 = 0;
            int candidato2 = 0;
            int nulo = 0;
            int branco = 0;
			
			ServerSocket server = new ServerSocket(2040);
			System.out.println("Servidor aguardando por requisições de conexão...");
			
			
			for(int i = 1; i <= 5; i++) {
				
				Socket socketS= server.accept();
				System.out.println("\nConectado com eleitor "+ i);
				
				DataInputStream in = new DataInputStream(socketS.getInputStream());
	            DataOutputStream out = new DataOutputStream(socketS.getOutputStream());
	            
	            int voto = in.readInt();
	            System.out.println("\nVoto computado!");
	            
	            switch(voto) {
	            
	            case 1: 
	            	candidato1++;
	            	break;
	            case 2:
	            	candidato2++;
	            	break;
	            case 3:
	            	nulo++;
	            	break;
	            case 4:
	            	branco++;
	            	break;
	            default:
	            	nulo++;
	            	break;
	            }
	            
	            out.writeUTF("\nVoto computado!");
	            socketS.close();
	           
			}
			
			server.close();
			
			System.out.println("\nTotal de Votos:");
			System.out.println("\nCandidato 1: "+ candidato1);
			System.out.println("Candidato 2: "+ candidato2);
			System.out.println("Nulo: "+ nulo);
			System.out.println("Branco: "+ branco);
			
			if (candidato1 > candidato2) {
                System.out.println("\nCandidato 1 ganhou a eleição!");
            } else if (candidato2 > candidato1) {
                System.out.println("\nCandidato 2 ganhou a eleição!");
            } else {
                System.out.println("\nHouve um Empate");
            }
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
