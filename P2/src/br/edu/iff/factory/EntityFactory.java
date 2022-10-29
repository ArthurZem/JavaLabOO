package br.edu.iff.factory;

import br.edu.iff.repository.Repository;

public abstract class EntityFactory implements Repository{
    
    private Repository repository;
    
    protected EntityFactory(Repository repository) {
        this.repository = repository;
    }

    protected Repository getRepository() {
        return repository;
    }
    
    public long getProximoId() {
        return repository.getProximoId();
    }
}
