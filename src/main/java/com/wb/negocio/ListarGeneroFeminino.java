package com.wb.negocio;

import java.util.List;

import com.wb.io.Listagem;
import com.wb.modelo.Cliente;

public class ListarGeneroFeminino extends Listagem {
	
	private List<Cliente> clientes;
	
	public ListarGeneroFeminino(List<Cliente> clientes) {
		this.clientes = clientes;
	}	


	@Override
	public void listar() {
		System.out.println("");
		System.out.println("Lista de cliente por genero feminino:");
		for (Cliente cliente : clientes) 
			if(cliente.genero.equals("Feminino"))
			{
				System.out.println("Nome: " + cliente.nome);
				System.out.println("Genero: " + cliente.genero);
				System.out.println("");
			}
		}

	}

