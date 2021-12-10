package com.wb.negocio;


import java.util.List;
import com.wb.io.Editar;
import com.wb.io.Entrada;
import com.wb.io.Listagem;
import com.wb.modelo.Cliente;
import com.wb.modelo.Produto;

public class EditarProduto extends Editar {
	
	private List<Produto> produtos;
	private Entrada entrada;
	
	public EditarProduto(List<Produto> produtos) {
		this.produtos = produtos;
		this.entrada = new Entrada();
	}


	@Override
	public void editar() {
		System.out.println("");
		System.out.println("Edição de Produto:");
		System.out.println("Selecione o que voce deseja editar no produto:");
		System.out.println("1 - Nome");
		System.out.println("2 - Valor");
		
		Entrada entrada3 = new Entrada();
		int operacao3 = entrada3.receberNumeroInteiro();
		
		switch(operacao3) {
		case 1:
			System.out.println("");
			System.out.println("Edição do nome do produto");
			System.out.println("Digite o nome do produto para edita-lo:");
			String produtor = entrada.receberTexto();
			for(int i = 0; i < produtos.size(); i++) {
				Produto p = produtos.get(i);
				if(p.getProduto().equals(produtor))
				{
					System.out.println("Digite o novo nome para o produto:");
					String novonome = entrada.receberTexto();
					produtos.get(i).setNome(novonome);
					System.out.println("");
					break;
				}
			}
		case 2:
			System.out.println("");
			System.out.println("Edição do nome do produto");
			System.out.println("Digite o nome do produto para edita-lo:");
			String valorr = entrada.receberTexto();
			for(int i = 0; i < produtos.size(); i++) {
				Produto p = produtos.get(i);
				if(p.getProduto().equals(valorr))
				{
					System.out.println("Digite o novo valor para o produto:");
					Number novovalor = entrada.receberNumeroDouble();
					produtos.get(i).setValor(novovalor);
					System.out.println("");
					break;
				}
			}
			
		}

	}

}
