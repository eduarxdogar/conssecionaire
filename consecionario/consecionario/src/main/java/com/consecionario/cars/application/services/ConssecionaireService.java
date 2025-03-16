package com.consecionario.cars.application.services;

import com.consecionario.cars.domain.models.AdditionalConssecionaireInfo;
import com.consecionario.cars.domain.models.Conssesionaire;
import com.consecionario.cars.domain.ports.in.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConssecionaireService implements IConssecionaireUpdateUseCase, IConssecionaireCreateUseCase, IConssecionaireDeleteUseCase, IConssecionaireGetAdditionalUseCase, IConssecionaireRetriveUseCase {

    private final IConssecionaireUpdateUseCase iConssecionaireUpdateUseCase;
    private final IConssecionaireRetriveUseCase iConssecionaireRetriveUseCase;
    private final IConssecionaireDeleteUseCase iConssecionaireDeleteUseCase;
    private final IConssecionaireGetAdditionalUseCase iConssecionaireGetAdditionalUseCase;
    private final IConssecionaireCreateUseCase iConssecionaireCreateUseCase;

    public ConssecionaireService(IConssecionaireUpdateUseCase iConssecionaireUpdateUseCase, IConssecionaireRetriveUseCase iConssecionaireRetriveUseCase, IConssecionaireDeleteUseCase iConssecionaireDeleteUseCase, IConssecionaireGetAdditionalUseCase iConssecionaireGetAdditionalUseCase, IConssecionaireCreateUseCase iConssecionaireCreateUseCase) {
        this.iConssecionaireUpdateUseCase = iConssecionaireUpdateUseCase;
        this.iConssecionaireRetriveUseCase = iConssecionaireRetriveUseCase;
        this.iConssecionaireDeleteUseCase = iConssecionaireDeleteUseCase;
        this.iConssecionaireGetAdditionalUseCase = iConssecionaireGetAdditionalUseCase;
        this.iConssecionaireCreateUseCase = iConssecionaireCreateUseCase;
    }

    @Override
    public Optional<Conssesionaire> updateConssecionaire(Long id, Conssesionaire conssecionaire) {
        return iConssecionaireUpdateUseCase.updateConssecionaire(id, conssecionaire);
    }

    @Override
    public Conssesionaire createConssecionaire(Conssesionaire conssecionaire) {
        return iConssecionaireCreateUseCase.createConssecionaire(conssecionaire);
    }

    @Override
    public AdditionalConssecionaireInfo getAdditionalConssecionaireInfo(Long id) {
        return iConssecionaireGetAdditionalUseCase.getAdditionalConssecionaireInfo(id);
    }

    @Override
    public boolean deleteConssecionaire(Long id) {
        return iConssecionaireDeleteUseCase.deleteConssecionaire(id);
    }

    @Override
    public Optional<Conssesionaire> getConssecionaire(Long id) {
        return iConssecionaireRetriveUseCase.getConssecionaire(id);
    }

    @Override
    public List<Conssesionaire> getAllConssecionaire() {
        return iConssecionaireRetriveUseCase.getAllConssecionaire();
    }
}