package com.example.mongui2;

import java.io.Serializable;

public class Multimedialugar implements Serializable {

    String tituloportada,descripcionportada;
    int fotoportada;

    public Multimedialugar(String tituloportada, String descripcionportada, int fotoportada) {
        this.tituloportada = tituloportada;
        this.descripcionportada = descripcionportada;
        this.fotoportada = fotoportada;
    }

    public String getTituloportada() {
        return tituloportada;
    }

    public void setTituloportada(String tituloportada) {
        this.tituloportada = tituloportada;
    }

    public String getDescripcionportada() {
        return descripcionportada;
    }

    public void setDescripcionportada(String descripcionportada) {
        this.descripcionportada = descripcionportada;
    }

    public int getFotoportada() {
        return fotoportada;
    }

    public void setFotoportada(int fotoportada) {
        this.fotoportada = fotoportada;
    }
}
