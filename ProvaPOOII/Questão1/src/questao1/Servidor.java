package questao1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	
	public static void main(String[] args) {
		
		ServerSocket servidor = null;
		Socket socket = null;
		String usuario = "login";
		String senha = "senha";
		
			try {
				
				servidor = new ServerSocket(7080);
	            
	            while (true) {

	                System.out.println("Aguardando conexão...");
	                socket = servidor.accept();
	                System.out.println("Conexão estabelecida com " + socket.getInetAddress().getHostAddress());

	                DataInputStream in = new DataInputStream(socket.getInputStream());
	                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
	                
	                //System.out.println(in.readUTF());
	                
	                String[] input = in.readUTF().split("/");
	                String l = input[0];
	                String s = input[1];
	                
	                //System.out.println(l);
	                //System.out.println(s);
	                
	                if (l.equals(usuario) && s.equals(senha)) {
	                    System.out.println("\nAutenticação concluída com sucesso!");
	                } else {
	                    System.out.println("\nFalha na autenticação!");
	                }

	                socket.close();
	                in.close();
	                out.close();
	                System.out.println("Conexão finalizada!\n");

	            }
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		
		
	}

}
