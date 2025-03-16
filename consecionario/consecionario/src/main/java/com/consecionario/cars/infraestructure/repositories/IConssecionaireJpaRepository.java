package com.consecionario.cars.infraestructure.repositories;

import com.consecionario.cars.infraestructure.entities.ConssecionaireEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConssecionaireJpaRepository extends JpaRepository<ConssecionaireEntity, Long> {
}
