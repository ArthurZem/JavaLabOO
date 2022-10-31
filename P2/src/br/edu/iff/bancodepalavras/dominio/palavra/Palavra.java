package br.edu.iff.bancodepalavras.dominio.palavra;

import java.util.List;

import br.edu.iff.bancodepalavras.dominio.tema.Tema;
import br.edu.iff.dominio.ObjetoDominioImpl;

public class Palavra extends ObjetoDominioImpl{
    
    
    
    public static void setLetraFactory(LetraFactory factory) {
        
    }
    
    public static LetraFactory getLetraFactory() {
        
    }
    
    public static Palavra criar(long id, String palavra, Tema tema) {
        
    }
    

	private Palavra(long id, String palavra, Tema tema) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	public List<Letra> getLetras(){
	    
	}
	
	public Letra GetLetra(int posicao) {
	    
	}
	
	public void exibir(Object contexto) {
	    
	}
	
	public void exibir(Object contexto, List<Boolean>posicoes) {
	    
	}
	
	public List<Integer> tentar(char codigo){
	    
	}
	
	public Tema getTema() {
	    
	}
	
	public boolean comparar(String palavra) {
	    
	}
	
	public int getTamanho() {
	    
	}
	
	public String toString() {
	    
	}
	
	

}


