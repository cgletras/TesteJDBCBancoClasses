package model;

import java.io.Serializable;
import java.util.Date;


public class Lance implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idLance;
	private double valorLance;
	private Date dataLance;
	
	private Leilao leilao;
	private Usuario usuario;
	
	public Lance(Integer idLance, double valorLance, Date dataLance, Leilao leilao, Usuario usuario) {
		super();
		this.idLance = idLance;
		this.valorLance = valorLance;
		this.dataLance = dataLance;
		this.leilao = leilao;
		this.usuario = usuario;
	}

	public Integer getIdLance() {
		return idLance;
	}

	public void setIdLance(Integer idLance) {
		this.idLance = idLance;
	}

	public double getValorLance() {
		return valorLance;
	}

	public void setValorLance(double valorLance) {
		this.valorLance = valorLance;
	}

	public Date getDataLance() {
		return dataLance;
	}

	public void setDataLance(Date dataLance) {
		this.dataLance = dataLance;
	}

	public Leilao getLeilao() {
		return leilao;
	}

	public void setLeilao(Leilao leilao) {
		this.leilao = leilao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idLance == null) ? 0 : idLance.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lance other = (Lance) obj;
		if (idLance == null) {
			if (other.idLance != null)
				return false;
		} else if (!idLance.equals(other.idLance))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Lance [idLance=" + idLance + ", valorLance=" + valorLance + ", dataLance=" + dataLance + ", leilao="
				+ leilao + ", usuario=" + usuario + "]";
	}
}
