package br.edu.iff.jogoforca.dominio.rodada.emmemoria;

import br.edu.iff.jogoforca.dominio.jogador.Jogador;
import br.edu.iff.jogoforca.dominio.rodada.Rodada;
import br.edu.iff.jogoforca.dominio.rodada.RodadaRepository;
import br.edu.iff.repository.RepositoryException;
import java.util.ArrayList;
import java.util.List;

public class MemoriaRodadaRepository implements RodadaRepository {

    private static MemoriaRodadaRepository soleInstance = null;
    private List<Rodada> pool = new ArrayList<>();

    public static MemoriaRodadaRepository getSoleInstance() {
        if (soleInstance == null) {
            soleInstance = new MemoriaRodadaRepository();
            return soleInstance;
        }
        return soleInstance;
    }

    private MemoriaRodadaRepository() {

    }

    @Override
    public Rodada getPorId(Long id) {
        for (Rodada rodada : pool) {
            if (rodada.getId() == id) {
                return rodada;
            }
        }
        return null;
    }

    @Override
    public List<Rodada> getPorJogador(Jogador jogador) {
        List<Rodada> rodadalist = new ArrayList<>();
        for (Rodada rodada : pool) {
            if (rodada.getJogador() == jogador) {
                rodadalist.add(rodada);
            }
        }
        return rodadalist;
    }

    @Override
    public void inserir(Rodada rodada) throws RepositoryException {
        if (pool.contains(rodada)) {
            throw new RepositoryException("Essa rodada já está salvo no repositório");
        }

        pool.add(rodada);
    }

    @Override
    public void atualizar(Rodada rodada) throws RepositoryException {
        this.remover(rodada);
        this.inserir(rodada);

    }

    @Override
    public void remover(Rodada rodada) throws RepositoryException {
        if (pool.contains(rodada)) {
            pool.remove(rodada);
        } else {
            throw new RepositoryException("A rodada " + rodada + "não está presente no repositório");
        }
    }

    @Override
    public long getProximoId() {
        return pool.size() + 1;
    }

}
