package br.edu.iff.bancodepalavras.dominio.palavra;

import br.edu.iff.bancodepalavras.dominio.tema.Tema;
import br.edu.iff.repository.Repository;
import br.edu.iff.repository.RepositoryException;
import java.util.List;

public interface PalavraRepository extends Repository {
    
    //a ligação da classe PalavraRepository com a entidade Palavra.
    public Palavra getPorId(Long id);
    
    public List<Palavra> getPorTema(Tema tema);
    public List<Palavra> getTodas();
    public Palavra getPalavra(String palavra);
    
    // erros com a classe Exception criada no inicio.
    public void inserir(Palavra palavra) throws RepositoryException;
    public void atualizar(Palavra palavra) throws RepositoryException;
    public void remover(Palavra palavra) throws RepositoryException;

}
