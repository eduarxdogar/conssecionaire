package com.consecionario.cars.domain.ports.in;

import com.consecionario.cars.domain.models.Conssesionaire;

import java.util.List;
import java.util.Optional;

public interface IConssecionaireRetriveUseCase {

    Optional<Conssesionaire>getConssecionaire(Long id);

    List<Conssesionaire> getAllConssecionaire();
}
