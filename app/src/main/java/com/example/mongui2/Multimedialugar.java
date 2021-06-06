package com.example.mongui2;

import java.io.Serializable;

public class Multimedialugar implements Serializable {

    String tituloportada,descripcionportada,fotourl;

    public Multimedialugar(String tituloportada, String descripcionportada, String fotourl) {
        this.tituloportada = tituloportada;
        this.descripcionportada = descripcionportada;
        this.fotourl = fotourl;
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

    public String getFotourl() {
        return fotourl;
    }

    public void setFotourl(String fotourl) {
        this.fotourl = fotourl;
    }
}
