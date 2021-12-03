package br.com.techlab.assembler;

import br.com.techlab.dto.CompraDTO;
import br.com.techlab.model.Compra;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CompraAssembler {

    private ModelMapper modelMapper;

    public final CompraDTO toDTO(Compra usuario) {
        return modelMapper.map(usuario, CompraDTO.class);
    }


    public final Compra toEntity(CompraDTO compraDTO) {
        Compra compra = modelMapper.map(compraDTO, Compra.class);
        return compra;
    }


}
