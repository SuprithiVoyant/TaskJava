package designpatterns.builderpattern;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person.PersonBuilder()
                .name("Suprith")
                .married("No")
                .age(22)
                .occupation("Intern")
                .build();

        Person person2 = new Person.PersonBuilder()
                .name("Tony stark")
                .married("yes")
                .age(45)
                .occupation("Iron man")
                .build();

        System.out.println(person1.toString());
        System.out.println(person2.toString());
    }
}
