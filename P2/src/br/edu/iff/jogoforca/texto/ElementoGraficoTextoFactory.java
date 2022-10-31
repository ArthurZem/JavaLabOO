package br.edu.iff.jogoforca.texto;

import br.edu.iff.bancodepalavras.dominio.letra.Letra;
import br.edu.iff.bancodepalavras.dominio.letra.texto.LetraTextoFactory;
import br.edu.iff.jogoforca.ElementoGraficoFactory;
import br.edu.iff.jogoforca.dominio.boneco.Boneco;
import br.edu.iff.jogoforca.dominio.boneco.texto.BonecoTextoFactory;

public class ElementoGraficoTextoFactory implements ElementoGraficoFactory{
    
    private static ElementoGraficoTextoFactory soleInstance = null;
    private BonecoTextoFactory bonecotextofactory;
    private LetraTextoFactory letratextofactory;
    
    public static ElementoGraficoTextoFactory getSoleInstance(){
        if(soleInstance == null){
            soleInstance = new ElementoGraficoTextoFactory();
            return soleInstance;
        }
        return soleInstance;
    }
    
    private ElementoGraficoTextoFactory(){
        this.bonecotextofactory = BonecoTextoFactory.getSoleInstance();
        this.letratextofactory = LetraTextoFactory.getSoleInstance();
        
    }

    @Override
    public Boneco getBoneco() {
        return bonecotextofactory.getBoneco();
    }

    @Override
    public Letra getLetra(char codigo) {
        return letratextofactory.getSoleInstance().getLetra(codigo);
    }

    @Override
    public Letra getLetraEncoberta() {
        return letratextofactory.getSoleInstance().getLetraEncoberta();
    }

}
