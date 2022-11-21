import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person>{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class TestSet {
    public static void main(String[] args) {
        Set<Person> people = new TreeSet<>();
        people.add(new Person("Dénes", 10));
        people.add(new Person("Béla", 10));
        people.add(new Person("Aladár", 10));
        people.add(new Person("Cecília", 10));

        for(Person person : people){
            System.out.println(person);
        }
    }
}
