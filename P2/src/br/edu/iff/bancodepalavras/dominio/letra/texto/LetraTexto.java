package br.edu.iff.bancodepalavras.dominio.letra.texto;

import br.edu.iff.bancodepalavras.dominio.letra.Letra;

public class LetraTexto extends Letra{

    
    public LetraTexto(char codigo) {
        super(codigo);
        // TODO Auto-generated constructor stub
    }

    public void exibir(Object contexto) {
        
    }

    @Override
    public Letra getLetra(char codigo) {
        return new Letra(codigo);
    }

    @Override
    public Letra getLetraEncoberta() {
        // TODO Auto-generated method stub
        return null;
    }
}
