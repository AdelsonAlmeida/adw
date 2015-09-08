package br.com.adw.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.adw.persistencia.entidade.Usuario;

public class UsuarioDAO {
private Connection con= ConexaoFactory.getConnection();

	public void cadastrar(Usuario usu) {

		String sql = "insert into usuario(nome, login, senha, nivel) values (?,?,?,?)";
        
		try {
			//Criando um Statement
			PreparedStatement preparador =con.prepareStatement(sql);
			preparador.setString(1, usu.getNome());
		    preparador.setString(2, usu.getLogin());
		    preparador.setString(3,usu.getSenha());
		    preparador.setInt(4, usu.getNivel());
	        //Executa o comando no banco
		    preparador.execute();
		    //fecha  o objeto preparador
		    preparador.close();
		} catch (SQLException e) {
		 
			e.printStackTrace();
		}
	}
	
	
	public void alterar(Usuario usu) {

		String sql = "update usuario set nome=?, login=?, senha=?, nivel=? where id=?";
        
		try {
			//Criando um Statement
			PreparedStatement preparador =con.prepareStatement(sql);
			preparador.setString(1, usu.getNome());
		    preparador.setString(2, usu.getLogin());
		    preparador.setString(3,usu.getSenha());
		    preparador.setInt(4, usu.getNivel());
		    preparador.setInt(5,usu.getId());
	        //Executa o comando no banco
		    preparador.execute();
		    //fecha  o objeto preparador
		    preparador.close();
		} catch (SQLException e) {
		 
			e.printStackTrace();
		}
	}


	public void excluir(Usuario usu) {
String sql = "delete from usuario where id=?";
        
		try {
			//Criando um Statement
			PreparedStatement preparador =con.prepareStatement(sql);
			  preparador.setInt(1,usu.getId());
	        //Executa o comando no banco
		    preparador.execute();
		    //fecha  o objeto preparador
		    preparador.close();
		} catch (SQLException e) {
		 
			e.printStackTrace();
		}
	}
	

}
