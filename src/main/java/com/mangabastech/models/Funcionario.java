package com.mangabastech.models;

public class Funcionario {

    private String nomeFuncionario;
    private int cpfFuncionario;
    private String emailFuncionario;
    private String enderecoFuncionario;
    private String codigoFuncionario;

    public Funcionario(String nome, int cpf, String email, String endereco, String codigo) {
        this.nomeFuncionario = nome;
        this.cpfFuncionario = cpf;
        this.emailFuncionario = email;
        this.enderecoFuncionario = endereco;
        this.codigoFuncionario = codigo;
    }

    // Getter e Setter para nomeFuncionario
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    // Getter e Setter para cpfFuncionario
    public int getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(int cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    // Getter e Setter para emailFuncionario
    public String getEmailFuncionario() {
        return emailFuncionario;
    }

    public void setEmailFuncionario(String emailFuncionario) {
        this.emailFuncionario = emailFuncionario;
    }

    // Getter e Setter para enderecoFuncionario
    public String getEnderecoFuncionario() {
        return enderecoFuncionario;
    }

    public void setEnderecoFuncionario(String enderecoFuncionario) {
        this.enderecoFuncionario = enderecoFuncionario;
    }

    // Getter e Setter para codigoFuncionario
    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }
}
