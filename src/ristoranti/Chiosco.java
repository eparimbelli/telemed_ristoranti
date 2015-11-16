package ristoranti;

import alimenti.Alimento;
import alimenti.cibi.Kebab;

/**
 *
 * @author Matteo Gabetta <matteo.gabetta at unipv.it>
 */
public class Chiosco extends EsercizioRistorazione{

    /**
     * 
     * @param nome
     */
    public Chiosco(String nome) {
        super(nome);
    }
    
    

    @Override
    public void aggiungiAlMenu(Alimento alimento, double prezzo){
        if(alimento instanceof Kebab){
            menu.aggiungi(alimento, prezzo);
        }
        else{
            throw new IllegalArgumentException("Al chiosco solo Kebab!!!");
        }
    }
    
}
