package com.consecionario.cars.domain.ports.out;

import com.consecionario.cars.domain.models.Conssesionaire;

import java.util.List;
import java.util.Optional;

public interface IConssecionaireRepositoryPort {

    // Actualizar un consecionario
    Conssesionaire save(Conssesionaire conssecionaire);

    Optional<Conssesionaire> update(Conssesionaire conssecionaire);


    Optional<Conssesionaire>findById(Long id);

    List<Conssesionaire> finAll();

    boolean deleteById(Long id);
}
