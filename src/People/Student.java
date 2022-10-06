package People;

public class Student extends Person{
    private String neptun;

    public Student(String id, String name, int age, boolean male, String neptun) {
        super(id, name, age, male);
        this.neptun = neptun;
    }

    @Override
    public String toString() {
        return "Student{" +
                "neptun='" + neptun + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                "} " + super.toString();
    }

    /*
    public boolean isAdult(){
        return super.isAdult();

     */
}
