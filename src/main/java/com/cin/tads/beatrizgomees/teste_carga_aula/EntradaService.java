package com.cin.tads.beatrizgomees.teste_carga_aula;

import com.cin.tads.beatrizgomees.teste_carga_aula.model.Entrada;
import org.springframework.stereotype.Service;
import java.util.Random;
import java.time.LocalDateTime;


@Service
public class EntradaService {
    private final Random random = new Random();
    private double safe(Double valor) {
        return valor == null ? (1 + random.nextInt(100)) : valor;
    }
    public void calcularMetricas(Entrada e) {
        double v1 = e.getValor1();
        double v2 = e.getValor2();
        double v3 = e.getValor3();
        double v4 = e.getValor4();

        double soma = v1 + v2 + v3 + v4;
        double media = soma / 4.0;

        double desvio = Math.sqrt((Math.pow(v1 - media, 2)
                + Math.pow(v2 - media, 2)
                + Math.pow(v3 - media, 2)
                + Math.pow(v4 - media, 2)) / 4.0);



        e.setSoma(soma);
        e.setMedia(media);
        e.setDesvio(desvio);


    }
}
