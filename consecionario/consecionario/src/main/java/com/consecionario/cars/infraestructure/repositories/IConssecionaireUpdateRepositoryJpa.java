package com.consecionario.cars.infraestructure.repositories;

import com.consecionario.cars.domain.models.Conssesionaire;
import com.consecionario.cars.domain.ports.out.IConssecionaireRepositoryPort;
import com.consecionario.cars.infraestructure.entities.ConssecionaireEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IConssecionaireUpdateRepositoryJpa extends JpaRepository<ConssecionaireEntity, Long> {

}