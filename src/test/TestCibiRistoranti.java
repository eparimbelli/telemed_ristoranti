/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import alimenti.Alimento;
import alimenti.bevande.Vino;
import alimenti.bevande.VinoBio;
import alimenti.cibi.Carne;
import alimenti.cibi.Kebab;
import java.io.File;
import menu.Menu;
import ristoranti.Chiosco;
import ristoranti.Enoteca;
import ristoranti.EnotecaBiologica;
import ristoranti.EsercizioRistorazione;
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
        Alimento lambruscoDC = new Vino("Lambrusco del Castello", 13.5, "Lambrusco", "Rosso");
        Alimento bonardaBio = new VinoBio("Bonarda Oltrepò", 14, "Bonarda", "Rosso");
        Alimento barberaBio = new VinoBio("Barbera Oltrepò", 13.5, "Barbera", "Rosso");
        Alimento ham = new Carne("Scamone", "Chianina", "Hamburger");
        Alimento keTu = new Kebab(true, false, "Agnello", "Kebab Turco");
        Alimento bigMac = new Carne("Ogni parte","Ogni bestia","Big Mac");

        //ESERCIZI DI RISTORAZIONE
        EsercizioRistorazione laPerg = new Ristorante("La Pergola");
        EsercizioRistorazione vecFat = new RistoranteBiologico("La veccchia fattoria");
        EsercizioRistorazione becCo = new Enoteca("Il bevitor cortese");
        EsercizioRistorazione malHy = new EnotecaBiologica("Dai maledetti hyppies");
        EsercizioRistorazione keb = new Ristorante("Istambul Kebab");
        EsercizioRistorazione lett = new Ristorante("Il Lettore");
        
        //MENU
        Menu mcMenu = new Menu();
        mcMenu.aggiungi(bigMac, 1);
        mcMenu.aggiungi(lambruscoDC, 1);

        
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
//        vecFat.aggiungiAlMenu(ham,6); //fails notBio
//        vecFat.aggiungiAlMenu(lambruscoDC,8); //fials notBio
        vecFat.aggiungiAlMenu(bonardaBio,14);

        System.out.println(vecFat.stampaMenu());

//        vecFat.togliDalMenu(ham);
//        System.out.println(vecFat.stampaMenu());


        System.out.println("\n-------------------------\n");


        System.out.println("ENOTECA\n");
//        becCo.aggiungiAlMenu(ham,3); //fails notWine
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
        
        //try this at home.... should work OK
//        laPerg.cambiaMenu(mcMenu);
//        System.out.println(laPerg.stampaMenu());
        
        becCo.cambiaMenu(mcMenu);
        System.out.println(becCo.stampaMenu());

        System.out.println("\n-------------------------\n");
        System.out.println("CAMBIO MENU' 2\n");
        malHy.cambiaMenu(mcMenu);
        System.out.println(malHy.stampaMenu());

        System.out.println("\n-------------------------\n");

        
        System.out.println("CHIOSCO\n");
        Chiosco ch = new Chiosco("Il chiosco del Kebab");
        ch.aggiungiAlMenu(keTu, 4.3);
//        ch.aggiungiAlMenu(bigMac, 2.6);
        
        System.out.println(ch.stampaMenu());
        
        System.out.println("\n-------------------------\n");

        
        System.out.println("IL LETTORE\n");
        Menu menuDaFile = new Menu();
        menuDaFile.popola(new File("files/menu1.txt"));
        lett.cambiaMenu(menuDaFile);
        
        System.out.println(lett.stampaMenu());
        
        System.out.println("\n-------------------------\n");
    }
}
