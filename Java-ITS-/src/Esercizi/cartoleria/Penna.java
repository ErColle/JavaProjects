package Esercizi.cartoleria;

public class Penna extends Articolo{
    private String colore;

    public Penna(String marca, String modello, Double costo, String colore) {
        super(marca, modello, costo);
        this.colore = colore;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    @Override
    public String toString() {
        return "Penna{" +
                "colore='" + colore + '\'' +
                '}';
    }
}
