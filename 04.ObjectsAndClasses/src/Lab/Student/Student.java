package Lab.Student;

public class Student {
    public Student (String firstName, String lastName, int age, String homeTown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.homeTown = homeTown;
    }

    private String firstName;
    private String lastName;
    private int age;
    private String homeTown;

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getHomeTown() { return homeTown; }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    public void setLastName (String firstName) {
        this.lastName = lastName;
    }
    public void setAge (int age) {
        this.age = age;
    }
    public void setHomeTown (String homeTown) {
        this.homeTown = homeTown;
    }
}
