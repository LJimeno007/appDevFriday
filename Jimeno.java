class Person {
    String name;
    int age;
    
    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method to display information
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Love Jimeno", 22);
        p1.displayInfo();
    }
}
