package financeiro.util;

import financeiro.bolsa.acao.AcaoDAO;
import financeiro.bolsa.acao.AcaoDAOHibernate;
import financeiro.categoria.CategoriaDAO;
import financeiro.categoria.CategoriaDAOHibernate;
import financeiro.cheque.ChequeDAO;
import financeiro.cheque.ChequeDAOHibernate;
import financeiro.conta.ContaDAO;
import financeiro.conta.ContaDAOHibernate;
import financeiro.lancamento.LancamentoDAO;
import financeiro.lancamento.LancamentoDAOHibernate;
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

	public static CategoriaDAO criarCategoriaDAO() {
		CategoriaDAOHibernate categoriaDAO = new CategoriaDAOHibernate();
		categoriaDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return categoriaDAO;
	}
	
	public static LancamentoDAO criarLancamentoDAO() {
		LancamentoDAOHibernate lancamentoDAO = new LancamentoDAOHibernate();
		lancamentoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return lancamentoDAO;
	}	
	
	public static ChequeDAO criarChequeDAO() {
		ChequeDAOHibernate chequeDAO = new ChequeDAOHibernate();
		chequeDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return chequeDAO;
	}		

	public static AcaoDAO criarAcaoDAO() {
		AcaoDAOHibernate acaoDAO = new AcaoDAOHibernate();
		acaoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return acaoDAO;
	}		
	
}
