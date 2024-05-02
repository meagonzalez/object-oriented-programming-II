package controle;

import modelo.Cliente;
import visao.JanelaPrincipal;

public class App {

	public static void main(String[] args) {

		JanelaPrincipal j= new JanelaPrincipal();
		Cliente c = new Cliente();
		ClienteControle cc =new ClienteControle (j, c);

		j.setVisible(true);

	}

}
