/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import alimenti.bevande.Vino;
import alimenti.bevande.VinoBio;
import alimenti.cibi.Carne;
import alimenti.cibi.Kebab;
import menu.Menu;
import ristoranti.Chiosco;
import ristoranti.Enoteca;
import ristoranti.EnotecaBiologica;
import ristoranti.Ristorante;
import ristoranti.RistoranteBiologico;

/**
 *
 * @author Matteo Gabetta <matteo.gabetta at unipv.it>
 */
public class TestCibiRistoranti {

    /**
     * @param args the command line arguments
     * @throws AlimentoTroppoCaroException  
     */
    public static void main(String[] args){
        //ALIMENTI
        Vino lambruscoDC = new Vino("Lambrusco del Castello", 13.5, "Lambrusco", "Rosso");
        VinoBio bonardaBio = new VinoBio("Bonarda Oltrepò", 14, "Bonarda", "Rosso");
        VinoBio barberaBio = new VinoBio("Barbera Oltrepò", 13.5, "Barbera", "Rosso");
        Carne ham = new Carne("Scamone", "Chianina", "Hamburger");
        Kebab keTu = new Kebab(true, false, "Agnello", "Kebab Turco");
        Carne bigMac = new Carne("Ogni parte","Ogni bestia","Big Mac");

        //ESERCIZI DI RISTORAZIONE
        Ristorante laPerg = new Ristorante("La Pergola");
        RistoranteBiologico vecFat = new RistoranteBiologico("La veccchia fattoria");
        Enoteca becCo = new Enoteca("Il bevitor cortese");
        EnotecaBiologica malHy = new EnotecaBiologica("Dai maledetti hyppies");
        Ristorante keb = new Ristorante("Istambul Kebab");
        
        //MENU
        Menu mcMenu = new Menu();
        mcMenu.aggiungi(bigMac, 1);

        
        System.out.println("RISTORANTE\n");

        laPerg.aggiungiAlMenu(ham,15);
        laPerg.aggiungiAlMenu(lambruscoDC,8);
        laPerg.aggiungiAlMenu(bonardaBio,14);
        laPerg.aggiungiAlMenu(barberaBio,2);

        System.out.println(laPerg.stampaMenu());

//        laPerg.togliDalMenu(bonardaBio);
        laPerg.ordinaMenuPerPrezzo();

        System.out.println(laPerg.stampaMenu());


        System.out.println("\n-------------------------\n");


        System.out.println("RISTORANTE BIOLOGICO\n");
//        vecFat.aggiungiAlMenu(ham,6);
//        vecFat.aggiungiAlMenu(lambruscoDC,8);
        vecFat.aggiungiAlMenu(bonardaBio,14);

        System.out.println(vecFat.stampaMenu());

        vecFat.togliDalMenu(ham);

        System.out.println(vecFat.stampaMenu());


        System.out.println("\n-------------------------\n");


        System.out.println("ENOTECA\n");
//        becCo.aggiungiAlMenu(ham,3);
        becCo.aggiungiAlMenu(lambruscoDC,5);
        becCo.aggiungiAlMenu(bonardaBio,7);

        System.out.println(becCo.stampaMenu());

        becCo.togliDalMenu(lambruscoDC);

        System.out.println(becCo.stampaMenu());


        System.out.println("\n-------------------------\n");


        System.out.println("ENOTECA BIOLOGICA\n");
//        malHy.aggiungiAlMenu(ham,4);
//        malHy.aggiungiAlMenu(lambruscoDC,5);
        malHy.aggiungiAlMenu(bonardaBio,9);

        System.out.println(malHy.stampaMenu());

        malHy.togliDalMenu(lambruscoDC);

        System.out.println(malHy.stampaMenu());
        
        
        System.out.println("\n-------------------------\n");


        System.out.println("KEBABBARO\n");
        keb.aggiungiAlMenu(keTu,1.4);
        
        System.out.println(keb.stampaMenu());
        
        
        System.out.println("\n-------------------------\n");

        
        System.out.println("CAMBIO MENU'\n");
        laPerg.cambiaMenu(mcMenu);
        System.out.println(laPerg.stampaMenu());
        
        
        System.out.println("\n-------------------------\n");

        
        System.out.println("CHIOSCO\n");
        Chiosco ch = new Chiosco("Il chiosco del Kebab");
        ch.aggiungiAlMenu(keTu, 4.3);
//        ch.aggiungiAlMenu(bigMac, 2.6);
        
        System.out.println(ch.stampaMenu());
    }
}
