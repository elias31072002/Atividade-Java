package com.wb.negocio;

import java.util.List;

import com.wb.io.Listagem;
import com.wb.modelo.Cliente;

public class ListarClienteGenero extends Listagem {
	private List<Cliente> clientes;
	

	
	public ListarClienteGenero(List<Cliente> clientes) {
		this.clientes = clientes;

	}



	@Override
	public void listar() {
		System.out.println("");
		System.out.println("Lista de cliente por genero:");
		for (Cliente cliente : clientes) {
			System.out.println("Nome:" + cliente.nome);
			System.out.println("Genero:" + cliente.genero);
			System.out.println("--------------------------------------");
		}
		
	}
	
	

}
