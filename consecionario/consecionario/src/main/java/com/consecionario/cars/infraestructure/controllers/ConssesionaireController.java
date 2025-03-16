package com.consecionario.cars.infraestructure.controllers;

import com.consecionario.cars.application.services.ConssecionaireService;
import com.consecionario.cars.domain.models.Conssesionaire;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/consecionario")
public class ConssesionaireController {

    private final ConssecionaireService conssecionaireService;


    public ConssesionaireController(ConssecionaireService conssecionaireService) {
        this.conssecionaireService = conssecionaireService;
    }

    @PostMapping
    public ResponseEntity <Conssesionaire>createConssecionaire(@RequestBody Conssesionaire conssesionaire){
        Conssesionaire createConssesionaire = conssecionaireService.createConssecionaire(conssesionaire);
        return  new ResponseEntity<>(createConssesionaire, HttpStatus.CREATED);

    }
}
