package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Usuario;

public class UsuarioDao {
	public Usuario validarLogin(Usuario usuario) {
		Connection cnx = Dao.getConexao();
		Usuario u = new Usuario();
		
		String sql = "SELECT * FROM usuario WHERE usuario = ? AND senha = ?";
		
		try {
			PreparedStatement ps = cnx.prepareStatement(sql);
			
			ps.setString(1, usuario.getUsuario());
			ps.setString(2, usuario.getSenha());
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				u.setId(rs.getInt("id"));
				u.setUsuario(rs.getString("usuario"));
				u.setNome(rs.getString("nome"));
				u.setSenha(rs.getString("senha"));
				u.setEmail(rs.getString("email"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return u;
	}
	
	public List<Usuario> listar(){
		List<Usuario> listaDeUsuarios = new ArrayList<Usuario>();
		
		Connection cnx = Dao.getConexao();
		Usuario u = null;
		
		String sql = "SELECT * FROM usuario";
		
		try {
			PreparedStatement ps = cnx.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				u = new Usuario();
				u.setId(rs.getInt("id"));
				u.setUsuario(rs.getString("usuario"));
				u.setSenha(rs.getString("senha"));
				u.setNome(rs.getString("nome"));
				u.setEmail(rs.getString("email"));
				
				listaDeUsuarios.add(u);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaDeUsuarios;
	}
	
	public boolean incluir(Usuario usuario) {
		Connection cnx = Dao.getConexao();
		String sql = "INSERT INTO usuario(usuario, senha, nome, email) VALUES(?, ?, ?, ?)";
		boolean retorno = true;
		
		try {
			PreparedStatement ps = cnx.prepareStatement(sql);
			
			ps.setString(1, usuario.getUsuario());
			ps.setString(2, usuario.getSenha());
			ps.setString(3, usuario.getNome());
			ps.setString(4, usuario.getEmail());
			
			ps.execute();
		} catch (SQLException e) {
			retorno = false;
		}
		
		return retorno;
	}
}
