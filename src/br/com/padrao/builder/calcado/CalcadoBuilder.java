package br.com.padrao.builder.calcado;

import java.math.BigDecimal;

public class CalcadoBuilder {
    private double tamanho;
    private String cor;
    private TipoDeCalcado tipoDeCalcado;
    private BigDecimal valor;

    public CalcadoBuilder addTamanho(double tamanho) {
        this.tamanho = tamanho;
        return this;
    }

    public CalcadoBuilder addCor(String cor) {
        this.cor = cor;
        return this;
    }

    public CalcadoBuilder addTipo(TipoDeCalcado tipoDeCalcado) {
        this.tipoDeCalcado = tipoDeCalcado;
        return this;
    }

    public CalcadoBuilder addValor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }

    public Calcado cria() {
       return new Calcado(tamanho, cor, tipoDeCalcado, valor);
    }

}
