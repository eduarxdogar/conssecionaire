package com.consecionario.cars.infraestructure.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "sale")
@Data
public class SaleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "sale_id")
    private Long id;

    @Column(name = "saleprice")
    private double salePrice;

    @Column(name = "points")
    private int accumulatedPoints;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer;

    @ManyToOne
    @JoinColumn (name = "employee_id")
    private EmployeeEntity employee;


    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", salePrice=" + salePrice +
                ", accumulatedPoints=" + accumulatedPoints +
                ", customer=" + customer +
                ", employee=" + employee +
                '}';
    }
}
