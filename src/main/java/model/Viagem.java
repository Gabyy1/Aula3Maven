package model;

public class Viagem {
	private int codigo;
	private String placaOnibus;
	private int codigoMotorista;
	private int saida;
	private int chegada;
	private String partida;
	private String destino;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getPlacaOnibus() {
		return placaOnibus;
	}
	public void setPlacaOnibus(String placaOnibus) {
		this.placaOnibus = placaOnibus;
	}
	public int getCodigoMotorista() {
		return codigoMotorista;
	}
	public void setCodigoMotorista(int codigoMotorista) {
		this.codigoMotorista = codigoMotorista;
	}
	public int getSaida() {
		return saida;
	}
	public void setSaida(int saida) {
		this.saida = saida;
	}
	public int getChegada() {
		return chegada;
	}
	public void setChegada(int chegada) {
		this.chegada = chegada;
	}
	public String getPartida() {
		return partida;
	}
	public void setPartida(String psrtida) {
		this.partida = psrtida;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	@Override
	public String toString() {
		return "Viagem [codigo=" + codigo + ", placaOnibus=" + placaOnibus + ", codigoMotorista=" + codigoMotorista
				+ ", saida=" + saida + ", chegada=" + chegada + ", psrtida=" + partida + ", destino=" + destino + "]";
	}
	
	
	
	
	
	

}
