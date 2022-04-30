package br.com.padrao.builder.jogoEletronico;

import java.math.BigDecimal;

public class JogoEletronicoBuilder {
    private String nome;
    private VideoGame videoGame;
    private BigDecimal valor;

    public JogoEletronicoBuilder addNome(String nome) {
        this.nome = nome;
        return this;
    }

    public JogoEletronicoBuilder addVideoGame(VideoGame videoGame) {
        this.videoGame = videoGame;
        return this;
    }

    public JogoEletronicoBuilder addValor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }

    public JogoEletronico cria() {
        return new JogoEletronico(nome, videoGame, valor);
    }
}
