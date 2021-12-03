package br.com.techlab.model;

import org.joda.money.Money;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Document("compra")
public class Compra {
	
	@Id
	private Long id;
	private Long idPessoa;
	private Money valor;
	//private TipoMovimentacao tipoMovimentacao;
	
	
}
