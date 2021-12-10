package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.io.Remocao;
import com.wb.modelo.Produto;

public class RemoverProduto extends Remocao {
	
	private List<Produto> produtos;
	private Entrada entrada;
	
	public RemoverProduto(List<Produto> produtos) {
		this.produtos = produtos;
		this.entrada = new Entrada();
	}
	
	
	@Override
	public void remover() {
		System.out.println("Remoção de produto");
		System.out.println("Por favor informe o nome do produto:");
		String produtor = entrada.receberTexto();
		
		for(int i = 0; i < produtos.size(); i++) {
			Produto p = produtos.get(i);
			if(p.getProduto().equals(produtor))
			{
				produtos.remove(p);
				break;
			}
		}
		

	}

}