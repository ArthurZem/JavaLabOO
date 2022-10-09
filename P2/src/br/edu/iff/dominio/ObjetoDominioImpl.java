package br.edu.iff.dominio;

public abstract class ObjetoDominioImpl implements ObjetoDominio {

	private long id;
	
	public ObjetoDominioImpl(long id) {
		
	}
	
	@Override
	public long getId() {
		return this.id;
	}
	
	
}
