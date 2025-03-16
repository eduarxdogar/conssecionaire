package com.consecionario.cars.infraestructure.adpaters;

import com.consecionario.cars.domain.models.Conssesionaire;
import com.consecionario.cars.domain.ports.out.IConssecionaireRepositoryPort;
import com.consecionario.cars.infraestructure.entities.ConssecionaireEntity;
import com.consecionario.cars.infraestructure.repositories.IConssecionaireJpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class ConssecionaireRepositoryAdapter implements IConssecionaireRepositoryPort {

    private final IConssecionaireJpaRepository jpaRepository;

    public ConssecionaireRepositoryAdapter(IConssecionaireJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Conssesionaire save(Conssesionaire conssecionaire) {
        // Convertir el modelo de dominio a entidad
        ConssecionaireEntity entity = convertToEntity(conssecionaire);
        // Guardar la entidad con Spring Data JPA
        ConssecionaireEntity savedEntity = jpaRepository.save(entity);
        // Convertir la entidad guardada de nuevo a modelo de dominio
        return convertEntityToModel(savedEntity);
    }

    @Override
    public Optional<Conssesionaire> update(Conssesionaire conssecionaire) {
        // Buscar la entidad por su ID
        Optional<ConssecionaireEntity> optionalEntity = jpaRepository.findById(conssecionaire.getId());
        if (optionalEntity.isPresent()) {
            ConssecionaireEntity entityToUpdate = optionalEntity.get();
            // Actualizar los campos necesarios, por ejemplo:
            entityToUpdate.setName(conssecionaire.getName());
            // Actualiza aquí otros campos según tus necesidades
            ConssecionaireEntity updatedEntity = jpaRepository.save(entityToUpdate);
            return Optional.of(convertEntityToModel(updatedEntity));
        }
        return Optional.empty();
    }

    @Override
    public List<Conssesionaire> findAll() {
        // Recupera todas las entidades y las convierte al modelo de dominio
        return jpaRepository.findAll().stream()
                .map(this::convertEntityToModel)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long id) {
        // Delegar la eliminación en el repositorio JPA
        jpaRepository.deleteById(id);
    }

    @Override
    public Optional<Conssesionaire> findDomainById(Long id) {
        // Buscar la entidad por ID y convertirla si se encuentra
        return jpaRepository.findById(id)
                .map(this::convertEntityToModel);
    }

    // Conversión de modelo de dominio a entidad
    private ConssecionaireEntity convertToEntity(Conssesionaire model) {
        return new ConssecionaireEntity(model.getId(), model.getName(), model.getAddress());
    }

    // Conversión de entidad a modelo de dominio
    private Conssesionaire convertEntityToModel(ConssecionaireEntity entity) {
        return new Conssesionaire(entity.getId(), entity.getName(), entity.getAddress());
    }
}
