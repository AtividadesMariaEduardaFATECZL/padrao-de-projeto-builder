package br.com.padrao.builder.camiseta;

import br.com.padrao.builder.produto.Produto;

import java.math.BigDecimal;

public class Camiseta extends Produto {
    private Tamanho tamanho;
    private String cor;
    private String marca;

    public Camiseta(Tamanho tamanho, String cor, String marca, BigDecimal valor) {
        super(valor);
        this.tamanho = tamanho;
        this.cor = cor;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Camiseta{" +
                "tamanho=" + tamanho +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                "} " + super.toString();
    }
}
