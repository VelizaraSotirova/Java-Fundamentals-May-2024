package Exercise.Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Student> studentsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            String firstName = input.split(" ")[0];
            String lastName = input.split(" ")[1];
            double grade = Double.parseDouble(input.split(" ")[2]);

            Student student = new Student(firstName, lastName, grade);
            studentsList.add(student);
        }

        studentsList.sort(Comparator.comparingDouble(Student::getGrade)
                .reversed());

        for (Student student : studentsList) {
            System.out.println(student.toString());
        }
    }
}
