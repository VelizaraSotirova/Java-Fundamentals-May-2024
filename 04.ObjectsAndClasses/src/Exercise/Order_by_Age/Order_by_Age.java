package Exercise.Order_by_Age;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Order_by_Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        String input = sc.nextLine();
        while(!input.equals("End")) {
            String[] tokens = input.split(" ");
            String name = tokens[0];
            int id = Integer.parseInt(tokens[1]);
            int age = Integer.parseInt(tokens[2]);

            Person person = new Person(name, id, age);
            people.add(person);

            input = sc.nextLine();
        }

        people.sort(Comparator.comparing(Person::getAge));

        for (var person : people) {
            System.out.println(person.toString());
        }
    }
}
