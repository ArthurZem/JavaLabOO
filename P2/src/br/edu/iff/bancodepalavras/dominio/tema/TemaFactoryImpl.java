package br.edu.iff.bancodepalavras.dominio.tema;

import br.edu.iff.factory.EntityFactory;
import br.edu.iff.jogoforca.dominio.jogador.Jogador;
import br.edu.iff.repository.Repository;

public final class TemaFactoryImpl extends EntityFactory implements TemaFactory{

    private static TemaFactoryImpl soleInstance = null;
    private TemaRepository repository;
    
    public static void createSoleInstance(TemaRepository repository) {
        if(repository == null) {
            soleInstance = new TemaFactoryImpl(repository);
        }
    }
    
    
    public static TemaFactoryImpl getSoleInstance() {
        return soleInstance;
        
    }
    
    private TemaFactoryImpl(TemaRepository repository) {
        super(repository);
    }

    private TemaRepository getTemaRepository() {
       return repository;
    }
    
    

    @Override
    public Tema getTema(String nome) {
        if(getTemaRepository().getPorNome(nome) == null) {
            return Tema.criar(repository.getProximoId(), nome);
        }
        return getTemaRepository().getPorNome(nome);
    }
    
    
    
    

}
