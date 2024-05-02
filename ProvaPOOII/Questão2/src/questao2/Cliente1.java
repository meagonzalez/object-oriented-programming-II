package questao2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente1 {
	
	public static void main(String[] args) {

		Socket socket;
		Scanner entrada= null;
		String login;
		String senha;

		try {
			socket = new Socket("localhost", 7080);
			entrada = new Scanner(System.in);

			DataInputStream in = new DataInputStream(socket.getInputStream());
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());

			System.out.println("Insira seu login e senha:");
			login = entrada.nextLine();
			senha = entrada.nextLine();
			out.writeUTF(login + "/" + senha);

			out.flush();
			socket.close();
			entrada.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
