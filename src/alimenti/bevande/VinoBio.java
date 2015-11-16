package alimenti.bevande;

import alimenti.BiologicoIF;

/**
 *
 * @author Matteo Gabetta <matteo.gabetta at unipv.it>
 */
public class VinoBio extends Vino implements BiologicoIF{
    private String codiceBIO;
    
    private static int codiceNew = 1;

    /**
     * 
     * @param nome
     * @param gradazione
     * @param tipo
     * @param colore
     */
//    public VinoBio(String codiceBIO, String nome, double gradazione, String tipo, String colore) {
//        super(nome, gradazione, tipo, colore);
//        this.codiceBIO = codiceBIO;
//    }
    
    public VinoBio(String nome, double gradazione, String tipo, String colore) {
        super(nome, gradazione, tipo, colore);
        this.codiceBIO = "VinoBio_"+codiceNew++;
    }

    /**
     * 
     * @return
     */
    @Override
    public String getTracciabilità() {
        return codiceBIO;
    }

    @Override
    public String toString() {
        return super.toString()+"|"+codiceBIO;
    }
}
