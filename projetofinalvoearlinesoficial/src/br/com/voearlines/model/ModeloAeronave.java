package br.com.voearlines.model;

public class ModeloAeronave {

	private int id;
	private String tipo;
	private String fabricante;
	private String modelo;
	private String codigo;

	public ModeloAeronave() {

	}

	public ModeloAeronave(String tipo, String fabricante, String modelo, String codigo) {
		super();
		this.tipo = tipo;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.codigo = codigo;
	}

	public int getId() {
		return id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
