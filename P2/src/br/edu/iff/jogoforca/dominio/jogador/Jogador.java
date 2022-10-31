package br.edu.iff.jogoforca.dominio.jogador;

import br.edu.iff.dominio.ObjetoDominioImpl;

public class Jogador extends ObjetoDominioImpl{

    private String nome;
    private int pontuacao = 0;
    
    public static Jogador criar(long id, String nome) {
        return new Jogador(id,nome);
    }
    
    public static Jogador reconstituir(long id, String nome, int pontuacao) {
        return new Jogador(id,nome,pontuacao);
    }
    
    public Jogador(long id, String nome) {
        super(id);
    }
    
    public Jogador(long id, String nome, int pontuacao) {
        super(id);
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    
    
    
}
