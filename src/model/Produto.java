package model;

public class Produto {

	private int id_produto, id_estado_produto, id_usuario, numero_paginas, peso;
	private String editora,	titulo,	formato_do_quadrinho, capa_imagem;
	
	public Produto(int id_produto, int id_estado_produto, int id_usuario, int numero_paginas, int peso, String editora,
			String titulo, String formato_do_quadrinho, String capa_imagem) {
		super();
		this.id_produto = id_produto;
		this.id_estado_produto = id_estado_produto;
		this.id_usuario = id_usuario;
		this.numero_paginas = numero_paginas;
		this.peso = peso;
		this.editora = editora;
		this.titulo = titulo;
		this.formato_do_quadrinho = formato_do_quadrinho;
		this.capa_imagem = capa_imagem;
	}
	
	public int getId_produto() {
		return id_produto;
	}
	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}
	public int getId_estado_produto() {
		return id_estado_produto;
	}
	public void setId_estado_produto(int id_estado_produto) {
		this.id_estado_produto = id_estado_produto;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public int getNumero_paginas() {
		return numero_paginas;
	}
	public void setNumero_paginas(int numero_paginas) {
		this.numero_paginas = numero_paginas;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getFormato_do_quadrinho() {
		return formato_do_quadrinho;
	}
	public void setFormato_do_quadrinho(String formato_do_quadrinho) {
		this.formato_do_quadrinho = formato_do_quadrinho;
	}
	public String getCapa_imagem() {
		return capa_imagem;
	}
	public void setCapa_imagem(String capa_imagem) {
		this.capa_imagem = capa_imagem;
	}	
}
