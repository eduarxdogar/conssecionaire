package com.consecionario.cars.application.usecase;

import com.consecionario.cars.domain.models.Conssesionaire;
import com.consecionario.cars.domain.ports.in.IConssecionaireUpdateUseCase;
import com.consecionario.cars.domain.ports.out.IConssecionaireRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.Optional;


public class UpdateConssecionaireUseCaseImpl implements IConssecionaireUpdateUseCase {

    private final IConssecionaireRepositoryPort iConssecionaireUpdateRepositoryPort;

    @Autowired
    public UpdateConssecionaireUseCaseImpl(IConssecionaireRepositoryPort iConssecionaireUpdateRepositoryPort) {
        this.iConssecionaireUpdateRepositoryPort = iConssecionaireUpdateRepositoryPort;
    }


    @Override
    public Optional<Conssesionaire> updateConssecionaire(Long id, Conssesionaire conssecionaire) {
        return iConssecionaireUpdateRepositoryPort.update(conssecionaire);
    }
}
