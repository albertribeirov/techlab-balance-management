package br.com.techlab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.techlab.assembler.PessoaAssembler;
import br.com.techlab.dto.PessoaDTO;
import br.com.techlab.model.Pessoa;
import br.com.techlab.repository.PessoaRepository;
import br.com.techlab.service.MovimentacaoService;
import br.com.techlab.service.PessoaService;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired
	private MovimentacaoService movimentacaoService;

	@Autowired
	private PessoaRepository pessoaRepository;
	
	private final PessoaAssembler pessoaAssembler = new PessoaAssembler();
	
	@PutMapping
	public void addSaldo(@RequestBody PessoaDTO pessoaDto) {
		Pessoa pessoa =  pessoaAssembler.toEntity(pessoaDto);
		movimentacaoService.addSaldo(pessoa, pessoaDto.getSaldo());
		pessoaRepository.save(pessoa);
	}
}
