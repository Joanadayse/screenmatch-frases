package br.com.alura.screenmatch_frases;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {
    @Autowired
    private  FraseService servico;

    @GetMapping("/series/frases")
    public FraseDTO obterFrasesAleatoria(){
        return servico.obterFraseAleatoria();


    }
}
