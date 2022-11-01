package br.edu.iff.jogoforca.dominio.rodada;

import br.edu.iff.bancodepalavras.dominio.palavra.PalavraRepository;
import br.edu.iff.bancodepalavras.dominio.tema.TemaRepository;
import br.edu.iff.factory.EntityFactory;

public abstract class RodadaFactoryImpl extends EntityFactory implements RodadaFactory {

    protected TemaRepository temaRepository;
    protected PalavraRepository palavraRepository;

    public RodadaFactoryImpl(TemaRepository temaRepository, PalavraRepository palavraRepository, RodadaRepository repository) {
        super(repository);
        this.temaRepository = temaRepository;
        this.palavraRepository = palavraRepository;
    }

    protected RodadaRepository getRodadaRepository() {
        return (RodadaRepository) repository;
    }

    protected TemaRepository getTemaRepository() {
        return temaRepository;
    }

    protected PalavraRepository getPalavraRepository() {
        return palavraRepository;
    }
}
