package alimenti.cibi;

import alimenti.Alimento;

/**
 *
 * @author Matteo Gabetta <matteo.gabetta at unipv.it>
 */
public class Carne extends Alimento{
    private String pezzo, animale;

    /**
     * 
     * @param pezzo
     * @param animale
     * @param nome
     */
    public Carne(String pezzo, String animale, String nome) {
        super(nome);
        this.pezzo = pezzo;
        this.animale = animale;
    }

    @Override
    public String toString() {
        return getNome()+"|"+pezzo+"|"+animale;
    }
}
