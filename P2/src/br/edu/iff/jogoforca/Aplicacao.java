package br.edu.iff.jogoforca;

public class Aplicacao {

    private static final String TIPOS_REPOSITORY_FACTORY[] = {"memoria, relacional"};
    private static final String TIPOS_ELEMENTO_GRAFICO_FACTORY[] = {"texto", "imagem"};
    private static final String TIPOS_RODADA_FACTORY[] = {"sorteio"};
    private static Aplicacao soleInstance;
    private String tipoRepositoryFactory = TIPOS_REPOSITORY_FACTORY[0];
    private String tipoElementoGraficoFactory = TIPOS_ELEMENTO_GRAFICO_FACTORY[0];
    private String tipoRodadaFactory = TIPOS_RODADA_FACTORY[0];

    
    public static Aplicacao getSoleInstance() {
        
    }
    
    private Aplicacao() {
        
    }
    
    public void configurar() {
        
    }

    public String[] getTiposRepositoryFactory() {
        return tipoRepositoryFactory;
    }

    public void setTipoRepositoryFactory(String tipoRepositoryFactory) {
        this.tipoRepositoryFactory = tipoRepositoryFactory;
    }

    public RepositoryFactory getRepositoryFactory() {
        return 
    }

    public void setTipoElementoGraficoFactory(String stipo) {
        this.tipoElementoGraficoFactory = stipo;
    }
    
    private ElementoGraficoFactory getElementoGraficoFactory() {
        return null;
        
    }
    

    public BonecoFactory getBonecoFactory() {
        return ;
    }

    public LetraFactory getLetraFactory() {
        return 
    }
    
    public String[] getTiposRodadaFactory() {
        
    }
    
    public void setTipoRodadaFactory(String tipo) {
        
    }
    
    public RodadaFactory getRodadaFactory() {
        
    }
    
    public TemaFactory getTemaFactory() {
        
    }
    
    public PalavraFactory getPalavraFactory() {
        
    }
    
    public JogadorFactory getJogadorFactory() {
        
    }
    
}
