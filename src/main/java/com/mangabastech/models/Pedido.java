package com.mangabastech.models;

public class Pedido {

    private String nomeGarcom;
    private String nomePedido;
    private int idMesa;
    private String statusPedido;

    public Pedido(String nomeGarcom, String nomePedido, int idMesa) {
        this.nomeGarcom = nomeGarcom;
        this.nomePedido = nomePedido;
        this.idMesa = idMesa;
        this.statusPedido = "solicitado";
    }

    public String getNomeGarcom() {
        return nomeGarcom;
    }

    public void setNomeGarcom(String garcom) {
        this.nomeGarcom = garcom;
    }

    public String getNomePedido() {
        return nomePedido;
    }

    public void setNomePedido(String pedido) {
        this.nomePedido = pedido;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int id) {
        this.idMesa = id;
    }

    public String getStatus() {
        return statusPedido;
    }

    public void setStatus(String status) {
        this.statusPedido = status;
    }
}
