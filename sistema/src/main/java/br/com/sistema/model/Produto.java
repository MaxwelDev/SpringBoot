package br.com.sistema.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "produto")
public class Produto {

	@Id
	@GeneratedValue
	private Long id;
	
	private String descricao;
	
	private int valor;
	
	private int codBarras;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(int quantidade) {
		this.codBarras = quantidade;
	}

}
