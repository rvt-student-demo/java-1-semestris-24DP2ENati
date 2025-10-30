package rvt;

import java.util.*;

public class JMArrayList {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        System.out.println(strings);

        if (!strings.isEmpty()) {
            strings.remove(strings.size() - 1);
        }

        System.out.println(strings);
    }

    public static void removeLast(ArrayList<String> strings) {
        if (!strings.isEmpty()) {
            strings.remove(strings.size() - 1);
        }
    }

    public static void listSize() {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            list.add(input);
        }

        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("In total: " + list.size());

        scanner.close();
    }

    public static void onlyTheseNumbers() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num == -1) {
                break;
            }
            numbers.add(num);
        }

        System.out.println("From where?");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.println("To where?");
        int end = Integer.parseInt(scanner.nextLine());

        for (int num : numbers) {
            if (num >= start && num <= end) {
                System.out.println(num);

                scanner.close();
            }
        }
    }

    public static void onTheList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            names.add(input);
        }

        System.out.println("Search for?");
        String search = scanner.nextLine();

        if (names.contains(search)) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");

            scanner.close();
        }
    }
}
