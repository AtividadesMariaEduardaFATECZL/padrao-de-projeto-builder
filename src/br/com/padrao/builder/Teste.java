package br.com.padrao.builder;

import br.com.padrao.builder.calcado.Calcado;
import br.com.padrao.builder.calcado.CalcadoBuilder;
import br.com.padrao.builder.calcado.TipoDeCalcado;
import br.com.padrao.builder.camiseta.Camiseta;
import br.com.padrao.builder.camiseta.CamisetaBuilder;
import br.com.padrao.builder.equipamentoDeArmazenamento.EquipamentoDeArmezenamento;
import br.com.padrao.builder.equipamentoDeArmazenamento.EquipeDeArmazenamentoBuilder;
import br.com.padrao.builder.equipamentoDeArmazenamento.TipoDeEquipamentoDeArmazenamento;
import br.com.padrao.builder.jogoEletronico.JogoEletronico;
import br.com.padrao.builder.jogoEletronico.JogoEletronicoBuilder;
import br.com.padrao.builder.jogoEletronico.VideoGame;
import br.com.padrao.builder.produto.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;

import static br.com.padrao.builder.camiseta.Tamanho.*;

public class Teste {
    public static void main(String[] args) {
        Calcado calcado1 = new CalcadoBuilder().addCor("verde")
                .addTamanho(40)
                .addTipo(TipoDeCalcado.SOCIAL)
                .addValor(new BigDecimal("120"))
                .addCor("Verde")
                .cria();

        Calcado calcado2 = new CalcadoBuilder().addCor("verde")
                .addTamanho(28)
                .addTipo(TipoDeCalcado.TENIS)
                .addValor(new BigDecimal("80"))
                .addCor("Amarelo")
                .cria();

        Calcado calcado3 = new CalcadoBuilder().addCor("verde")
                .addTamanho(40)
                .addTipo(TipoDeCalcado.TENIS)
                .addCor("Preto")
                .addValor(new BigDecimal("90"))
                .cria();

        Camiseta camiseta1 = new CamisetaBuilder().addCor("vermelha")
                .addMarca("marca do brás")
                .addTamanho(G)
                .addValor(new BigDecimal("40"))
                .cria();

        Camiseta camiseta2 = new CamisetaBuilder().addValor(new BigDecimal("20"))
                .addMarca("outra marca marota")
                .addTamanho(P)
                .addCor("rosa")
                .cria();

        Camiseta camiseta3 = new CamisetaBuilder()
                .addCor("preta")
                .addValor(new BigDecimal("20"))
                .addMarca("gucci")
                .addTamanho(GG)
                .cria();

        EquipamentoDeArmezenamento equipamentoDeArmazenamento1 = new EquipeDeArmazenamentoBuilder()
                .addFabricante("dell")
                .addArmazenamento(new BigDecimal("123123"))
                .addValor(new BigDecimal("140.00"))
                .addTipo(TipoDeEquipamentoDeArmazenamento.HDD)
                .cria();

        EquipamentoDeArmezenamento equipamentoDeArmazenamento2 = new EquipeDeArmazenamentoBuilder()
                .addFabricante("outro fabricante")
                .addArmazenamento(new BigDecimal("123123"))
                .addValor(new BigDecimal("140.00"))
                .addTipo(TipoDeEquipamentoDeArmazenamento.HDD)
                .cria();

        EquipamentoDeArmezenamento equipamentoDeArmazenamento3 = new EquipeDeArmazenamentoBuilder()
                .addFabricante("mais um randomico")
                .addArmazenamento(new BigDecimal("234"))
                .addValor(new BigDecimal("150.00"))
                .addTipo(TipoDeEquipamentoDeArmazenamento.MS)
                .cria();

        JogoEletronico jogo1 = new JogoEletronicoBuilder().addNome("god of war")
                .addValor(new BigDecimal("200"))
                .addVideoGame(VideoGame.PLAYSTATION)
                .cria();

        JogoEletronico jogo2 = new JogoEletronicoBuilder().addNome("outro jogo maneirao")
                .addValor(new BigDecimal("200"))
                .addVideoGame(VideoGame.SWITCH)
                .cria();

        JogoEletronico jogo3 = new JogoEletronicoBuilder().addNome("FIFA")
                .addValor(new BigDecimal("200"))
                .addVideoGame(VideoGame.XBOX)
                .cria();


        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(calcado1);
        produtos.add(calcado2);
        produtos.add(calcado3);
        produtos.add(camiseta1);
        produtos.add(camiseta2);
        produtos.add(camiseta3);
        produtos.add(equipamentoDeArmazenamento1);
        produtos.add(equipamentoDeArmazenamento2);
        produtos.add(equipamentoDeArmazenamento3);
        produtos.add(jogo1);
        produtos.add(jogo2);
        produtos.add(jogo3);

        produtos.forEach(p -> System.out.println(p.toString()));
    }
}
