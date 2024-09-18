package Exercise;
import java.util.*;
public class Company_Users {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companyEmployees = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String companyName = input.split(" -> ")[0]; //име на компанията
            String employeeId = input.split(" -> ")[1];  //id на служителя

            if (companyEmployees.containsKey(companyName)) {
                List<String> currentEmployees = companyEmployees.get(companyName); //текущи служители
                //!!!! добавяме служител само ако го няма
                if (!currentEmployees.contains(employeeId)) {
                    currentEmployees.add(employeeId);
                }
            } else {
                companyEmployees.put(companyName, new ArrayList<>());
                companyEmployees.get(companyName).add(employeeId);
            }

            input = scanner.nextLine();
        }

        companyEmployees.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            for (String employee : entry.getValue()) {
                System.out.println("-- " + employee);
            }
        });
    }
}
