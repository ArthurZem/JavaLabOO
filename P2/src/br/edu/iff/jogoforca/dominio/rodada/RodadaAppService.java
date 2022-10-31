package br.edu.iff.jogoforca.dominio.rodada;


public class RodadaAppService {

    private static RodadaAppService soleInstance;
    
    public static void createSoleInstance(RodadaFactory rodadaFactory, RodadaRepository rodadaRepository, JogadorRepository jogadorRepository) {

    }
    
    public static RodadaAppService getSoleInstance() {
        
    }
    
    private RodadaAppService(RodadaFactory rodadaFactory, RodadaRepository rodadaRepository, JogadorRepository jogadorRepository) {
        
    }
    
    public Rodada novaRodada(long idJogador) {
        
    }
    
    public Rodada novaRodada(String nomeJogador) throws JogadorNaoEncontradoException{
        
    }
    
    public Rodada novaRodada(Jogador jogador) {
        
    }
    
    public boolean salvarRodada(Rodada rodada) {
        
    }
    
}
