package model;

import java.util.Date;

public class Leilao {

	private int id_leilao, id_estado_leilao, id_produto, id_usuario, duracao;
	private Date data_inicio, data_fim;
	private double valor_inicial, valor_atual, lance_padrao;
	
	public Leilao(int id_leilao, int id_estado_leilao, int id_produto, int id_usuario, int duracao, Date data_inicio,
			Date data_fim, double valor_inicial, double valor_atual, double lance_padrao) {
		super();
		this.id_leilao = id_leilao;
		this.id_estado_leilao = id_estado_leilao;
		this.id_produto = id_produto;
		this.id_usuario = id_usuario;
		this.duracao = duracao;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.valor_inicial = valor_inicial;
		this.valor_atual = valor_atual;
		this.lance_padrao = lance_padrao;
	}
	public int getId_leilao() {
		return id_leilao;
	}
	public void setId_leilao(int id_leilao) {
		this.id_leilao = id_leilao;
	}
	public int getId_estado_leilao() {
		return id_estado_leilao;
	}
	public void setId_estado_leilao(int id_estado_leilao) {
		this.id_estado_leilao = id_estado_leilao;
	}
	public int getId_produto() {
		return id_produto;
	}
	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public Date getData_inicio() {
		return data_inicio;
	}
	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}
	public Date getData_fim() {
		return data_fim;
	}
	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}
	public double getValor_inicial() {
		return valor_inicial;
	}
	public void setValor_inicial(double valor_inicial) {
		this.valor_inicial = valor_inicial;
	}
	public double getValor_atual() {
		return valor_atual;
	}
	public void setValor_atual(double valor_atual) {
		this.valor_atual = valor_atual;
	}
	public double getLance_padrao() {
		return lance_padrao;
	}
	public void setLance_padrao(double lance_padrao) {
		this.lance_padrao = lance_padrao;
	}	
}
