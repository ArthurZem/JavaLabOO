package br.edu.iff.bancodepalavras.dominio.palavra;

import br.edu.iff.bancodepalavras.dominio.tema.Tema;
import br.edu.iff.factory.EntityFactory;

public class PalavraFactoryImpl extends EntityFactory implements PalavraFactory{
    
    private static PalavraFactoryImpl soleInstance = null;
    private PalavraRepository repository;

    public static void createSoleInstance(PalavraRepository repository) {
        if(repository == null) {
            soleInstance = new PalavraFactoryImpl(repository);
        }
    }
    
    
    public static PalavraFactoryImpl getSoleInstance() {
        if(soleInstance == null) {
            throw new RuntimeException("Instancia ainda não foi criada!");
        }
        return soleInstance;
        
    }
    
    private PalavraFactoryImpl(PalavraRepository repository) {
        super(repository);
    }

    private PalavraRepository getPalavraRepository() {
       return repository;
    }
    


    @Override
    public Palavra getPalavra(String palavra, Tema tema) {
        if(getPalavraRepository().getPorTema(tema) == null) {
            return Palavra.criar(repository.getProximoId(), palavra,tema);
        }
        return (Palavra) getPalavraRepository().getPorTema(tema);
    }

    
}
