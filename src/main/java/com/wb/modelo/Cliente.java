package com.wb.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	public String nome;
	public String novonome;
	public String novonomesocial;
	public String novogenero;
	public String cpfr;
	public String cpfr2;
	public String cpfr3;
	public String cpfr4;
	public String nomeSocial;
	public String genero;
	private CPF cpf;
	private RG rgs;
	private LocalDate dataCadastro;
	private List<Telefone> telefones;
	private List<Produto> produtosConsumidos;
	private List<Servico> servicosConsumidos;
	public Cliente(String nome, String nomeSocial, CPF cpf, String genero, RG rg) {
		this.nome = nome;
		this.nomeSocial = nomeSocial;
		this.genero = genero;
		this.cpf = cpf;
		this.rgs = rg;
		this.dataCadastro = LocalDate.now();
		this.telefones = new ArrayList<>();
		this.produtosConsumidos = new ArrayList<>();
		this.servicosConsumidos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}
	public CPF getCpf() {
		return cpf;
	}
	public RG getRgs() {
		return rgs;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public List<Produto> getProdutosConsumidos() {
		return produtosConsumidos;
	}
	public List<Servico> getServicosConsumidos() {
		return servicosConsumidos;
	}
	public void setNome(String novonome) {
		nome = novonome;
		
	}
	public void setNomeSocial(String novonomesocial) {
		nomeSocial = novonomesocial;
		
	}
	public void setGenero(String novogenero) {
		genero = novogenero;
	}
	
}