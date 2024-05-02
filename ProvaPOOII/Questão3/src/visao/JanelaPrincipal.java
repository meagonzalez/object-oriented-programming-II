package visao;

import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField fieldNome;
	private JTextField fieldCPF;
	private JTextField fieldTelefone;
	private JTextField fieldCidade;
	private JTextField fieldEndereco;
	private JButton buttonLimpar;
	private JButton buttonCadastrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaPrincipal() {
		setTitle("Cadastro de Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Cliente");
		lblNewLabel.setBounds(108, 11, 149, 40);
		contentPane.add(lblNewLabel);
		
		buttonLimpar = new JButton("Limpar");
		buttonLimpar.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/exit.png")));
		buttonLimpar.setBounds(37, 313, 207, 23);
		contentPane.add(buttonLimpar);
		
		buttonCadastrar = new JButton("Cadastrar");
		buttonCadastrar.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/save.png")));
		buttonCadastrar.setBounds(37, 347, 207, 23);
		contentPane.add(buttonCadastrar);
		
		
		fieldNome = new JTextField();
		fieldNome.setBounds(37, 87, 207, 20);
		contentPane.add(fieldNome);
		fieldNome.setColumns(10);
		
		fieldCPF = new JTextField();
		fieldCPF.setBounds(37, 148, 86, 20);
		contentPane.add(fieldCPF);
		fieldCPF.setColumns(10);
		
		fieldTelefone = new JTextField();
		fieldTelefone.setBounds(158, 148, 86, 20);
		contentPane.add(fieldTelefone);
		fieldTelefone.setColumns(10);
		
		fieldCidade = new JTextField();
		fieldCidade.setBounds(37, 262, 207, 20);
		contentPane.add(fieldCidade);
		fieldCidade.setColumns(10);
		
		fieldEndereco = new JTextField();
		fieldEndereco.setBounds(37, 210, 207, 20);
		contentPane.add(fieldEndereco);
		fieldEndereco.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cidade:");
		lblNewLabel_1.setBounds(37, 241, 59, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Endereço:");
		lblNewLabel_2.setBounds(37, 185, 75, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CPF:");
		lblNewLabel_3.setBounds(37, 123, 59, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Telefone:");
		lblNewLabel_4.setBounds(158, 123, 66, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Nome:");
		lblNewLabel_5.setBounds(37, 60, 59, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel labelImagem = new JLabel("");
		try {
			labelImagem.setBounds(57, 11, 40, 40);
			labelImagem.setIcon(new ImageIcon(ImageIO.read(JanelaPrincipal.class.getResource("/figuras/LoginIcon.png")).getScaledInstance(labelImagem.getWidth(), labelImagem.getHeight(), BufferedImage.TYPE_INT_RGB)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		contentPane.add(labelImagem);
	}

	public JTextField getFieldNome() {
		return fieldNome;
	}

	public void setFieldNome(JTextField fieldNome) {
		this.fieldNome = fieldNome;
	}

	public JTextField getFieldCPF() {
		return fieldCPF;
	}

	public void setFieldCPF(JTextField fieldCPF) {
		this.fieldCPF = fieldCPF;
	}

	public JTextField getFieldTelefone() {
		return fieldTelefone;
	}

	public void setFieldTelefone(JTextField fieldTelefone) {
		this.fieldTelefone = fieldTelefone;
	}

	public JTextField getFieldCidade() {
		return fieldCidade;
	}

	public void setFieldCidade(JTextField fieldCidade) {
		this.fieldCidade = fieldCidade;
	}

	public JTextField getFieldEndereco() {
		return fieldEndereco;
	}

	public void setFieldEndereco(JTextField fieldEndereco) {
		this.fieldEndereco = fieldEndereco;
	}

	public JButton getButtonLimpar() {
		return buttonLimpar;
	}

	public void setButtonLimpar(JButton buttonLimpar) {
		this.buttonLimpar = buttonLimpar;
	}

	public JButton getButtonCadastrar() {
		return buttonCadastrar;
	}

	public void setButtonCadastrar(JButton buttonCadastrar) {
		this.buttonCadastrar = buttonCadastrar;
	}
	
	
	
}
