package designpatterns.builderpattern;

public class Person {
    String name;
    int age;
    String occupation;
    String married;

    private Person(PersonBuilder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.occupation = builder.occupation;
        this.married = builder.married;
    }

    public static class PersonBuilder{
        String name;
        int age;
        String occupation;
        String married;

        public PersonBuilder name(String name){
            this.name = name;
            return this;
        }
        public PersonBuilder age(int age){
            this.age = age;
            return this;
        }
        public PersonBuilder occupation(String occupation){
            this.occupation = occupation;
            return this;
        }
        public PersonBuilder married(String married){
            this.married = married;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }
    public String toString() {
        return "Person[name='" + name + "', age=" + age + ", occupation='" + occupation + "', married='" + married + "']";
    }
}
