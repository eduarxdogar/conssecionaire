package com.consecionario.cars.infraestructure.config;

import com.consecionario.cars.application.services.ConssecionaireService;
import com.consecionario.cars.application.usecase.*;
import com.consecionario.cars.domain.ports.in.*;
import com.consecionario.cars.domain.ports.out.IConssecionaireRepositoryPort;
import com.consecionario.cars.domain.ports.out.IExternalServicePort;
import com.consecionario.cars.infraestructure.adpaters.ExternalServiceAdapter;
import com.consecionario.cars.infraestructure.repositories.IConssecionaireUpdateRepositoryJpa;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public ConssecionaireService conssecionaireService(IConssecionaireRepositoryPort iConssecionaireRepositoryPort, IConssecionaireGetAdditionalUseCase iConssecionaireGetAdditionalUseCase) {
        return new ConssecionaireService(
                new UpdateConssecionaireUseCaseImpl(iConssecionaireRepositoryPort),
                new RetriveConssecionaireUseCaseImpl(iConssecionaireRepositoryPort),
                new DeleteConssecionaireUseCaseImpl(iConssecionaireRepositoryPort),
                iConssecionaireGetAdditionalUseCase,
                new CreateConssecionaireUseCaseImpl(iConssecionaireRepositoryPort)
        );
    }


    @Bean
    public IConssecionaireGetAdditionalUseCase getAdditionalUseCase(IExternalServicePort iExternalServicePort) {
        return new GetAdditionalConssecionaireUseCaseImpl(iExternalServicePort);
    }

    @Bean
    public IExternalServicePort iExternalServicePort() {
        return new ExternalServiceAdapter();
    }
}