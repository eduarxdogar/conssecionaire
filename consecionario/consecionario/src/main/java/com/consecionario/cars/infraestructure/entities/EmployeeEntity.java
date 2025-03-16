package com.consecionario.cars.infraestructure.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Employee")
@Data
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Employe")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "corporatephone")
    private int corporatePhone;

    @Column(name = "corporateemail")
    private String corporateEmail;

    @Column(name = "dateofadmission")
    private Date dateOfAdmission;

    @Column(name = "salary_base")
    private double salaryBase;

    @ManyToOne
    @JoinColumn(name = "conssecionaire_id", nullable = false)
    private ConssecionaireEntity conssecionaire;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SaleEntity> saleList;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", corporatePhone=" + corporatePhone +
                ", corporateEmail='" + corporateEmail + '\'' +
                ", dateOfAdmission=" + dateOfAdmission +
                ", salaryBase=" + salaryBase +
                ", conssecionaire=" + conssecionaire +
                ", saleList=" + saleList +
                '}';
    }
}