package br.com.techlab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.techlab.dto.CompraDTO;
import br.com.techlab.repository.CompraRepository;
import br.com.techlab.repository.PessoaRepository;

@Service
public class CompraService{
	
	@Autowired
	public CompraRepository compraRepository;

	@Autowired
	public PessoaRepository pessoaRepository;

	public void verificarSaldoCompra(CompraDTO compraDTO){
		//buscar o saldo de pessoa
		//retorna pessoa e faço validação
	}
	
	public void comprar(CompraDTO compraDTO) {
		
	}


	public void realizaMovimentacao(CompraDTO compraDto) {
		
		//if() {
			
		//}
		
		// verifica saldo
		// verifica tipo
		// compra / reembolso
		
	}
	
}
