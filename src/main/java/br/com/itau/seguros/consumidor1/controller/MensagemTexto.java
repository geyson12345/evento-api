package br.com.itau.seguros.consumidor1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensagemTexto {

    @GetMapping("/hello")
    public String hello(){
         String msg= "Criando sua pepilene usando Jenkins com Git e Docke e";
         String parte = "Deploy no EC2 - Geyson ";
        return msg + "  " + parte;
    }

}
