package com.fiap.substitutiva.adapters.controllers.estabelecimento.mapper;

import com.fiap.substitutiva.adapters.controllers.endereco.mapper.EnderecoMapper;
import com.fiap.substitutiva.adapters.controllers.estabelecimento.request.EstabelecimentoRequest;
import com.fiap.substitutiva.adapters.controllers.estabelecimento.response.EstabelecimentoResponse;
import com.fiap.substitutiva.adapters.controllers.horario.mapper.HorarioMapper;
import com.fiap.substitutiva.domain.entities.Estabelecimento;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = { EnderecoMapper.class, HorarioMapper.class })
public interface EstabelecimentoMapper {

    Estabelecimento toEntity(EstabelecimentoRequest request);

    EstabelecimentoResponse toResponse(Estabelecimento entity);
}
