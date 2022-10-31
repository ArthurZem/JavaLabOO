package br.edu.iff.jogoforca.imagem;

import br.edu.iff.bancodepalavras.dominio.letra.Letra;
import br.edu.iff.bancodepalavras.dominio.letra.imagem.LetraImagemFactory;
import br.edu.iff.jogoforca.ElementoGraficoFactory;
import br.edu.iff.jogoforca.dominio.boneco.Boneco;
import br.edu.iff.jogoforca.dominio.boneco.imagem.BonecoImagemFactory;

public class ElementoGraficoImagemFactory implements ElementoGraficoFactory{
    private static ElementoGraficoImagemFactory soleInstance = null;
    private BonecoImagemFactory bonecoimagemfactory;
    private LetraImagemFactory letraimagemfactory;
    
    
    
    public static ElementoGraficoImagemFactory getSoleInstance(){
        if(soleInstance == null){
            soleInstance = new ElementoGraficoImagemFactory();
            return soleInstance;
        }
        return soleInstance;
    }
    
    private ElementoGraficoImagemFactory(){
        this.bonecoimagemfactory = BonecoImagemFactory.getSoleInstance();
        this.letraimagemfactory = LetraImagemFactory.getSoleInstance();
    }
    
    
    
    @Override
    public Boneco getBoneco() {
        return bonecoimagemfactory.getBoneco();
    }

    @Override
    public Letra getLetra(char codigo) {
        return LetraImagemFactory.getSoleInstance().getLetra(codigo);
    }

    @Override
    public Letra getLetraEncoberta() {
        return LetraImagemFactory.getSoleInstance().getLetraEncoberta();
    }

}
