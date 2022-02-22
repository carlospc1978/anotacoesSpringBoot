package br.com.seteideias.anotacoesspringboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${data.name.valor}")
    private String nomeVindoDoApplicationProperties;

    @GetMapping("/inicio")
    public String home(){
        return nomeVindoDoApplicationProperties;
    }

}
