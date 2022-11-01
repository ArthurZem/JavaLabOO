package br.edu.iff.jogoforca.dominio.rodada.sorteio;

import br.edu.iff.bancodepalavras.dominio.palavra.Palavra;
import br.edu.iff.bancodepalavras.dominio.palavra.PalavraRepository;
import br.edu.iff.bancodepalavras.dominio.tema.Tema;
import br.edu.iff.bancodepalavras.dominio.tema.TemaRepository;
import br.edu.iff.jogoforca.dominio.jogador.Jogador;
import br.edu.iff.jogoforca.dominio.rodada.Rodada;
import br.edu.iff.jogoforca.dominio.rodada.RodadaFactoryImpl;
import br.edu.iff.jogoforca.dominio.rodada.RodadaRepository;
import java.util.List;
import java.util.Random;

public class RodadaSorteioFactory extends RodadaFactoryImpl {

    private static RodadaSorteioFactory soleInstance = null;

    public static void createSoleInstance(RodadaRepository repository, TemaRepository temaRepository, PalavraRepository palavraRepository) {
        soleInstance = new RodadaSorteioFactory(temaRepository, palavraRepository, repository);
    }

    public static RodadaSorteioFactory getSoleInstance() {
        if (soleInstance == null) {
            throw new RuntimeException("Rodada sorteio factory ainda não criado");
        }
        return soleInstance;
    }

    private RodadaSorteioFactory(TemaRepository temaRepository, PalavraRepository palavraRepository, RodadaRepository repository) {
        super(temaRepository, palavraRepository, repository);
    }

    @Override
    public Rodada getRodada(Jogador jogador) {
        List<Tema> temas = getTemaRepository().getTodos();
        Random random = new Random();
        int valor = random.ints(0, temas.size()).findFirst().getAsInt();
        Tema tema = temas.get(valor);
        List<Palavra> palavras = palavraRepository.getPorTema(tema);
        if (palavras.size() <= 0) {
            throw new IllegalArgumentException("N�o existem palavras para esse tema");
        }
        int palavraUm = random.ints(0, palavras.size()).findFirst().getAsInt();
        int palavraDois = random.ints(0, palavras.size()).findFirst().getAsInt();
        int palavraTres = random.ints(0, palavras.size()).findFirst().getAsInt();
        Palavra[] palavrasRodada = {palavras.get(palavraUm), palavras.get(palavraDois), palavras.get(palavraTres)};// utilizei vetor aqui por saber que o tamanho não seria dinâmico.
        return new Rodada(getRodadaRepository().getProximoId(), palavrasRodada, jogador);
    }

}
