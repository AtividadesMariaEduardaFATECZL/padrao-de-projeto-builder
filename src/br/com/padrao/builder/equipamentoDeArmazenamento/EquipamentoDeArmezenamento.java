package br.com.padrao.builder.equipamentoDeArmazenamento;

import br.com.padrao.builder.produto.Produto;

import java.math.BigDecimal;

public class EquipamentoDeArmezenamento extends Produto {
    private TipoDeEquipamentoDeArmazenamento tipoDeEquipamentoDeArmazenamento;
    private BigDecimal armazenamento;
    private String fabricante;

    public EquipamentoDeArmezenamento(TipoDeEquipamentoDeArmazenamento tipoDeEquipamentoDeArmazenamento, BigDecimal armazenamento, String fabricante, BigDecimal valor) {
        super(valor);
        this.tipoDeEquipamentoDeArmazenamento = tipoDeEquipamentoDeArmazenamento;
        this.armazenamento = armazenamento;
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "EquipamentoDeArmezenamento{" +
                "tipoDeEquipamentoDeArmazenamento=" + tipoDeEquipamentoDeArmazenamento +
                ", armazenamento=" + armazenamento +
                ", fabricante='" + fabricante + '\'' +
                "} " + super.toString();
    }
}
