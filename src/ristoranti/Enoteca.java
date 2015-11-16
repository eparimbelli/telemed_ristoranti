package ristoranti;

import alimenti.Alimento;
import alimenti.bevande.Vino;

/**
 *
 * @author Matteo Gabetta <matteo.gabetta at unipv.it>
 */
public class Enoteca extends EsercizioRistorazione{

    /**
     * 
     * @param nome
     */
    public Enoteca(String nome) {
        super(nome);
    }

    @Override
    public void aggiungiAlMenu(Alimento alimento, double prezzo){
        if(alimento instanceof Vino){
            menu.aggiungi(alimento,prezzo);
        }
        else{
            throw new IllegalArgumentException("In enoteca solo Vino!!!");
        }
    }
    
}
