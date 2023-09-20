package com.consecionario.cars.infraestructure.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Conssecionaire")
@Data
public class ConssecionaireEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Conssecionaire_id")
    private  Long id;

    @Column(name = "name")
    private  String name;

    @Column(name = "address")
    private String address;


    @OneToMany(mappedBy = "Conssecionaire")
    private List<CarsEntity> carsList;

    @OneToMany(mappedBy = "Conssecionaire")
    private List<EmployeeEntity> employeeList;

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
