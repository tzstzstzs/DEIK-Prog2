package Vehicle;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringJoiner;

public class Auto {
    private String rendszam;
    private int teljesitmeny;
    private boolean automata;

    public Auto(String rendszam, int teljesitmeny, boolean automata) {
        this.rendszam = rendszam;
        this.teljesitmeny = teljesitmeny;
        this.automata = automata;
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getTeljesitmeny() {
        return teljesitmeny;
    }

    public boolean isAutomata() {
        return automata;
    }

    /*@Override
    public String toString() {
        return "Auto{" +
                "rendszam='" + rendszam + '\'' +
                ", teljesitmeny=" + teljesitmeny +
                ", automata=" + automata +
                '}';
    }*/

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner((", "));
        sj.add(this.rendszam);
        sj.add(String.valueOf(teljesitmeny));
        sj.add(String.valueOf(automata));
        return sj.toString();
    }
}
