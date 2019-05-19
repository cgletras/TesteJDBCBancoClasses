package model;

public class Usuario {
	
	private int id_usuario;
	private String nome, email, senha; 
	private String data_nascimento;
	private Boolean ativo;
	
	public Usuario(Integer id, String nome, String email, String senha, String data_nascimento, Boolean ativo) {
		super();
		this.id_usuario = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.data_nascimento = data_nascimento;
		this.ativo = ativo;
	}
			
	public Integer getId() {
		return id_usuario;
	}

	public void setId(Integer id) {
		this.id_usuario = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
}


