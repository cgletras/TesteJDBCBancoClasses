package model;

import java.io.Serializable;
import java.util.Date;

public class Leilao  implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private int idLeilao, duracao;
	private Date dataInicio, dataFim;
	private double valorInicial, valorAtual, lancePadrao;
	
	public Leilao() {
		
	}

	
	
	
}
