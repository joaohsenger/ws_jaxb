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
	

}
