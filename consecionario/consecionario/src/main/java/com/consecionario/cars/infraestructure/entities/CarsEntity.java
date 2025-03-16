package com.consecionario.cars.infraestructure.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "cars")
@Data
public class CarsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tuition")
    private Long id;

    @Column(name = "fueltype")
    private String fuelType;

    @Column(name = "carbrands")
    private String carBrands;

    @Column(name = "yearofprodution")
    private int yearOfProdution;

    @Column(name = "newprice")
    private double newPrice;

    @Column(name = "usedprice")
    private double usedPrice;

    @ManyToOne
    @JoinColumn(name = "conssecionaire_id", nullable = false)
    private ConssecionaireEntity conssecionaire;

    @Override
    public String toString() {
        return "Cars{" +
                "id=" + id +
                ", fuelType='" + fuelType + '\'' +
                ", carBrands='" + carBrands + '\'' +
                ", yearOfProdution=" + yearOfProdution +
                ", newPrice=" + newPrice +
                ", usedPrice=" + usedPrice +
                ", conssecionaire=" + conssecionaire +
                '}';
    }
}