package br.com.techlab.dto;

import br.com.techlab.model.Compra;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CompraDTO {
	
	private Long idPessoa;
	private Double valor;
	//private TipoMovimentacao tipoMovimentacao;
	
	public CompraDTO(Compra compra) {
		this.idPessoa = idPessoa;
		this.valor = valor;
	}
	
	
	
	
}
