package br.edu.iff.jogoforca.dominio.jogador.emmemoria;

import br.edu.iff.jogoforca.dominio.jogador.Jogador;
import br.edu.iff.jogoforca.dominio.jogador.JogadorRepository;
import br.edu.iff.repository.RepositoryException;
import java.util.ArrayList;
import java.util.List;

public class MemoriaJogadorRepository implements JogadorRepository {

    private static MemoriaJogadorRepository soleInstance = null;
    private List<Jogador> pool = new ArrayList<>();

    public static MemoriaJogadorRepository getSoleInstance() {
        if (soleInstance == null) {
            soleInstance = new MemoriaJogadorRepository();
            return soleInstance;
        }
        return soleInstance;
    }

    private MemoriaJogadorRepository() {

    }

    @Override
    public Jogador getPorId(long id) {
        for (Jogador jogador : pool) {
            if (jogador.getId() == id) {
                return jogador;
            }
        }
        return null;
    }

    @Override
    public Jogador getPorNome(String nome) {
        for (Jogador jogador : pool) {
            if (jogador.getNome().equals(nome)) {
                return jogador;
            }
        }
        return null;
    }

    @Override
    public void inserir(Jogador jogador) throws RepositoryException {
        if (pool.contains(jogador)) {
            throw new RepositoryException("Jogador já existe");
        }
        pool.add(jogador);
    }

    @Override
    public void atualizar(Jogador jogador) throws RepositoryException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remover(Jogador jogador) throws RepositoryException {
        if (pool.contains(jogador)) {
            pool.remove(jogador);
        }
        throw new RepositoryException("O jogador " + jogador + "não foi localizado para exclusão");
    }

    @Override
    public long getProximoId() {
        return pool.size() + 1;
    }

}
