package com.fiap.substitutiva.adapters.controllers.endereco.mapper;

import com.fiap.substitutiva.adapters.controllers.endereco.request.EnderecoRequest;
import com.fiap.substitutiva.adapters.controllers.endereco.response.EnderecoResponse;
import com.fiap.substitutiva.domain.entities.Endereco;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EnderecoMapper {

    Endereco toEntity(EnderecoRequest request);

    EnderecoResponse toResponse(Endereco entity);
}