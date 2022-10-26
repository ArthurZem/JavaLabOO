package br.edu.iff.bancodepalavras.dominio.tema;

import br.edu.iff.dominio.ObjetoDominioImpl;
import br.edu.iff.repository.RepositoryException;

public class Tema extends ObjetoDominioImpl implements TemaRepository{
	
	private String nome;


	private Tema(long id, String nome) {
		super(id);
		this.nome = nome;
	}

	
	
	public static Tema criar(long id, String nome) {
		return null;
	}
	
	public static Tema reconstituir(long id, String nome) {
		return null;
		
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



    @Override
    public Tema getPorId(long id) {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public Tema[] getPorNome(String nome) {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public Tema[] getTodos() {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public void inserir(Tema tema) throws RepositoryException {
        // TODO Auto-generated method stub
        
    }



    @Override
    public void atualizar(Tema tema) throws RepositoryException {
        // TODO Auto-generated method stub
        
    }



    @Override
    public void remover(Tema tema) throws RepositoryException {
        // TODO Auto-generated method stub
        
    }



    @Override
    public Tema getTema(String nome) {
        // TODO Auto-generated method stub
        return null;
    }


	
	

}
