@Entity
public abstract class ObjetoDominioImpl extends ObjetoDominio {
    private long id;
    
    @Override    
    public ObjetoDominio(long id) {
        this.id = id;
    }
    
    
}
