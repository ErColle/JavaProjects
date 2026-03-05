package Esercizi.cartoleria;

import java.util.ArrayList;

public class Magazzino {
    ArrayList<Articolo> articoli = new ArrayList<>();

    public void getAllArticoli(){
        for(Articolo a : articoli ){
            System.out.println(a.toString());
        }
    }

    public Double calcoloCostiTot(){
        Double costi = 0.0;
        for (Articolo a : articoli ){
            costi += a.getCosto();
        }
        return costi;
    }
    public Double calcoloPrezzoTot(){
        Double prezzo = 0.0;
        for (Articolo a : articoli){
            prezzo += a.getPrezzovendita();
        }
        return prezzo;
    }

    public void scaricoArtMagazzino(Articolo a){
        for(Articolo i : articoli){

        }
    }
}
