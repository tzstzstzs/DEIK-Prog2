package eloleny;

public class Allat implements Comparable<Allat> {
    protected String faj;
    protected double kor;
    protected double suly;

    public Allat(String faj, double kor, double suly) {
        this.faj = faj;
        this.kor = kor;
        this.suly = suly;
    }

    public String getFaj() {
        return faj;
    }

    public void setFaj(String faj) {
        this.faj = faj;
    }

    public double getKor() {
        return kor;
    }

    public void setKor(double kor) {
        this.kor = kor;
    }

    public double getSuly() {
        return suly;
    }

    public void setSuly(double suly) {
        this.suly = suly;
    }

    @Override
    public String toString() {
        return "<" + faj + ">: " + kor + " év, " + suly + "kg";
    }

    @Override
    public int compareTo(Allat o) {
        return Double.compare(this.suly, o.suly);
    }
}

class Madar extends Allat {
    protected boolean ropkepes;

    public Madar(String faj, double kor, double suly, boolean ropkepes) {
        super(faj, kor, suly);
        this.ropkepes = ropkepes;
    }

    @Override
    public String toString() {
        if (ropkepes) {
            return kor + " éves, " + suly + " kg-os röpképes " + faj;
        }
        return kor + " éves, " + suly + " kg-os röpképtelen " + faj;
    }
}

class Emlos extends Allat {
    protected int labakSzama;

    public Emlos(String faj, double kor, double suly, int labakSzama) {
        super(faj, kor, suly);
        this.labakSzama = labakSzama;
    }
}