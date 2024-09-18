package Lab.Student;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Student> students = new ArrayList<>();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");

            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String homeTown = tokens[3];

            Student student = new Student(firstName, lastName, age, homeTown);

            students.add(student);

            input = sc.nextLine();
        }

        String town = sc.nextLine();
        for (Student student : students) {
            if(student.getHomeTown().equals(town)) {
                System.out.printf("%s %s is %d years old\n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}
