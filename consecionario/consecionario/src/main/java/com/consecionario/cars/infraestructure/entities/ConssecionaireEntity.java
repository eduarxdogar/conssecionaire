package com.consecionario.cars.infraestructure.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Conssecionaire")
@Data
@NoArgsConstructor
public class ConssecionaireEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("Conssecionaire_id")
    @Column(name = "Conssecionaire_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "conssecionaire", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CarsEntity>  carsList = new ArrayList<>();

    @OneToMany(mappedBy = "conssecionaire", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EmployeeEntity>  employeeList = new ArrayList<>();

    public ConssecionaireEntity(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }



    @Override
    public String toString() {
        return "Conssecionaire{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", carsList=" + carsList +
                ", employeeList=" + employeeList +
                '}';
    }
}