package labbeli;

import java.util.Scanner;

public class TestCipo {
    public static void main(String[] args) {
        /*Cipo cipo1 = new Cipo("Nike", 43.0, "futócipő", false);
        System.out.println(cipo1);
        Cipo cipo2 = new Cipo("Michael Kors", 38.0, "báli cipő", true);
        System.out.println(cipo2);
        Csizma cipo3 = new Csizma("Timberland", 43.5, "Túracipő", false, true);
        System.out.println(cipo3);
        Csizma cipo4 = new Csizma("Prada", 37.0, "téli cipő", true, false);

        CipoTetel x1 = new CipoTetel(cipo1, 34);
        CipoTetel x2 = new CipoTetel(cipo2, 22);
        CipoTetel x3 = new CipoTetel(cipo3, 45);
        CipoTetel x4 = new CipoTetel(cipo4, 21);
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);*/

        Scanner sc = new Scanner(System.in);
        CipoTetel[] cipok = new CipoTetel[];
        int counter = 0;
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            String[] tokens = line.split(";");
            if (tokens.length() == 4){
                cipok[counter] = new CipoTetel(
                        tokens
                )
            }
        }

    }
}
