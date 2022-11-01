package br.edu.iff.bancodepalavras.dominio.tema;

import br.edu.iff.factory.EntityFactory;

public class TemaFactoryImpl extends EntityFactory implements TemaFactory {

    private static TemaFactoryImpl soleInstance = null;
    private TemaRepository repository;

    public static void createSoleInstance(TemaRepository repository) {
        if (repository == null) {
            soleInstance = new TemaFactoryImpl(repository);
        }
    }

    public static TemaFactoryImpl getSoleInstance() {
        if (soleInstance == null) {
            throw new RuntimeException("Instancia ainda não foi criada!");
        }
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
        if (getTemaRepository().getPorNome(nome) == null) {
            return Tema.criar(repository.getProximoId(), nome);
        }
        return (Tema) getTemaRepository().getPorNome(nome);
    }

}
