package Esercizi.cartoleria;

public class Gomma extends Articolo{
    private int dimensioneCm;
    private String forma;

    public Gomma(String marca, String modello, Double costo, int dimensioneCm, String forma) {
        super(marca, modello, costo);
        this.dimensioneCm = dimensioneCm;
        this.forma = forma;
    }

    public int getDimensioneCm() {
        return dimensioneCm;
    }

    public void setDimensioneCm(int dimensioneCm) {
        this.dimensioneCm = dimensioneCm;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    @Override
    public String toString() {
        return "Gomma{" +
                "dimensioneCm=" + dimensioneCm +
                ", forma='" + forma + '\'' +
                '}';
    }
}
