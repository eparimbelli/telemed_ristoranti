package alimenti;

/**
 *
 * @author Matteo Gabetta <matteo.gabetta at unipv.it>
 */
public abstract class Alimento {
    private String nome;

    /**
     * 
     * @return il nome dell'alimento
     */
    public String getNome() {
        return nome;
    }

    /**
     * 
     * @param nome il nome dell'alimento
     */
    public Alimento(String nome) {
        this.nome = nome;
    }

    /**
     * 
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if(o instanceof Alimento){
            if(nome.equals(((Alimento)o).getNome())) {
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    
    
    
    /**
     * 
     * @return l'etichetta associata all'alimeto
     */
    public abstract String toString();
}
