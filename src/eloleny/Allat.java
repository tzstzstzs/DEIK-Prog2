package eloleny;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

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

    public static void main(String[] args) {
        Allat elefant = new Allat("Elefánt", 3.5, 870);
        System.out.println(elefant);

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Allat[] allatok = new Allat[n];
        for (int i = 0; i < n; i++){
            String[] tokens = sc.nextLine().split(" ");
            if ("true".equals(tokens[3]) || "false".equals(tokens[3])) {
                allatok[i] = new Madar(
                        tokens[0],
                        Double.parseDouble(tokens[1]),
                        Double.parseDouble(tokens[2]),
                        Boolean.parseBoolean((tokens[3]))
                );
            } else {
                allatok[i] = new Emlos(
                        tokens[0],
                        Double.parseDouble(tokens[1]),
                        Double.parseDouble(tokens[2]),
                        Integer.parseInt(tokens[3])

                );
            }
        }

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

    private Boolean lathatoLabnyom (double suly, int labakSzama) {
        int sulyPerLab = 10;
        if (suly / labakSzama <= sulyPerLab) {
            return false;
        }
        return true;


    }
}