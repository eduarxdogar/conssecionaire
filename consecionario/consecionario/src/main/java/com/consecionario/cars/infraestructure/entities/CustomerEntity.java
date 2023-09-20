package com.consecionario.cars.infraestructure.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "customers")
@Data
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idcustomer")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "address")
    private String address;

    @Column(name = "telephoneStaff")
    private int telephoneStaff;

    @ManyToMany
    @JoinColumn(name = "conssecionaire_id")
    private List<CustomerEntity> clientList;

    @ManyToMany
    @JoinColumn(name = "tuition_id")
    private List<CarsEntity> carsList;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", telephoneStaff=" + telephoneStaff +
                ", clientList=" + clientList +
                ", carsList=" + carsList +
                '}';
    }
}
