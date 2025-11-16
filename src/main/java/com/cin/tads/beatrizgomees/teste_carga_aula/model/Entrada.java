package com.cin.tads.beatrizgomees.teste_carga_aula.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Entrada {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double valor1;
    private Double valor2;
    private Double valor3;
    private Double valor4;
    private Double media;
    private Double soma;
    private Double desvio;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValor1() {
        return valor1;
    }

    public void setValor1(Double valor1) {
        this.valor1 = valor1;
    }

    public Double getValor2() {
        return valor2;
    }

    public void setValor2(Double valor2) {
        this.valor2 = valor2;
    }

    public Double getValor3() {
        return valor3;
    }

    public void setValor3(Double valor3) {
        this.valor3 = valor3;
    }

    public Double getValor4() {
        return valor4;
    }

    public void setValor4(Double valor4) {
        this.valor4 = valor4;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public Double getSoma() {
        return soma;
    }

    public void setSoma(Double soma) {
        this.soma = soma;
    }

    public Double getDesvio() {
        return desvio;
    }

    public void setDesvio(Double desvio) {
        this.desvio = desvio;
    }



    // getters e setters
}
