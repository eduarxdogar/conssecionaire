package com.consecionario.cars.domain.models;

import lombok.Data;

@Data
public class AdditionalConssecionaireInfo {
    private final Long userId;

    private final String userName;

    private final String userEmail;

    @Override
    public String toString() {
        return "AdditionalConssecionaireInfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }
}
