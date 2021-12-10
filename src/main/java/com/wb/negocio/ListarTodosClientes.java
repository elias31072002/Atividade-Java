package com.wb.negocio;

import java.util.List;

import com.wb.io.Listagem;
import com.wb.modelo.Cliente;
import com.wb.modelo.Telefone;

public class ListarTodosClientes extends Listagem {
	private List<Cliente> clientes;

	public ListarTodosClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public void listar() {
		System.out.println("");
		System.out.println("Lista de todos os clientes:");
		for (Cliente cliente : clientes) {
			System.out.println("Nome: " + cliente.nome);
			System.out.println("Nome social: " + cliente.nomeSocial);
			System.out.println("Genero: " + cliente.genero);
			for(Telefone telefone: cliente.getTelefones()) {
				System.out.println("Telefone (DDD):" + telefone.getDdd());
				System.out.println("Telefone (Numero)" + telefone.getNumero());
			}
			System.out.println("CPF: " + cliente.getCpf().getValor());
			System.out.println("Data emissao CPF: " + cliente.getCpf().getDataEmissao());
			System.out.println("RG: " + cliente.getRgs().getValor());
			System.out.println("Data emissao RG: " + cliente.getRgs().getDataEmissao());
			System.out.println("--------------------------------------");
		}
		System.out.println("");
	}
}
