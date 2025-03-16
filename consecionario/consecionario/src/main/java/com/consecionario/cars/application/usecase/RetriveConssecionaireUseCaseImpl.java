package com.consecionario.cars.application.usecase;

import com.consecionario.cars.domain.models.Conssesionaire;
import com.consecionario.cars.domain.ports.in.IConssecionaireRetriveUseCase;
import com.consecionario.cars.domain.ports.out.IConssecionaireRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetriveConssecionaireUseCaseImpl implements IConssecionaireRetriveUseCase {

    private final IConssecionaireRepositoryPort iConssecionaireRepositoryPort;

    public RetriveConssecionaireUseCaseImpl(IConssecionaireRepositoryPort iConssecionaireRepositoryPort) {
        this.iConssecionaireRepositoryPort = iConssecionaireRepositoryPort;
    }

    @Override
    public Optional<Conssesionaire> getConssecionaire(Long id) {
        return iConssecionaireRepositoryPort.findDomainById(id);
    }

    @Override
    public List<Conssesionaire> getAllConssecionaire() {
        return iConssecionaireRepositoryPort.findAll();
    }
}
