package com.cin.tads.beatrizgomees.teste_carga_aula;

import com.cin.tads.beatrizgomees.teste_carga_aula.EntradaService;
import com.cin.tads.beatrizgomees.teste_carga_aula.model.Entrada;
import com.cin.tads.beatrizgomees.teste_carga_aula.repository.EntradaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class EntradaController {

    @Autowired
    private EntradaRepository repository;

    @Autowired
    private EntradaService service;




    @PostMapping("enviarjava2")
    public Entrada enviar(@RequestBody Entrada entrada) {

        long inicio = System.currentTimeMillis();

        service.calcularMetricas(entrada);
        Entrada salvo = repository.save(entrada);

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;

        System.out.println("Tempo da requisição: " + tempo + "ms");

        return salvo;
    }


    @GetMapping("/todas")
    public List<Entrada> listarTodas() {
        return repository.findAll();
    }

}
