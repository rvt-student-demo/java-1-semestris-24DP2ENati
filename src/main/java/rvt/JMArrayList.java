package rvt;

import java.util.*;

public class JMArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            list.add(input);
        }

        System.out.println("In total: " + list.size());

        scanner.close();
    }


    public static void onlyTheseNumbers() {}
    public static void listSize() {}
    public static void onTheList(){}
    public static void removeLast(ArrayList<String> strings) {}

    




}
