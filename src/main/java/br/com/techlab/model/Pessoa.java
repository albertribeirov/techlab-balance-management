package br.com.techlab.model;

import org.joda.money.Money;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@AllArgsConstructor
public class Pessoa {
	
	@Id
	private Long id;
	private Money saldo;
	
}
