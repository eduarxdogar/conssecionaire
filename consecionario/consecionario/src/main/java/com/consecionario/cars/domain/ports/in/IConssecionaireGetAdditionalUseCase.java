package com.consecionario.cars.domain.ports.in;

import com.consecionario.cars.domain.models.AdditionalConssecionaireInfo;

public interface IConssecionaireGetAdditionalUseCase {

    AdditionalConssecionaireInfo getAdditionalConssecionaireInfo(Long id);

    boolean deleteConssecionaire(Long id);
}
