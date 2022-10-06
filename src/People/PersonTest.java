package People;

import java.util.Objects;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("P01", "Aladár", 18, true);
        System.out.println(p1);
        Person p2 = new Person("P01", "Aladár", 18, true);
        System.out.println(p2);
        /*
        p1.id = "P01";
        p1.name = "Aladár";
        p1.age = 18;
        p1.male = true;
         */
        System.out.println(p1);
        System.out.println(p1.id + ' ' + p1.name);
        System.out.println(p1.toString());
        Person p3 = p2;

        System.out.println(p1 == p2);
        System.out.println(p1 == p3);
        System.out.println(p2 == p3);
        System.out.println(p1.equals(p2));
        System.out.println(Objects.equals(p1, p2));

        System.out.println(Person.counter);

        System.out.println(p1.isAdult());
        System.out.println(Person.isAdult(p1));

        Student s1 = new Student("S1", "Béla", 25, true, "AAA123");
        System.out.println(s1);

        p1.new NestedPersonComparator();
        new Person.StaticNestedPersonComparator();
    }
}