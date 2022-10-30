package br.edu.iff.jogoforca.embdr;

import br.edu.iff.bancodepalavras.dominio.palavra.PalavraRepository;
import br.edu.iff.bancodepalavras.dominio.palavra.embdr.BDRPalavraRepository;
import br.edu.iff.bancodepalavras.dominio.tema.TemaRepository;
import br.edu.iff.bancodepalavras.dominio.tema.embdr.BDRTemaRepository;
import br.edu.iff.jogoforca.RepositoryFactory;
import br.edu.iff.jogoforca.dominio.jogador.JogadorRepository;
import br.edu.iff.jogoforca.dominio.jogador.embdr.BDRJogadorRepository;
import br.edu.iff.jogoforca.dominio.rodada.RodadaRepository;
import br.edu.iff.jogoforca.dominio.rodada.embdr.BDRRodadaRepository;

public class BDRRepositoryFactory implements RepositoryFactory {
    
    private static BDRRepositoryFactory soleInstance = null;
    
    //verificando se a classe já foi instanciada na variavel soleInstance e retornando se sim.
    public static BDRRepositoryFactory getSoleInstance(){
        if(soleInstance == null){
            soleInstance = new BDRRepositoryFactory();
            return soleInstance;
        }
        
        return soleInstance;
    }
    
    //construtor garantindo que não será instanciado externamente;
    private BDRRepositoryFactory(){
        
    }

    @Override
    public PalavraRepository getPalavraRepository() {
        return (PalavraRepository) BDRPalavraRepository.getSoleInstance();
    }

    @Override
    public TemaRepository getTemaRepository() {
        return (TemaRepository) BDRTemaRepository.getSoleInstance();
    }

    @Override
    public RodadaRepository getRodadaRepository() {
        return (RodadaRepository) BDRRodadaRepository.getSoleInstance();
    }

    @Override
    public JogadorRepository getJogadorRepository() {
        return (JogadorRepository) BDRJogadorRepository.getSoleInstance();
    }

}
