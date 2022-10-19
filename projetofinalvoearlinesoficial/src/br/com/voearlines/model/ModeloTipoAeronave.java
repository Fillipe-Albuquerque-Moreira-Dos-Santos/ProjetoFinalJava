package br.com.voearlines.model;

public class ModeloTipoAeronave {

	private int id;
	private String descricao;

	public ModeloTipoAeronave() {

	}

	public ModeloTipoAeronave(String descricao) {
		super();
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
