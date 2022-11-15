package People;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person>{
    static int counter;
    static int AGE_LIMIT;

    static {
        AGE_LIMIT = 18;
    }

    protected String id;
    protected String name;
    protected int age;
    private boolean male;

    public Person(String id, String name, int age, boolean male) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.male = male;
    }

    public Person(String id, String name, int age) {
        this(id, name, age, true);
    }

    public Person() {
        super(); //fontos
        counter++;
    }

    public static boolean isAdult(Person person) {
        return person.age >= AGE_LIMIT;
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

    public boolean isAdult() {
        return age >= AGE_LIMIT;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    @Override
    public int compareTo(Person o) {
        /*
        if(age < o.age){
            return -1;
        }
        if(age > o.age){
            return 1;
        }

         */
        if(age != o.age){
            return Integer.compare(age, o.age);
        }

        return id.compareTo(o.id);
    }

    public class NestedPersonComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            if (o1.age != o2.age){
                return Integer.compare(o1.age, o2.age);
            }
            return o1.id.compareTo(o2.id);
        }
    }

    public static class StaticNestedPersonComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            if (o1.age != o2.age){
                return Integer.compare(o1.age, o2.age);
            }
            return o1.id.compareTo(o2.id);
        }
    }
}


