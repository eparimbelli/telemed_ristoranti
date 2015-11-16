package menu;

import alimenti.Alimento;

/**
 *
 * @author Matteo Gabetta <matteo.gabetta at unipv.it>
 */
public class ElementoMenu {

    private Alimento alimento;
    private double prezzo;

    /**
     *
     * @param alimento
     * @param prezzo
     */
    public ElementoMenu(Alimento alimento, double prezzo) {
        this.alimento = alimento;
        this.prezzo = prezzo;
    }

    /**
     *
     * @return
     */
    public Alimento getAlimento() {
        return alimento;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return alimento.toString() + "\n\t" + prezzo + " €\n";
    }

    /**
     *
     * @return
     */
    public double getPrezzo() {
        return prezzo;
    }
}
