package financeiro.usuario;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class UsuarioDAOHibernate implements UsuarioDAO {
private Session session;
public void setSession(Session session){
	this.session = session;
	
}
	@Override
	public void salvar(Usuario usuario) {
	this.session.save(usuario);

	}

	@Override
	public void atualizar(Usuario usuario) {
		this.session.update(usuario);
	}

	@Override
	public void excluir(Usuario usuario) {
		this.session.delete(usuario);

	}

	@Override
	public Usuario carregar(Integer codigo) {
		return (Usuario) this.session.createCriteria(Usuario.class).list();
	}


	@Override
	public List<Usuario> listar() {
		return this.session.createCriteria(Usuario.class).list();
	}

	@Override
	public Usuario buscarPorLogin(String login) {
		Query consulta = this.session.createQuery(Usuario.QUERY_CONSULTA_USERBYLOGIN);
		consulta.setString("login", login);
		return (Usuario) consulta.uniqueResult();
	}
}
