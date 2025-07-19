package com.fiap.substitutiva.application.usecase.estabelecimento.impl;

import com.fiap.substitutiva.application.usecase.endereco.BuscarEnderecoPorIdEstabelecimento;
import com.fiap.substitutiva.domain.entities.Endereco;
import com.fiap.substitutiva.domain.entities.Estabelecimento;
import com.fiap.substitutiva.domain.repositories.EstabelecimentoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
 class RegistrarEstabelecimentoImplTest {

    @Mock
    EstabelecimentoRepository estabelecimentoRepository;

    @Mock
    BuscarEnderecoPorIdEstabelecimento buscarEnderecoPorIdEstabelecimento;

    @InjectMocks
    RegistrarEstabelecimentoImpl registrarEstabelecimentoImpl;

    @Test
    void deveRegistrarEstabelecimentoComSucesso() {
        Estabelecimento estabelecimento = new Estabelecimento();
        estabelecimento.setId(1L);

        when(estabelecimentoRepository.existePorId(1L)).thenReturn(false);
        when(buscarEnderecoPorIdEstabelecimento.buscarPorIdEstabelecimento(1L)).thenReturn(new Endereco());
        when(estabelecimentoRepository.salvar(estabelecimento)).thenReturn(estabelecimento);

        Estabelecimento resultado = registrarEstabelecimentoImpl.registrarEstabelecimento(estabelecimento);

        assertNotNull(resultado);
        verify(estabelecimentoRepository).salvar(estabelecimento);
    }

    @Test
    void deveLancarExcecaoQuandoEstabelecimentoJaExiste() {
        Estabelecimento estabelecimento = new Estabelecimento();
        estabelecimento.setId(1L);

        when(estabelecimentoRepository.existePorId(1L)).thenReturn(true);

        assertThrows(IllegalStateException.class, () ->
                registrarEstabelecimentoImpl.registrarEstabelecimento(estabelecimento)
        );
    }

    @Test
    void deveLancarExcecaoQuandoEnderecoNaoExiste() {
        Estabelecimento estabelecimento = new Estabelecimento();
        estabelecimento.setId(1L);

        when(estabelecimentoRepository.existePorId(1L)).thenReturn(false);
        when(buscarEnderecoPorIdEstabelecimento.buscarPorIdEstabelecimento(1L)).thenReturn(null);

        assertThrows(IllegalStateException.class, () ->
                registrarEstabelecimentoImpl.registrarEstabelecimento(estabelecimento)
        );
    }


}
