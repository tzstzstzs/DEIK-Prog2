package scoreboard2;

import java.util.Collections;

public class ScoreboardTest {
    public static void main(String[] args) {
        Scoreboard sc = new Scoreboard("Prog2");
        sc.getEntries().add(
                sc.new Entry(100, "Teszt Elek")
        );
        sc.getEntries().add(
                sc.new Entry(80, "Para Zita")
        );
        sc.getEntries().add(
                sc.new Entry(90, "Trab Antal")
        );

        System.out.println(sc);
        System.out.println("===");
        Collections.sort(sc.getEntries());
        System.out.println(sc);
    }
}
