package ristoranti;

import alimenti.Alimento;
import menu.Menu;

/**
 *
 * @author Matteo Gabetta <matteo.gabetta at unipv.it>
 */
public abstract class EsercizioRistorazione {
    private String nome;
    
    /**
     * 
     */
    protected Menu menu;

    /**
     * 
     * @param nome
     */
    public EsercizioRistorazione(String nome) {
        this.nome = nome;
        menu = new Menu();
    }
    
    /**
     * 
     * @return
     */
    public String getNome(){
        return nome;
    }
    
    /**
     * 
     * @param alimento
     */
    public void togliDalMenu(Alimento alimento){
        menu.rimuovi(alimento);
    }
    
    /**
     * 
     * @return
     */
    public String stampaMenu(){
        return "Menù de \""+nome+"\":\n\n"+menu.toString();
    }
    
    /**
     * 
     * @param menu
     */
    public void cambiaMenu(Menu menu){
        this.menu = menu;
    }
    
    
    /**
     * 
     */
    public void ordinaMenuPerPrezzo(){
        menu.ordinaListaPerPrezzo();
    }
    
    /**
     * 
     * @param alimento
     * @param prezzo  
     */
    public abstract void aggiungiAlMenu(Alimento alimento, double prezzo);
    
}
