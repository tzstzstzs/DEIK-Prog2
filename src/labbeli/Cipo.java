package labbeli;

import java.util.Objects;

public class Cipo implements Comparable{
    private String marka;
    private Double meret;
    private String fajta;
    private Boolean magasarku;

    public Cipo(String marka, Double meret, String fajta, Boolean magasarku) {
        this.marka = marka;
        this.meret = meret;
        this.fajta = fajta;
        this.magasarku = magasarku;
    }

    public Double getMeret() {
        return meret;
    }

    public String getMarka() {
        return marka;
    }

    public String getFajta() {
        return fajta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cipo cipo = (Cipo) o;
        return Objects.equals(marka, cipo.marka) && Objects.equals(meret, cipo.meret)
                && Objects.equals(fajta, cipo.fajta) && Objects.equals(magasarku, cipo.magasarku);
    }

    @Override
    public String toString() {
        if (magasarku){
            return marka + " márkájú magas sarkú " + fajta + ", mérete: " + meret;
        }
        return marka + " márkájú " + fajta + ", mérete: " + meret;
    }

    @Override
    public int compareTo(Object o) {
        if (this.meret != getMeret()){
            return Double.compare(this.meret, getMeret());
        }
        if (!Objects.equals(this.fajta, getFajta())){
            return this.fajta.compareTo(getFajta());
        }
        return this.marka.compareTo(getMarka());
    }
}

class Csizma extends Cipo{
    private Boolean belelt;

    public Csizma(String marka, Double meret, String fajta, Boolean magasarku, Boolean belelt) {
        super(marka, meret, fajta, magasarku);
        this.belelt = belelt;
    }

    @Override
    public String toString() {
        if (belelt) {
            return super.toString() + ", belelt";
        }
        return super.toString() + ", nem belelt";
    }
}