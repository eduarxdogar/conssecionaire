package com.consecionario.cars.infraestructure.adpaters;

import com.consecionario.cars.domain.models.AdditionalConssecionaireInfo;
import com.consecionario.cars.domain.models.Conssesionaire;
import com.consecionario.cars.infraestructure.entities.ConssecionaireEntity;
import com.consecionario.cars.domain.ports.out.IExternalServicePort;
import lombok.Data;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class ExternalServiceAdapter implements IExternalServicePort {

    private final RestTemplate restTemplate;

    public ExternalServiceAdapter(){
        restTemplate = new RestTemplate();
    }

    @Override
    public AdditionalConssecionaireInfo getAdditionalConssecionaireInfo(Long conssecionaireId) {
        String apiUrl = "https://jsonplaceholder.typicode.com/todos/" + conssecionaireId;
        ResponseEntity<JsonPlaceHolderTodo> response = restTemplate.getForEntity(apiUrl, JsonPlaceHolderTodo.class);
        JsonPlaceHolderTodo todo = response.getBody();
        if (todo == null) {
            return null;
        }
        apiUrl = "https://jsonplaceholder.typicode.com/users/" + todo.getUserId();
        ResponseEntity<JsonPlaceHolderUser> userResponse = restTemplate.getForEntity(apiUrl,JsonPlaceHolderUser.class);
        JsonPlaceHolderUser user = userResponse.getBody();
        if (user == null) {
            return null;
        }
        return new AdditionalConssecionaireInfo(user.getId(), user.getName(), user.getEmail());
    }

    @Override
    public Conssesionaire save(Conssesionaire additionalConssesionaire) {
        return null;
    }

    @Data
    private static class JsonPlaceHolderTodo {

        private Long id;

        private String userId;


    }

        @Data
        public  static class JsonPlaceHolderUser{

        private  Long id;

        private String name;

        private String email;
        }
    }
