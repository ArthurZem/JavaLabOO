package br.edu.iff.bancodepalavras.dominio.letra.imagem;

import br.edu.iff.bancodepalavras.dominio.letra.Letra;
import br.edu.iff.bancodepalavras.dominio.letra.LetraFactoryImpl;

public class LetraImagemFactory extends LetraFactoryImpl{
    
    private static LetraImagemFactory soleInstance = null;
    
    public static LetraImagemFactory getSoleInstance(){
        if(soleInstance == null){
            soleInstance = new LetraImagemFactory();
            return soleInstance;
        }
        return soleInstance;
    }
    
    
    private LetraImagemFactory(){
        
    }

    @Override
    protected Letra criarLetra(char codigo) {
        return new LetraImagem(codigo);
    }

}
