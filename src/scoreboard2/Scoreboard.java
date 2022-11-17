package scoreboard2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

public class Scoreboard {
    private final String title;
    private final List<Entry> entries;

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

    public class Entry implements Comparable<Entry> {
        private final int score;
        private final String name;

        public Entry(int score, String name) {
            this.score = score;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Entry entry = (Entry) o;
            return name.equals(entry.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        public int getPosition() {
            return Scoreboard.this.entries.indexOf(this) + 1;
        }

        @Override
        public String toString() {
            return String.format("#%d of %s: %d", this.getPosition(),
                    this.name, this.score);
        }

        @Override
        public int compareTo(Entry o) {
            return -Integer.compare(this.score, o.score);
        }
    }
}