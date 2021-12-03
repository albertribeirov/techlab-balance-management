package br.com.techlab.service;

import org.springframework.stereotype.Service;

import br.com.techlab.model.Pessoa;

@Service
public class MovimentacaoService {

	public void addSaldo(Pessoa pessoa, double saldo) {
		//TODO: Retorna ou apenas soma?
		pessoa.setSaldo(pessoa.getSaldo().plus(saldo));
		
	}

}
