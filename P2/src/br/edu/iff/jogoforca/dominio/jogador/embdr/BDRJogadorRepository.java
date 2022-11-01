package br.edu.iff.jogoforca.dominio.jogador.embdr;

import br.edu.iff.jogoforca.dominio.jogador.Jogador;
import br.edu.iff.jogoforca.dominio.rodada.Rodada;
import br.edu.iff.jogoforca.dominio.rodada.RodadaRepository;
import br.edu.iff.repository.RepositoryException;
import java.util.List;

public class BDRJogadorRepository implements RodadaRepository {

    private static BDRJogadorRepository soleInstance = null;

    public static BDRJogadorRepository getSoleInstance() {
        if (soleInstance == null) {
            soleInstance = new BDRJogadorRepository();
            return soleInstance;
        }
        return soleInstance;
    }

    private BDRJogadorRepository() {

    }

    @Override
    public Rodada getPorId(Long id) {
        return null;
    }

    @Override
    public List<Rodada> getPorJogador(Jogador jogador) {
        return null;
    }

    @Override
    public void inserir(Rodada rodada) throws RepositoryException {
    }

    @Override
    public void atualizar(Rodada rodada) throws RepositoryException {
    }

    @Override
    public void remover(Rodada rodada) throws RepositoryException {
    }

    @Override
    public long getProximoId() {
        return 0;
    }

}
