package designpatterns.prototypepattern;

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student(12,"Science","Suprith");

        Student cloneStd1 = (Student) std1.clone();

        System.out.println(std1);
        System.out.println(cloneStd1);
    }
}
