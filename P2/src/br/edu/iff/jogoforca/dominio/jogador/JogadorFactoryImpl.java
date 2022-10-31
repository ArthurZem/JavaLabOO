package br.edu.iff.jogoforca.dominio.jogador;

import br.edu.iff.factory.EntityFactory;


public class JogadorFactoryImpl extends EntityFactory implements JogadorFactory{

    private static JogadorFactoryImpl soleInstance = null;
    private JogadorRepository repository;
    
    public void createSoleInstance(JogadorRepository repository) {
        if(soleInstance == null) {
            soleInstance = new JogadorFactoryImpl(repository);
        }
    }
    
    public static JogadorFactoryImpl getSoleInstance() {
        if(soleInstance == null) {
           throw new RuntimeException("Não há instância criada para retornar!");
        }
        return soleInstance;
        
    }
    
    private JogadorFactoryImpl(JogadorRepository repository) {
        super(repository);
    }
    
    private JogadorRepository getJogadorRepository() {
        return repository;
        
    }

    @Override
    public Jogador getJogador(String nome) {
        if(getJogadorRepository().getPorNome(nome) == null) {
            return Jogador.criar(repository.getProximoId(), nome);
        }
        return getJogadorRepository().getPorNome(nome);
    }
    
}

    