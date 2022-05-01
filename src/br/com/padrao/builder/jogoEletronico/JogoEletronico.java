package br.com.padrao.builder.jogoEletronico;

import br.com.padrao.builder.produto.Produto;

import java.math.BigDecimal;

public class JogoEletronico extends Produto {
    private String nome;
    private VideoGame videoGame;

    public JogoEletronico(String nome, VideoGame videoGame, BigDecimal valor) {
        super(valor);
        this.nome = nome;
        this.videoGame = videoGame;
    }

    @Override
    public String toString() {
        return "JogoEletronico{" +
                "nome='" + nome + '\'' +
                ", videoGame=" + videoGame +
                "} " + super.toString();
    }
}
