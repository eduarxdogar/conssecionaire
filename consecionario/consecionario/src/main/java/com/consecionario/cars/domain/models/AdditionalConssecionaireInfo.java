package com.consecionario.cars.domain.models;

import lombok.Data;

public class AdditionalConssecionaireInfo {
    private final Long userId;

    private final String userName;

    private final String userEmail;

    public AdditionalConssecionaireInfo(Long userId, String userName, String userEmail) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "AdditionalConssecionaireInfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }
}
