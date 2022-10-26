package br.edu.iff.bancodepalavras.dominio.tema;

import br.edu.iff.repository.RepositoryException;

public final class TemaFactoryImpl implements TemaFactory, TemaRepository{

    private static TemaFactoryImpl soleInstance;
    
    public static void createSoleInstance(TemaRepository repository) {
        
    }
    
    public static TemaFactoryImpl getSoleInstance() {
        return null;
    }
    
    private TemaFactoryImpl(TemaRepository repository) {
        
    }
    
    private TemaRepository getTemarepository() {
        return TemaRepository;
        
    }
    
    
    @Override
    public Tema getTema(String nome) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Tema getPorId(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Tema[] getPorNome(String nome) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Tema[] getTodos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void inserir(Tema tema) throws RepositoryException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void atualizar(Tema tema) throws RepositoryException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void remover(Tema tema) throws RepositoryException {
        // TODO Auto-generated method stub
        
    }
    
    

}
