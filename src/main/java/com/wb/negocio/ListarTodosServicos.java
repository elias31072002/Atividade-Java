package com.wb.negocio;

import java.util.List;

import com.wb.io.Listagem;
import com.wb.modelo.Servico;

public class ListarTodosServicos extends Listagem {

	private List<Servico> servicos;
	
	public ListarTodosServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}
	
	@Override
	public void listar() {
		System.out.println("");
		System.out.println("Lista de todos os servicos:");
		for (Servico servico : servicos) {
			System.out.println("Nome: " + servico.nome);
			System.out.println("Valor: R$" + servico.valor);
		}
		System.out.println("");

	}

}
