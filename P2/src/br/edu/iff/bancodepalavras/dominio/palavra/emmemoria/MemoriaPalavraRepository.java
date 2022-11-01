package br.edu.iff.bancodepalavras.dominio.palavra.emmemoria;

import br.edu.iff.bancodepalavras.dominio.palavra.Palavra;
import br.edu.iff.bancodepalavras.dominio.palavra.PalavraRepository;
import br.edu.iff.bancodepalavras.dominio.tema.Tema;
import br.edu.iff.repository.RepositoryException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MemoriaPalavraRepository implements PalavraRepository{
    
    private static MemoriaPalavraRepository soleInstance = null;
    private List<Palavra> pool ;
    
    
    public static MemoriaPalavraRepository getSoleInstance(){
        if(soleInstance==null){
            soleInstance = new MemoriaPalavraRepository();
            return soleInstance;
        }
        return soleInstance;
    }
    
    
    private MemoriaPalavraRepository(){
        this.pool= new ArrayList<>();
    }

    @Override
    public Palavra getPorId(Long id) {
        for(Palavra palavra : pool){
            if(palavra.getId()==id){
                return palavra;
            }
        }
        return null;
    }

    @Override
    public List<Palavra> getPorTema(Tema tema) {
        List<Palavra> palavras = new ArrayList<>();
        for(Palavra palavra:pool){
            if(palavra.getTema()==tema){
                palavras.add(palavra);
                return palavras;
            }
        }
        return null;
        
    }
//retornando a coleção inteira, mas voltando uma coleção imutavel dela (segurança).
    @Override
    public List<Palavra> getTodas() {
        return Collections.unmodifiableList(pool);
    }

// palavralista é a palavra que ta na lista, onde a mesma vai passar verificando com a palavra que recebeu por parâmetro.
    @Override
    public Palavra getPalavra(String palavra) {
        for(Palavra palavralista:pool){
            if(palavralista.equals(palavra)){
                return palavralista;
            }
        }
        return null;
    }

    @Override
    public void inserir(Palavra palavra) throws RepositoryException {
        if( pool.contains(palavra)){
            throw new RepositoryException("Palavra já existente");
        }
        pool.add(palavra);
    }
    
    
    @Override
    public void atualizar(Palavra palavra) throws RepositoryException {
        this.remover(palavra);
        this.inserir(palavra);
    }

    @Override
    public void remover(Palavra palavra) throws RepositoryException {
         if( pool.contains(palavra)){
            pool.remove(palavra);   
        }
        throw new RepositoryException("Palavra não encontrada para ser removida");
    }

    
    //conferir se esta certo.
    @Override
    public long getProximoId() {
        return pool.size()+1;
    }

   
}
