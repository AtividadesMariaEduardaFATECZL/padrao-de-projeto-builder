package br.com.padrao.builder.calcado;

import br.com.padrao.builder.produto.Produto;

import java.math.BigDecimal;

public class Calcado extends Produto {
    private double tamanho;
    private String cor;
    private TipoDeCalcado tipoDeCalcado;
    public Calcado(double tamanho, String cor, TipoDeCalcado tipoDeCalcado, BigDecimal valor) {
        super(valor);
        this.tamanho = tamanho;
        this.cor = cor;
        this.tipoDeCalcado = tipoDeCalcado;
    }

    @Override
    public String toString() {
        return "Calcado{" +
                "tamanho=" + tamanho +
                ", cor='" + cor + '\'' +
                ", tipoDeCalcado=" + tipoDeCalcado +
                "} " + super.toString();
    }
}
