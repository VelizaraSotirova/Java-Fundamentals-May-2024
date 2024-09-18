package Exercise.Opinion_Poll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> peopleList = new ArrayList<>();

        int peopleCount = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < peopleCount; i++) {
            String personalData = sc.nextLine();

            String name = personalData.split(" ")[0];
            int age = Integer.parseInt(personalData.split(" ")[1]);

            if (age > 30) {
                Person person = new Person(name, age);
                peopleList.add(person);
            }
        }

        for (Person person : peopleList) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
