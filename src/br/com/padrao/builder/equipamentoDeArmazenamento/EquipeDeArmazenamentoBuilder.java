package br.com.padrao.builder.equipamentoDeArmazenamento;

import java.math.BigDecimal;

public class EquipeDeArmazenamentoBuilder {
    private TipoDeEquipamentoDeArmazenamento tipoDeEquipamentoDeArmazenamento;
    private BigDecimal armazenamento;
    private String fabricante;
    private BigDecimal valor;

    public EquipeDeArmazenamentoBuilder addTipo(TipoDeEquipamentoDeArmazenamento tipoDeEquipamentoDeArmazenamento) {
        this.tipoDeEquipamentoDeArmazenamento = tipoDeEquipamentoDeArmazenamento;
        return this;
    }

    public EquipeDeArmazenamentoBuilder addArmazenamento(BigDecimal armazenamento) {
        this.armazenamento = armazenamento;
        return this;
    }

    public EquipeDeArmazenamentoBuilder addFabricante(String fabricante) {
        this.fabricante = fabricante;
        return this;
    }

    public EquipeDeArmazenamentoBuilder addValor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }

    public EquipamentoDeArmezenamento cria() {
        return new EquipamentoDeArmezenamento(tipoDeEquipamentoDeArmazenamento,armazenamento,fabricante,valor);
    }
}
