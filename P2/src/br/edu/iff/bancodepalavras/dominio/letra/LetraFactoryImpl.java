package br.edu.iff.bancodepalavras.dominio.letra;


public abstract class LetraFactoryImpl {
    
    private Letra encoberta = null;
    private Letra[] pool = null;

    protected LetraFactoryImpl() {
        this.encoberta = null;
        this.pool = new Letra[26]; // pool representa o range das letras(A-Z)
    }
    
    public final Letra getLetra(char codigo) {
        int i = codigo - 'a';
        Letra resposta = this.pool[i]; // criação das letras
        if (resposta == null) {
          resposta = this.criarLetra(codigo); 
          this.pool[i] = resposta;
        }
        return resposta;
    }
    
    public final Letra getLetraEncoberta() {
        if (encoberta == null) {
            char codigo = '#';
            this.encoberta = criarLetra(codigo); // criar ícone # para letras encobertas
          }
          return this.encoberta;
        }
    
    protected abstract Letra criarLetra(char codigo);
    
    
}
