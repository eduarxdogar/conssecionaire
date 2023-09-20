package com.consecionario.cars.application.usecase;

import com.consecionario.cars.domain.models.Conssesionaire;

import com.consecionario.cars.domain.ports.in.IConssecionaireCreateUseCase;
import com.consecionario.cars.domain.ports.out.IConssecionaireRepositoryPort;

public class CreateConssecionaireUseCaseImpl implements IConssecionaireCreateUseCase {

    private  final IConssecionaireRepositoryPort iConssecionaireRepositoryPort;

    public CreateConssecionaireUseCaseImpl(IConssecionaireRepositoryPort iConssecionaireRepositoryPort) {
        this.iConssecionaireRepositoryPort = iConssecionaireRepositoryPort;
    }

    @Override
    public Conssesionaire createConssecionaire(Conssesionaire conssecionaire) {
        return iConssecionaireRepositoryPort.save(conssecionaire);
    }
}
