package com.mangabastech.models;

import java.util.ArrayList;
import java.util.List;

public class Gerente {

    private List<Prato> pratos = new ArrayList<>();

    private String emailGerencia;
    private String senhaGerencia;
    private String codigoGerencia;

    public Gerente() {
        this.codigoGerencia = "";
    }

    public String getSenhaGerencia() {
        return senhaGerencia;
    }

    public void setSenhaGerencia(String senhaGerencia) {
        this.senhaGerencia = senhaGerencia;
    }

    public String getEmailGerencia() {
        return emailGerencia;
    }

    public void setEmailGerencia(String emailGerencia) {
        this.emailGerencia = emailGerencia;
    }

    public String getcodigoGerencia() {
        return codigoGerencia;
    }

    public void setcodigoGerencia(String codigoGerencia) {
        this.codigoGerencia = codigoGerencia;
    }

    public void cadastrarPrato(String prato) {
        pratos.add(new Prato());
    }

    public List<Prato> getPratos() {
        return pratos;
    }
}
