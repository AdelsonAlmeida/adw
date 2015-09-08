package br.com.adw.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static Connection getConnection() {
	
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/adw","postgres","123456");
		} catch (SQLException e) {
			// relançando a exception
			throw new RuntimeException(e);
		}
		
	}

}
