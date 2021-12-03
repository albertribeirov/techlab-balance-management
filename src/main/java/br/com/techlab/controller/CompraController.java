package br.com.techlab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.techlab.dto.CompraDTO;
import br.com.techlab.service.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {
	
	@Autowired
	private CompraService compraService;
	
	@PutMapping
	public void realizaMovimentacao(@RequestBody CompraDTO compraDto) {
		compraService.realizaMovimentacao(compraDto);
	}
}
