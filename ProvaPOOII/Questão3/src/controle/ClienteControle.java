package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import dao.ClienteDAO;
import modelo.Cliente;
import visao.JanelaPrincipal;

public class ClienteControle implements ActionListener{

	private JanelaPrincipal j;
	private Cliente c;
	private ClienteDAO cdao;
	private String output;


	public ClienteControle(JanelaPrincipal j, Cliente c) {

		this.j = j;
		this.c = c;
		cdao = new ClienteDAO();

		j.getButtonLimpar().addActionListener(this);
		j.getButtonCadastrar().addActionListener(this);

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getActionCommand().equals("Cadastrar")) {

			//Registro do input no banco de dados
			c.setNome(j.getFieldNome().getText().toString());
			c.setCpf(j.getFieldCPF().getText().toString());
			c.setTelefone(j.getFieldTelefone().getText().toString());
			c.setEndereco(j.getFieldEndereco().getText().toString());
			c.setCidade(j.getFieldCidade().getText().toString());

			if (cdao.cadastraCliente(c)) {

				output = "Cadastro realizado com sucesso!";
			} else {
				output = "Erro ao cadastrar cliente!";
			}

			//JOptionPane.showMessageDialog(j.getContentPane(), output);
			ImageIcon icone = new ImageIcon(JanelaPrincipal.class.getResource("/figuras/ok1.png"));
			JOptionPane.showMessageDialog(j, output, null, 0, icone);

			j.getFieldNome().setText("");
			j.getFieldCPF().setText("");
			j.getFieldTelefone().setText("");
			j.getFieldEndereco().setText("");
			j.getFieldCidade().setText("");

		} else if (e.getActionCommand().equals("Limpar")) {

			//Limpa os campos em caso de cancelamento da operação
			System.out.println("Operação cancelada!");

			j.getFieldNome().setText("");
			j.getFieldCPF().setText("");
			j.getFieldTelefone().setText("");
			j.getFieldEndereco().setText("");
			j.getFieldCidade().setText("");

		} 

	}

}
