public class Person {

    private String name;
    private int age;

    public Person (String name, int age) {
        //initializes variables for person's name & age
        this.name = name;
        this.age = age;
        }

    public String getName () {
        //returns specified name
        return this.name;
        }

    public int getAge () {
        //returns specified age
        return this.age;
        }

    public String toString() {
        //returns specified string instead of standard response
        return this.name + " is " + this.age + " years old.";
    }
}
