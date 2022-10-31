package br.edu.iff.jogoforca.dominio.jogador;

import br.edu.iff.bancodepalavras.dominio.tema.Tema;

public interface JogadorFactory {

    public Jogador getJogador(String nome);
}
