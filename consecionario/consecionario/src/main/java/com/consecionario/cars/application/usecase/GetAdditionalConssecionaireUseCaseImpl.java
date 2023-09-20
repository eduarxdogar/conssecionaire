package com.consecionario.cars.application.usecase;

import com.consecionario.cars.domain.models.AdditionalConssecionaireInfo;
import com.consecionario.cars.domain.ports.in.IConssecionaireGetAdditionalUseCase;
import com.consecionario.cars.domain.ports.out.IExternalServicePort;

public class GetAdditionalConssecionaireUseCaseImpl implements IConssecionaireGetAdditionalUseCase {

   private final IExternalServicePort iExternalServicePort;

    public GetAdditionalConssecionaireUseCaseImpl(IExternalServicePort iExternalServicePort) {
        this.iExternalServicePort = iExternalServicePort;
    }

    @Override
    public AdditionalConssecionaireInfo getAdditionalConssecionaireInfo(Long id) {
        return iExternalServicePort.getAdditionalConssecionaireInfo(id);
    }

    @Override
    public boolean deleteConssecionaire(Long id) {
        return false;
    }
}
