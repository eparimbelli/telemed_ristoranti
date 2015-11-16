package menu;

import alimenti.Alimento;
import alimenti.bevande.Vino;
import alimenti.cibi.Carne;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matteo Gabetta <matteo.gabetta at unipv.it>
 */
public class Menu {

    private ArrayList<ElementoMenu> lista;
    /**
     * 
     * @param maxPrice 
     */
    public Menu(){
        lista = new ArrayList<ElementoMenu>();
    }

    
    /**
     * 
     * @param alimento
     * @param prezzo
     * @throws AlimentoTroppoCaroException  
     */
    public void aggiungi(Alimento alimento, double prezzo){
        lista.add(new ElementoMenu(alimento, prezzo));
    }

    /**
     * 
     * @param alimento
     */
    public void rimuovi(Alimento alimento) {
        ArrayList<ElementoMenu> toBeRemoved = new ArrayList<ElementoMenu>();
        for (ElementoMenu e : lista) {
            if (e.getAlimento().equals(alimento)) {
                toBeRemoved.add(e);
            }
        }
        lista.removeAll(toBeRemoved);
    }

    /**
     * 
     * @return
     */
    @Override
    public String toString() {
        String out = "";
        for (ElementoMenu e : lista) {
            out += e.toString();
        }
        return out;
    }

    /**
     * 
     */
    public void ordinaListaPerPrezzo() {
        Collections.sort(lista, new Comparator<ElementoMenu>() {

            @Override
            public int compare(ElementoMenu t, ElementoMenu t1) {
                double dif = t.getPrezzo() - t1.getPrezzo();
                if (dif > 0) {
                    return 1;
                } else {
                    if (dif < 0) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        });
    }

    /**
     * 
     * @param inputFile
     */
    public void popola(File inputFile) {
        try {
            FileReader fr = new FileReader(inputFile);
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
                String line = br.readLine();
                String[] lineSplit = line.split("\t");

                switch (Integer.parseInt(lineSplit[0])) {

                    //Carne
                    case 0:
                        Carne carne = new Carne(lineSplit[3], lineSplit[2], lineSplit[1]);
                        aggiungi(carne, Double.parseDouble(lineSplit[4]));
                        break;

                    //Vino  
                    case 1:
                        Vino vino = new Vino(lineSplit[1], Double.parseDouble(lineSplit[2]), lineSplit[3], lineSplit[4]);
                        aggiungi(vino, Double.parseDouble(lineSplit[5]));
                        break;
                }
            }
        }
        catch (FileNotFoundException ex1){
            //Qualcosa...
        }
        catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
