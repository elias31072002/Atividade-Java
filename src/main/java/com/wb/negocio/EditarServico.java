package com.wb.negocio;

import java.util.List;
import com.wb.io.Editar;
import com.wb.io.Entrada;
import com.wb.modelo.Servico;

public class EditarServico extends Editar {
	
	private List<Servico> servicos;
	private Entrada entrada;
	
	public EditarServico(List<Servico> servicos) {
		this.servicos = servicos;
		this.entrada = new Entrada();
	}
	
	
	@Override
	public void editar() {
		System.out.println("");
		System.out.println("Edição de Servico:");
		System.out.println("Selecione o que voce deseja editar no servico:");
		System.out.println("1 - Nome");
		System.out.println("2 - Valor");
		
		Entrada entrada4 = new Entrada();
		int operacao4 = entrada4.receberNumeroInteiro();
		
		switch(operacao4) {
		case 1:
			System.out.println("");
			System.out.println("Edição do nome do servico");
			System.out.println("Digite o nome do servico para edita-lo:");
			String nomer = entrada.receberTexto();
			for(int i = 0; i < servicos.size(); i++) {
				Servico p = servicos.get(i);
				if(p.getServico().equals(nomer))
				{
					System.out.println("Digite o novo nome para o servico:");
					String novonome = entrada.receberTexto();
					servicos.get(i).setNome(novonome);
					System.out.println("");
					break;
				}
			}
		case 2:
			System.out.println("");
			System.out.println("Edição do nome do servico");
			System.out.println("Digite o nome do servico para edita-lo:");
			String valorr = entrada.receberTexto();
			for(int i = 0; i < servicos.size(); i++) {
				Servico p = servicos.get(i);
				if(p.getServico().equals(valorr))
				{
					System.out.println("Digite o novo valor para o servico:");
					Number novovalor = entrada.receberNumeroDouble();
					servicos.get(i).setValor(novovalor);
					System.out.println("");
					break;
				}
			}
			
		}
		

	}

}
