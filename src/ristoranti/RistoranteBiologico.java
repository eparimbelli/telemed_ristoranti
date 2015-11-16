package ristoranti;

import alimenti.Alimento;
import alimenti.BiologicoIF;

/**
 *
 * @author Matteo Gabetta <matteo.gabetta at unipv.it>
 */
public class RistoranteBiologico extends Ristorante{

    /**
     * 
     * @param nome
     */
    public RistoranteBiologico(String nome) {
        super(nome);
    }

    /**
     * 
     * @param alimento
     * @param prezzo  
     */
    @Override
    public void aggiungiAlMenu(Alimento alimento, double prezzo){
        if(alimento instanceof BiologicoIF){
            super.aggiungiAlMenu(alimento, prezzo);
        }
        else{
            throw new IllegalArgumentException(" non è biologico. Impossibile aggiungere al menu'.");
        }
    }    
}
