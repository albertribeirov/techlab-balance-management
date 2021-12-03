package br.com.techlab.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.techlab.dto.PessoaDTO;
import br.com.techlab.model.Pessoa;
import br.com.techlab.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PessoaAssembler {

	@Autowired
	private PessoaRepository pessoaRepository;
	private ModelMapper modelMapper;

	public final PessoaDTO toDTO(Pessoa usuario) {
		return modelMapper.map(usuario, PessoaDTO.class);
	}

	//TODO: Subtende-se que tem sempre uma pessoa? 
	public final Pessoa toEntity(PessoaDTO pessoaDTO) {
		 return pessoaRepository.findById(pessoaDTO.getId()).get();
	}

}