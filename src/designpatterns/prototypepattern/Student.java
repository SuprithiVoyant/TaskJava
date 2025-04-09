package designpatterns.prototypepattern;

public class Student implements Prototype {
    int roll;
    String subject;
    String name;

    public Student(int roll, String subject, String name) {
        this.roll = roll;
        this.subject = subject;
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new Student(roll, subject, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", subject='" + subject + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
