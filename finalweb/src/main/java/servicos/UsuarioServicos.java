package servicos;

import java.util.List;

import dao.UsuarioDao;
import modelo.Usuario;

public class UsuarioServicos {
	UsuarioDao dao = new UsuarioDao();

	public boolean verificarUsuario(Usuario usuario) {
		Usuario u = dao.validarLogin(usuario);
		
		if(u.getNome() != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public List<Usuario> listarUsuario(){
		List<Usuario> lista = dao.listar();
		
		return lista;
	}
	
	public boolean incluirUsuario(Usuario usuario) {
		boolean retorno = dao.incluir(usuario);
		
		return retorno;
	}
}