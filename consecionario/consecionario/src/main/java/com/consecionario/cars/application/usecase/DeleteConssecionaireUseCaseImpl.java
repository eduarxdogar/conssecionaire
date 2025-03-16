package com.consecionario.cars.application.usecase;

import com.consecionario.cars.domain.ports.in.IConssecionaireDeleteUseCase;
import com.consecionario.cars.domain.ports.out.IConssecionaireRepositoryPort;

public class DeleteConssecionaireUseCaseImpl implements IConssecionaireDeleteUseCase {

    private final IConssecionaireRepositoryPort iConssecionaireRepositoryPort;

    public DeleteConssecionaireUseCaseImpl(IConssecionaireRepositoryPort iConssecionaireRepositoryPort) {
        this.iConssecionaireRepositoryPort = iConssecionaireRepositoryPort;
    }


    @Override
    public boolean deleteConssecionaire(Long id) {
        iConssecionaireRepositoryPort.deleteById(id);
        return true; // Asumiendo que la eliminación fue exitosa o agregas manejo de excepciones
    }
}
