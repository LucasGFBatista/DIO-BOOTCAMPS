package com.lucasgfbatista.subsistema2.cep;

public class CepApi {
    private static final CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String recuperarCidade(String cep) {
        return "Salvador";
    }

    public String recuperarEstado(String cep) {
        return "Bahia";
    }
}
