package com.consecionario.cars.domain.models;


import lombok.Data;

@Data
public class Conssesionaire {
    private  Long id;


    private  String name;


    private String address;

    @Override
    public String toString() {
        return "Conssesionaire{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
