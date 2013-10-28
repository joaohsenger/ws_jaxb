package client;
import java.io.IOException;

import model.Endereco;
import model.Pessoa;

public class HttpCliente {
	
	public static void main(String[] args) throws IOException {
		
		Endereco endereco = new Endereco();
		endereco.setBairro("parkao");
		endereco.setCep("85884-000");
		endereco.setCidade("Medianeira");
		endereco.setComplemento("enjoy");
		endereco.setNumero(4251);
		endereco.setLogradouro("Av. Brasil");
		 	
		Pessoa pessoa = new Pessoa();
		pessoa.setId(1);
		pessoa.setNome("juca");
		pessoa.setEndereco(endereco);
		
		
		//marshal,implementar no servidor
		
		
		//unmarchal, implementar no servidor
		
	}

}
