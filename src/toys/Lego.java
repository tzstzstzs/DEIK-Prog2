package toys;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Objects;

public class Lego implements Comparable<Lego> {
    int serial;
    String name;
    String theme;
    int nrOfPieces;

    public Lego(int serial, String name, String theme, int nrOfPieces) {
        this.serial = serial;
        this.name = name;
        this.theme = theme;
        this.nrOfPieces = nrOfPieces;
    }

    @Override
    public String toString() {
        return name +
                " (" + serial +
                "): " + nrOfPieces +
                " - " + theme;
    }

    @Override
    public int compareTo(Lego o) {
        if (this.nrOfPieces != o.nrOfPieces) {
            return -Integer.compare(this.nrOfPieces, o.nrOfPieces);
        }

        if (!Objects.equals(this.name, o.name)) {
            return this.name.compareTo(o.name);
        }

        return Integer.compare(this.serial, o.serial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Lego[] legos = new Lego[n];
        for (int i = 0; i < n; i++) {
            String[] tokens = sc.nextLine().split(";");
            legos[i] = new Lego(
                    Integer.parseInt(tokens[0]),
                    tokens[1],
                    tokens[2],
                    Integer.parseInt(tokens[3])
            );
        }

        Arrays.sort(legos);
        for (Lego lego : legos) {
            System.out.println(lego);
        }
        System.out.println();

        Arrays.sort(legos, new LegoComparator());
        for (Lego lego : legos) {
            System.out.println(lego);
        }
    }

    static class LegoComparator implements Comparator<Lego>{
        public int compare(Lego o1, Lego o2){
            if (!Objects.equals(o1.theme, o2.theme)){
                return o1.theme.compareTo(o2.theme);
            }

            if (!Objects.equals(o1.name, o2.name)){
                return o1.name.compareTo(o2.name);
            }

            return Integer.compare(o1.serial, o2.serial);
        }
    }
}
