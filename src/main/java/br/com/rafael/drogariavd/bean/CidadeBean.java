package br.com.rafael.drogariavd.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;

import br.com.rafael.drogariavd.dao.CidadeDAO;
import br.com.rafael.drogariavd.domain.Cidade;


@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class CidadeBean implements Serializable{
	private List<Cidade> cidades;
	
	public List<Cidade> getCidades() {
		return cidades;
	}
	
	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}
	
	@PostConstruct
	public void listar() {
		try {
			CidadeDAO cidadeDAO = new CidadeDAO();
			cidades = cidadeDAO.listar();
		}catch(RuntimeException erro) {
			Messages.addFlashGlobalError("Ocorreu um erro ao tentar listar as cidades");
			erro.printStackTrace();
		}
	}
}
