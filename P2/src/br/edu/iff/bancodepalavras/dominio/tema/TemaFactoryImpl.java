package br.edu.iff.bancodepalavras.dominio.tema;

import br.edu.iff.factory.EntityFactory;
import br.edu.iff.repository.RepositoryException;

public final class TemaFactoryImpl extends EntityFactory implements TemaFactory{

    private static TemaFactoryImpl soleInstance = null;
    
    public static void createSoleInstance(TemaRepository repository) {
        if(repository == null) {
            soleInstance = 
        }
    }
    
    public static TemaFactoryImpl getSoleInstance() {
        return soleInstance;
        
    }
    
    

    @Override
    public Tema getTema(String nome) {
        // TODO Auto-generated method stub
        return null;
    }
    
    
    
    

}
