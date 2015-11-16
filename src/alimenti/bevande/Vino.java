package alimenti.bevande;

import alimenti.Alimento;

/**
 *
 * @author Matteo Gabetta <matteo.gabetta at unipv.it>
 */
public class Vino extends Alimento{
    private double gradazione;
    private String colore, tipo;

    /**
     * 
     * @param nome
     * @param gradazione
     * @param tipo
     * @param colore
     */
    public Vino(String nome, double gradazione, String tipo, String colore) {
        super(nome);
        this.gradazione = gradazione;
        this.colore = colore;
        this.tipo = tipo;
    }

    public String toString() {
        return getNome()+"|"+tipo+"|"+colore+"|"+gradazione+"°";
    }
}
