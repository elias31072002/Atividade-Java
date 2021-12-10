package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.io.Remocao;
import com.wb.modelo.Cliente;

public class RemoverCliente extends Remocao {
	
	private List<Cliente> clientes;
	private Entrada entrada;
	
	public RemoverCliente(List<Cliente> clientes) {
		this.clientes = clientes;
		this.entrada = new Entrada();
	}

	@Override
	public void remover() {
		
		System.out.println("Remoção de cliente");
		System.out.println("Por favor informe o CPF do cliente:");
		String cpfr = entrada.receberTexto();	
		
		for(int i = 0; i < clientes.size(); i++)
		{
			Cliente p = clientes.get(i);
			if(p.getCpf().getValor().equals(cpfr))
			{
				clientes.remove(p);
				break;
			}
		}
		
	}

	
	
}
