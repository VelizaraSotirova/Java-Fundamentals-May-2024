package Lab;

import java.util.*;

public class List_Manipulation_Advanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>(Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList());
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();
        List<Integer> filtered = new ArrayList<>();

        String input = sc.nextLine();
        while(!input.equals("end")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            switch (command) {
                case "Contains" -> {
                    int num = Integer.parseInt(tokens[1]);
                    if(nums.contains(num)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                }
                case "Print" -> {
                    String evenOrOdd = tokens[1];
                    for (var number : nums) {
                        if (number % 2 == 0) {
                            evens.add(number);
                        } else {
                            odds.add(number);
                        }
                    }

                    if(evenOrOdd.equals("even")) {
                        for (var number : evens) {
                            System.out.print(number + " ");
                        }
                        System.out.println();
                    } else {
                        for (var number : odds) {
                            System.out.print(number + " ");
                        }
                        System.out.println();
                    }
                    evens.clear();
                    odds.clear();
                }
                case "Get" -> {
                    int sum = 0;
                    for (int number : nums) {
                        sum += number;
                    }
                    System.out.println(sum);
                }
                case "Filter" -> {
                    String condition = tokens[1];
                    int number = Integer.parseInt(tokens[2]);
                    if (condition.equals("<")) {
                        for (int num : nums) {
                            if (num < number) {
                                filtered.add(num);
                            }
                        }
                        printingArray(filtered);
                    } else if (condition.equals("<=")) {
                        for (int num : nums) {
                            if (num <= number) {
                                filtered.add(num);
                            }
                        }
                        printingArray(filtered);
                    } else if (condition.equals(">")) {
                        for (int num : nums) {
                            if (num > number) {
                                filtered.add(num);
                            }
                        }
                        printingArray(filtered);
                    } else if (condition.equals(">=")) {
                        for (int num : nums) {
                            if (num >= number) {
                                filtered.add(num);
                            }
                        }
                        printingArray(filtered);
                    }
                    filtered.clear();
                }
            }

            input = sc.nextLine();
        }
    }

    private static void printingArray(List<Integer> filtered) {
        for (int num : filtered) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
