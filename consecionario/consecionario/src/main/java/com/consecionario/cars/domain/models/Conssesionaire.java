package com.consecionario.cars.domain.models;


import lombok.Data;

@Data
public class Conssesionaire {
    private  Long id;


    private  String name;


    private String address;

    public Conssesionaire(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    @Override
    public String toString() {
        return "Conssesionaire{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
