package People;

import java.util.Objects;

public class Person {
    String id;
    String name;
    int age;
    boolean male;

    public Person(String id, String name, int age, boolean male) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.male = male;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", male=" + male +
                '}';
    }
    public Person(String id, String name, int age) {
        this(id, name, age, true);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
