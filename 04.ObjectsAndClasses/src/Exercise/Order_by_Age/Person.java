package Exercise.Order_by_Age;

public class Person {
    private String name;
    private int id;
    private int age;

    public Person (String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public int getId() {
        return this.id;
    }
    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %d is %d years old.", getName(), getId(), getAge());
    }
}
