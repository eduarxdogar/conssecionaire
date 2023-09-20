package com.consecionario.cars.domain.ports.in;

import com.consecionario.cars.domain.models.Conssesionaire;
import com.consecionario.cars.infraestructure.entities.ConssecionaireEntity;

public interface IConssecionaireCreateUseCase {

    Conssesionaire createConssecionaire(Conssesionaire conssecionaire);


}
