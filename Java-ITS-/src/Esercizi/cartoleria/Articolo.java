package Esercizi.cartoleria;

public class Articolo {
    private String marca;
    private String modello;
    private Double costo;
    private Double prezzovendita;

    public Articolo(String marca, String modello, Double costo) {
        this.marca = marca;
        this.modello = modello;
        this.costo = costo;
        this.prezzovendita = costo * 2;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Double getPrezzovendita() {
        return prezzovendita;
    }

    public void setPrezzovendita(Double prezzovendita) {
        this.prezzovendita = prezzovendita;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", costo=" + costo +
                ", prezzovendita=" + prezzovendita +
                '}';
    }
}
