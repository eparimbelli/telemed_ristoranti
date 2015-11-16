package ristoranti;

import alimenti.Alimento;

/**
 *
 * @author Matteo Gabetta <matteo.gabetta at unipv.it>
 */
public class Ristorante extends EsercizioRistorazione {

    /**
     * 
     * @param nome 
     */
    public Ristorante(String nome) {
        super(nome);
    }

    @Override
    public void aggiungiAlMenu(Alimento alimento, double prezzo) {
        menu.aggiungi(alimento, prezzo);
    }
}
