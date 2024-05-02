package questao2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) {
		ServerSocket servidor;

		try {
			servidor = new ServerSocket(7080);

			while (true) {

				ThreadServidor ts = new ThreadServidor(servidor.accept());
				ts.start();

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
