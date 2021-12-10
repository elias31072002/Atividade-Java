package com.wb.modelo;

public class Servico {
	public String nome;
	public String nomer;
	public String novonome;
	public String valorr;
	public Number novovalor;
	public Number valor;
	public String servicor;
	public Servico(String nome, Number valor) {
		this.nome = nome;
		this.valor = valor;
	}
	public String getServico() {
		return nome;
	}
	public void setNome(String novonome) {
		nome = novonome;
		
	}
	public void setValor(Number novovalor){
		valor = novovalor;
	}
}