package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClasseConexaoMySQL {
	
	private static Connection con;
	private static String status;
	
	public ClasseConexaoMySQL()
	{
		
	}
	
	public static Connection abrirConexaoMySQL()
	{
		String servidor="localhost";
		String banco="meubanco";
		String usuario="root";
		String senha="123456";
		String url="jdbc:mysql://"+servidor+":3306/"+banco;
		
		try {
			con=DriverManager.getConnection(url,usuario,senha);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return con;
		}
		
		if(con != null)
			
			status="STATUS--> Conex�o com o banco realizada com sucesso!";
		else
			status="STATUS--> Falha na conex�o com o banco!";
		
		return con;
		
	}
	
	public static void obterStatusConexao()
	{
		System.out.println(status);
	}
	
	public static void fecharConexao()
	{
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		ClasseConexaoMySQL.abrirConexaoMySQL();
		ClasseConexaoMySQL.obterStatusConexao();	
	}
	
}
