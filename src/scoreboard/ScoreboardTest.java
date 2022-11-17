package scoreboard;

import java.util.Collection;
import java.util.Collections;

public class ScoreboardTest {
    public static void main(String[] args) {
        Scoreboard sc = new Scoreboard("Prog2");
        sc.getEntries().add(
                new Scoreboard.Entry(1, 100, "Teszt Elek")
        );
        sc.getEntries().add(
                new Scoreboard.Entry(3, 80, "Para Zita")
        );
        sc.getEntries().add(
                new Scoreboard.Entry(2, 90, "Trab Antal")
        );

        System.out.println(sc);
        System.out.println("===");
        Collections.sort(sc.getEntries());
        System.out.println(sc);
    }
}
