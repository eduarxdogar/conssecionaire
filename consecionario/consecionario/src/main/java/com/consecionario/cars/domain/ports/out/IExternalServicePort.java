package com.consecionario.cars.domain.ports.out;


import com.consecionario.cars.domain.models.AdditionalConssecionaireInfo;
import com.consecionario.cars.domain.models.Conssesionaire;

public interface IExternalServicePort {

AdditionalConssecionaireInfo getAdditionalConssecionaireInfo(Long conssecionaireId);

public Conssesionaire save(Conssesionaire additionalConssesionaire);
}
