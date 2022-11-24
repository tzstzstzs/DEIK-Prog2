package labbeli;

import java.util.Objects;

public class CipoTetel {
    private Cipo csuka;
    private int darab;

    public CipoTetel(Cipo csuka, int darab) {
        this.csuka = csuka;
        this.darab = darab;
    }

    public Cipo getCsuka() {
        return csuka;
    }

    public int getDarab() {
        return darab;
    }

    public void novelDarabszam(int n){
        this.darab += n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CipoTetel cipoTetel = (CipoTetel) o;
        return csuka.equals(cipoTetel.csuka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(csuka);
    }

    @Override
    public String toString() {
        return "CipoTetel{" +
                "csuka=" + csuka +
                ", darab=" + darab +
                '}';
    }
}
