package financeiro.util;

import financeiro.conta.ContaDAO;
import financeiro.conta.ContaDAOHibernate;
import financeiro.usuario.UsuarioDAO;
import financeiro.usuario.UsuarioDAOHibernate;

public class DAOFactory {
	public static UsuarioDAO criaUsuarioDAO() {
		UsuarioDAOHibernate UsuarioDAO = new UsuarioDAOHibernate();
		UsuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return UsuarioDAO;
	}

	public static ContaDAO criarContaDAO() {
		ContaDAOHibernate ContaDAO = new ContaDAOHibernate();
		ContaDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return ContaDAO;
	}
	
}
