package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
	public static Connection getConexao() {
		Connection cnx = null;
		String driverName = "com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(driverName);
			
			String serverName = "localhost:3306";
			String dataBase = "loginjava";
			String url = "jdbc:mysql://" + serverName + "/" + dataBase;
			String user = "root";
			String password = "";
			
			cnx = DriverManager.getConnection(url, user, password);
			
			return cnx;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Drive nao encontrado");
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Não foi possivel conectar ao Banco de Dados");
			return null;
		}
		
	}
	
	public static boolean fecharConexao() {
		try {
			Dao.getConexao().close();
			return true;
		}catch (SQLException e) {
			return false;
		}
	}
}

