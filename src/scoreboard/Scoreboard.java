package scoreboard;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Scoreboard {
    private String title;
    private List<Entry> entries;

    public Scoreboard(String title) {
        this.title = title;
        this.entries = new ArrayList<>();
    }

    public List<Entry> getEntries() {
        return entries;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner("\n");
        sj.add(this.title.toUpperCase());
        for (Entry entry : this.entries) {
            sj.add(entry.toString());
        }
        return sj.toString();
    }

    public static class Entry implements Comparable<Entry> {
        private int score;
        private int position;
        private String name;

        public Entry(int position, int score, String name) {
            this.score = score;
            this.position = position;
            this.name = name;
        }

        @Override
        public String toString() {
            return String.format("#%d of %s: %d", this.position,
                    this.name, this.score);
        }

        @Override
        public int compareTo(Entry o) {
            return Integer.compare(this.position, o.position);
        }
    }
}