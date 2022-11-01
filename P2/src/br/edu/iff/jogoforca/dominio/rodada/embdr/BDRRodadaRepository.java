package br.edu.iff.jogoforca.dominio.rodada.embdr;

import br.edu.iff.jogoforca.dominio.jogador.Jogador;
import br.edu.iff.jogoforca.dominio.rodada.Rodada;
import br.edu.iff.jogoforca.dominio.rodada.RodadaRepository;
import br.edu.iff.repository.RepositoryException;
import java.util.List;

public class BDRRodadaRepository implements RodadaRepository {

    private static BDRRodadaRepository soleInstance = null;

    public static BDRRodadaRepository getSoleInstance() {
        if (soleInstance == null) {
            soleInstance = new BDRRodadaRepository();
            return soleInstance;
        }
        return soleInstance;
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
