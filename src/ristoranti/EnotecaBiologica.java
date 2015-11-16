package ristoranti;

import alimenti.Alimento;
import alimenti.BiologicoIF;

/**
 *
 * @author Matteo Gabetta <matteo.gabetta at unipv.it>
 */
public class EnotecaBiologica extends Enoteca {

    /**
     * 
     * @param nome
     */
    public EnotecaBiologica(String nome) {
        super(nome);
    }

    @Override
    public void aggiungiAlMenu(Alimento alimento, double prezzo){
        if (alimento instanceof BiologicoIF) {
            super.aggiungiAlMenu(alimento, prezzo);
        } else {
            throw new IllegalArgumentException(" non è biologico. Impossibile aggiungere al menu'.");
        }
    }
}
