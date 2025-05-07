package factories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection obterConexao() {

		
		try {
			String url = "jdbc:postgresql://localhost:5432/crudProdutos";
			String user = "admin";
			String pass = "admin123";
			return DriverManager.getConnection(url, user, pass);

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao conectar ao banco de dados");
			return null;
		}

	}

}
