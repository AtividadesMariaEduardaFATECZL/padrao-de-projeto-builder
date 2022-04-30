package br.com.padrao.builder.produto;

import java.math.BigDecimal;

public abstract class Produto {
    private BigDecimal valor;

    public Produto(BigDecimal valor) {
        this.valor = valor;
    }
}
