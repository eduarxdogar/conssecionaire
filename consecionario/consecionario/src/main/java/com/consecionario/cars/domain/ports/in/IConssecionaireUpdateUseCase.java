package com.consecionario.cars.domain.ports.in;

import com.consecionario.cars.domain.models.Conssesionaire;



import java.util.Optional;

public interface IConssecionaireUpdateUseCase {

    Optional<Conssesionaire> updateConssecionaire(Long id, Conssesionaire conssecionaire);

}
