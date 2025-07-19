package com.fiap.substitutiva.adapters.controllers.horario.mapper;

import com.fiap.substitutiva.adapters.controllers.horario.request.HorarioRequest;
import com.fiap.substitutiva.adapters.controllers.horario.response.HorarioResponse;
import com.fiap.substitutiva.domain.entities.Horario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface HorarioMapper {
    Horario toEntity(HorarioRequest request);

    HorarioResponse toResponse(Horario entity);
}
