package br.com.rafael.drogariavd.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.rafael.droariavd.dao.FabricanteDAO;
import br.com.rafael.drogariavd.domain.Fabricante;

public class FabricanteDAOTest {
	@Test
	@Ignore
	public void salvar() {
		Fabricante fabricante = new Fabricante();
		fabricante.setDescricao("Aché");

		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		fabricanteDAO.salvar(fabricante);
	}

	@Test
	public void listar() {
		FabricanteDAO FabricanteDAO = new FabricanteDAO();
		List<Fabricante> resultado = FabricanteDAO.listar();

		System.out.println("Total de Registros Encontrados: " + resultado.size());

		for (Fabricante fabricante : resultado) {
			System.out.println(fabricante.getCodigo() + " - " + fabricante.getDescricao());
		}
	}
}