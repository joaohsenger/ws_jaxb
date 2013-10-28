package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement(name="pessoa")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="pessoa", propOrder={"id", "nome", "endereco"})

public class Pessoa {
	
	

	@XmlElement(name="id", required=true)
	private int id;
	@XmlElement(name="nome", required=true)
	private String nome;
	@XmlElement(name="endereco", required=true)
	private Endereco endereco;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	

}
