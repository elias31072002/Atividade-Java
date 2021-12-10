package com.wb.modelo;

public class Produto {
	public String nome;
	public String produtor;
	public Number valorr;
	public String novonome;
	public Number novovalor;
	public Number valor;
	public Produto(String nome, Number valor) {
		this.nome = nome;
		this.valor = valor;
	}
	public String getProduto() {
		return nome;
	}
	public Number getValor() {
		return valor;
	}
	
	public void setNome(String novonome) {
		nome = novonome;
				
	}
	public void setValor(Number novovalor) {
		valor = novovalor;
	}
}

