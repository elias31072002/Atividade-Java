package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.io.Remocao;
import com.wb.modelo.Servico;

public class RemoverServico extends Remocao {
	
	private List<Servico> servicos;
	private Entrada entrada;
	
	public RemoverServico(List<Servico> servicos) {
		this.servicos = servicos;
		this.entrada = new Entrada();
	}
	
	
	@Override
	public void remover() {
		
		System.out.println("Remocao de Servico");
		System.out.println("Por favor informe o nome do servico:");
		String servicor = entrada.receberTexto();
		
		for(int i= 0; i < servicos.size(); i++) {
			Servico p = servicos.get(i);
			if(p.getServico().equals(servicor))
			{
				servicos.remove(p);
				break;
			}
			
		}
		
		
	}

}
