package br.com.adw;

import br.com.adw.persistencia.entidade.Usuario;
import br.com.adw.persistencia.jdbc.UsuarioDAO;

public class TesteUsuarioDAO {

	public static void main(String[] args) {
	  
	excluir();
	 
	}
	
	
	public static void alterar(){
		  //Criando o Usuario
				Usuario usu =new Usuario();
				usu.setId(1);
			    usu.setNome("adepeal");
			    usu.setLogin("ad");
			    usu.setSenha("123");
			    usu.setNivel(0);
			    
			   UsuarioDAO usuDAO = new UsuarioDAO();
			   usuDAO.alterar(usu);
			   System.out.println("Alterado Com Sucesso");
			
		
	}
	public static void excluir(){
		  //Criando o Usuario
				Usuario usu =new Usuario();
				usu.setId(2);
			   
			   UsuarioDAO usuDAO = new UsuarioDAO();
			   usuDAO.excluir(usu);
			   System.out.println("Excluido Com sucesso");
			
		
	}
	
	
	
	
	public static void cadastrar() {
		   //Criando o Usuario
			Usuario usu =new Usuario();
		    usu.setNome("WILL");
		    usu.setLogin("W");
		    usu.setSenha("123");
		    usu.setNivel(1);
		    
		   UsuarioDAO usuDAO = new UsuarioDAO();
		   usuDAO.cadastrar(usu);
		   System.out.println("Cadastrado Com Sucesso");
		}

	
	

}
