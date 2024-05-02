package modelo;

public class Cliente {
	
	String nome, cpf, telefone, endereco, cidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
		
}

/*1.
Cliente

instanciar string login e senha
login = entrada.nextLine();
senha = entrada.nextLine();
out.writeUTF(login + "/" + senha);

Servidor

instanciar string login e senha (String usuario = "login"; String senha = "senha";)

dentro do try/catch(while tem q estar dentro do try/excluir antigo while):

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

2.

criar ThreadServidor (extends Thread)

private Socket socket;
	String usuario = "login";
    String senha = "senha";

	public ThreadServidor(Socket skt) {
		socket = skt;
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

Servidor

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


*/