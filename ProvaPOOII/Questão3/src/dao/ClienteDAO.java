package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Cliente;
import visao.JanelaPrincipal;

public class ClienteDAO {

	String nome, cpf, telefone, endereco, cidade;
	PreparedStatement prep = null;
	
	public ClienteDAO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean cadastraCliente(Cliente c){
		
		
		String sql= "insert into Cliente values(?,?,?,?,?)";
		Connection con = ClasseConexaoMySQL.abrirConexaoMySQL();
		
		try {	
			
			prep= con.prepareStatement(sql);
			prep.setString(1, c.getNome());
			prep.setString(2, c.getCpf());
			prep.setString(3, c.getTelefone());
			prep.setString(4, c.getEndereco());
			prep.setString(5, c.getCidade());
		
			prep.executeUpdate();


		} catch (SQLException e1) {
		// TODO Auto-generated catch block
			e1.printStackTrace();
			ClasseConexaoMySQL.fecharConexao();
			return false;
		}
			return true;
		}

	
}
