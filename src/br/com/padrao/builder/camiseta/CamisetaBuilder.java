package br.com.padrao.builder.camiseta;

import java.math.BigDecimal;

public class CamisetaBuilder {
    private Tamanho tamanho;
    private String cor;
    private String marca;
    private BigDecimal valor;

    public CamisetaBuilder addTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
        return this;
    }

    public CamisetaBuilder addCor(String cor) {
        this.cor = cor;
        return this;
    }

    public CamisetaBuilder addMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public CamisetaBuilder valor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }

    public CamisetaBuilder addValor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }

    public Camiseta cria() {
        return new Camiseta(tamanho,cor,marca,valor);
    }

}
