package alimenti.cibi;

import alimenti.Alimento;

/**
 *
 * @author Matteo Gabetta <matteo.gabetta at unipv.it>
 */
public class Kebab extends Alimento{
    private boolean conSalsa, conCipolla;
    private String tipoCarne;

    /**
     * 
     * @param conSalsa
     * @param conCipolla
     * @param tipoCarne
     * @param nome
     */
    public Kebab(boolean conSalsa, boolean conCipolla, String tipoCarne, String nome) {
        super(nome);
        this.conSalsa = conSalsa;
        this.conCipolla = conCipolla;
        this.tipoCarne = tipoCarne;
    }
    
    @Override
    public String toString() {
        return getNome()+"|carne di "+tipoCarne+"|"+ (conCipolla ? "con" : "senza")+" cipolla|" + (conSalsa ? "con" : "senza")+" salsa";
    }
    
    
}
