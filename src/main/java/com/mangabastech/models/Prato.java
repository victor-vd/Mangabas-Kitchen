package com.mangabastech.models;

public class Prato {

    private String nomePrato;
    private int idMesa;

    public Prato(String nomePrato, int idMesa) {
        this.nomePrato = nomePrato;
        this.idMesa = idMesa;
    }

    public Prato() {

    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String Prato) {
        this.nomePrato = Prato;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int id) {
        this.idMesa = id;
    }
}