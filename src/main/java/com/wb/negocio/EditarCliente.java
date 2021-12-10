package com.wb.negocio;

import java.util.List;

import com.wb.io.Editar;
import com.wb.modelo.Cliente;
import com.wb.io.Entrada;


public class EditarCliente extends Editar {
	

	private List<Cliente> clientes;
	private Entrada entrada;
	
	public EditarCliente(List<Cliente> clientes) {
		this.clientes = clientes;
		this.entrada = new Entrada();

	}
	

	public void editar() {
		
		System.out.println("Edição de cliente");
		System.out.println("Selecione o que voce deseja editar no cliente:");
		System.out.println("1 - Nome");
		System.out.println("2 - Nome Social");
		System.out.println("3 - Telefone");
		System.out.println("4 - Genero");
		
		Entrada entrada2 = new Entrada();
		int operacao2 = entrada2.receberNumeroInteiro();

		switch (operacao2) {
		case 1:
			System.out.println("Digite o CPF do cliente para editar o nome:");
			String cpfr = entrada.receberTexto();
			for(int i = 0; i < clientes.size(); i++) {
				Cliente p = clientes.get(i);
				if(p.getCpf().getValor().equals(cpfr))
				{
					System.out.println("Digite o novo nome para o cliente:");
					String novonome = entrada.receberTexto();
					clientes.get(i).setNome(novonome);
					System.out.println("");
				}
			}
			break;
		case 2:
			System.out.println("Digite o CPF do cliente para alterar o nome social:");
			String cpfr2 = entrada.receberTexto();
			for(int i = 0; i < clientes.size(); i++) {
				Cliente p = clientes.get(i);
				if(p.getCpf().getValor().equals(cpfr2))
				{
					System.out.println("Digite o novo nome social para o cliente:");
					String novonomesocial = entrada.receberTexto();
					clientes.get(i).setNomeSocial(novonomesocial);
					System.out.println("");
				}
			}
			break;
			
		case 3: 
			System.out.println("Digite o CPF do cliente para alterar o telefone:");
			String cpfr3 = entrada.receberTexto();
			for(int i = 0; i < clientes.size(); i++) {
				Cliente p = clientes.get(i);
				if(p.getCpf().getValor().equals(cpfr3))
				{
					System.out.println("Digite o novo DDD do telefone:");
					String novoddd = entrada.receberTexto();
					clientes.get(i).getTelefones().get(i).setDdd(novoddd);
					System.out.println("");
					System.out.println("Digite o novo numero do telefone:");
					String novonumero = entrada.receberTexto();
					clientes.get(i).getTelefones().get(i).setNumero(novonumero);
					System.out.println("");
					
				}
			}
		case 4:
			System.out.println("Digite o CPF do cliente para alterar o telefone:");
			String cpfr4 = entrada.receberTexto();
			for(int i = 0; i < clientes.size(); i++) {
				Cliente p = clientes.get(i);
				if(p.getCpf().getValor().equals(cpfr4))
				{
					System.out.println("Digite o novo genero do cliente:");
					String novogenero = entrada.receberTexto();
					clientes.get(i).setGenero(novogenero);
					System.out.println("");
					
				}
				
				
			}
			
		}
	
		
		
		
	}
}
		
	
