package com.wb;

import com.wb.io.Cadastro;
import com.wb.io.Editar;
import com.wb.io.Entrada;
import com.wb.io.Listagem;
import com.wb.io.Remocao;
import com.wb.modelo.Empresa;
import com.wb.negocio.CadastroCliente;
import com.wb.negocio.CadastroProduto;
import com.wb.negocio.CadastroServico;
import com.wb.negocio.EditarCliente;
import com.wb.negocio.EditarProduto;
import com.wb.negocio.EditarServico;
import com.wb.negocio.ListarClienteGenero;
import com.wb.negocio.ListarGeneroFeminino;
import com.wb.negocio.ListarGeneroMasculino;
import com.wb.negocio.ListarTodosClientes;
import com.wb.negocio.ListarTodosProdutos;
import com.wb.negocio.ListarTodosServicos;
import com.wb.negocio.RemoverCliente;
import com.wb.negocio.RemoverProduto;
import com.wb.negocio.RemoverServico;


public class App {
	public static void main(String[] args) {
		System.out.println("Bem-vindo ao cadastro de clientes do Grupo World Beauty");
		Empresa empresa = new Empresa();
		boolean execucao = true;
		while (execucao) {
			System.out.println("Que tipo de operação você deseja fazer:");
			System.out.println("1 - Cadastrar cliente");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Listar cliente por genero");
			System.out.println("4 - Cadastrar produto");
			System.out.println("5 - Listar produtos");
			System.out.println("6 - Cadastrar servico");
			System.out.println("7 - Listar servicos");
			System.out.println("8 - Remover cliente da lista");
			System.out.println("9 - Remover produto da lista");	
			System.out.println("10- Remover servico da lista");
			System.out.println("11- Editar cliente");
			System.out.println("12- Editar produto");
			System.out.println("13- Editar servico");
			System.out.println("14- Listar cliente por genero masculino:");
			System.out.println("15- Listar cliente por genero feminino:");
			System.out.println("0 - Sair");

			Entrada entrada = new Entrada();
			int operacao = entrada.receberNumeroInteiro();

			switch (operacao) {
			case 0:
				execucao = false;
				System.out.println("Até mais!\n");
				break;
			case 1:
				Cadastro cadastro = new CadastroCliente(empresa.getClientes());
				cadastro.cadastrar();
				break;
			case 2:
				Listagem listagem = new ListarTodosClientes(empresa.getClientes());
				listagem.listar();
				break;
			case 3:
				listagem = new ListarClienteGenero(empresa.getClientes());
				listagem.listar();
				break;
				
			case 4:
				cadastro = new CadastroProduto(empresa.getProdutos());
				cadastro.cadastrar();
				break;	
			case 5:
				listagem = new ListarTodosProdutos(empresa.getProdutos());
				listagem.listar();
				break;	
			case 6:
				cadastro = new CadastroServico(empresa.getServicos());
				cadastro.cadastrar();
				break;
			case 7:
				listagem = new ListarTodosServicos(empresa.getServicos());
				listagem.listar();
				break;	
			case 8:
				Remocao remocao = new RemoverCliente(empresa.getClientes());
				remocao.remover();
				break;	
			case 9:
				remocao = new RemoverProduto(empresa.getProdutos());
				remocao.remover();
				break;
			case 10: 
				remocao = new RemoverServico(empresa.getServicos());
				remocao.remover();
				break;
			case 11:
				Editar editar = new EditarCliente(empresa.getClientes());
				editar.editar();
				break;
			case 12:
				editar = new EditarProduto(empresa.getProdutos());
				editar.editar();
				break;
			case 13:
				editar = new EditarServico(empresa.getServicos());
				editar.editar();
				break;
			case 14:
				listagem = new ListarGeneroMasculino(empresa.getClientes());
				listagem.listar();
				break;
			case 15:
				listagem = new ListarGeneroFeminino(empresa.getClientes());
				listagem.listar();
				break;
			default:
				System.out.println("Operação não entendida");
			}
		}
	}
}