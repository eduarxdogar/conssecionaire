package com.consecionario.cars.domain.ports.out;

import com.consecionario.cars.domain.models.Conssesionaire;

import java.util.List;
import java.util.Optional;

public interface IConssecionaireRepositoryPort {

    Conssesionaire save(Conssesionaire conssecionaire);
    Optional<Conssesionaire> update(Conssesionaire conssecionaire);
    List<Conssesionaire> findAll();
    void deleteById(Long id);
    Optional<Conssesionaire> findDomainById(Long id);

}

