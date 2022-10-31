package br.edu.iff.jogoforca.dominio.boneco.texto;

import br.edu.iff.jogoforca.dominio.boneco.Boneco;
import br.edu.iff.jogoforca.dominio.boneco.BonecoFactory;

public class BonecoTextoFactory implements BonecoFactory{
    
    private static BonecoTextoFactory soleInstance = null;
    
    //verifica instancia, e caso não exista, ele instancia na hora.
    public static BonecoTextoFactory getSoleInstance(){
        if(soleInstance==null){
            soleInstance = new BonecoTextoFactory();
            return soleInstance;
        }
        return soleInstance;
    }
    
    //garantir que não haverá instancia.
    private BonecoTextoFactory(){
        
    }
    

    @Override
    public Boneco getBoneco() {
        return BonecoTexto.getSoleInstance();
    }

}
