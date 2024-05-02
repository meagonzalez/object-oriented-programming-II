package questao2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ThreadServidor extends Thread {

	private Socket socket;
	private String usuario = "login";
	private String senha = "senha";

	public ThreadServidor(Socket skt) {
		// TODO Auto-generated constructor stub
		socket=skt;
	}

	public void run() {

		System.out.println("Criou thread " + currentThread());
		System.out.println("Conexão estabelecida com " + socket.getInetAddress().getHostAddress());

		try {
			DataInputStream in = new DataInputStream(socket.getInputStream());
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());

			String[] input = in.readUTF().split("/");
			String l = input[0];
			String s = input[1];

			if (l.equals(usuario) && s.equals(senha)) {
				System.out.println("\nAutenticação concluída com sucesso!");
			} else {
				System.out.println("\nFalha na autenticação!");
			}

			socket.close();
			in.close();
			out.close();
			System.out.println("Conexão finalizada!");
		} catch (IOException e) {
			e.printStackTrace();
		}




	}

}
