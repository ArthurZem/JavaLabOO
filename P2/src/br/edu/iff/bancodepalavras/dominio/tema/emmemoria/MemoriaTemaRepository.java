package br.edu.iff.bancodepalavras.dominio.tema.emmemoria;

import br.edu.iff.bancodepalavras.dominio.tema.Tema;
import br.edu.iff.bancodepalavras.dominio.tema.TemaRepository;
import br.edu.iff.repository.RepositoryException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MemoriaTemaRepository implements TemaRepository{
    
    private static MemoriaTemaRepository soleInstance = null;
    
    private List<Tema> pool ;
    
    public static MemoriaTemaRepository getSoleInstance(){
        if(soleInstance == null){
            soleInstance = new MemoriaTemaRepository();
            return soleInstance;
        }
        return soleInstance;
    }
    
    //construtor garantindo que não vai ter instancia externa.
    private MemoriaTemaRepository(){
        pool = new ArrayList<>();
    }

    @Override
    public Tema getPorId(long id) {
        for(Tema tema : pool){
            if(tema.getId()==id){
                return tema;
            }
        }
        return null;
    }

    @Override
    public List<Tema> getPorNome(String nome) {
        List<Tema> temas = new ArrayList<>();
        for(Tema tema:pool){
            if(tema.getNome()==nome){
                temas.add(tema);
                return temas;
            }
        }
        return null;
    }

    @Override
    public List<Tema> getTodos() {
        return Collections.unmodifiableList(pool);
    }

    @Override
    public void inserir(Tema tema) throws RepositoryException {
        if(pool.contains(tema)){
            throw new RepositoryException("Tema já existente!");
        }
        pool.add(tema);
    }

    @Override
    public void atualizar(Tema tema) throws RepositoryException {
        this.remover(tema);
	this.inserir(tema);
    }
    
    
    @Override
    public void remover(Tema tema) throws RepositoryException {
        if(pool.contains(tema)){
            pool.remove(tema);
        }
        throw new RepositoryException("Tema não encontrado para ser removido!");
    }

    @Override
    public long getProximoId() {
        return pool.size()+1;
    }

}
