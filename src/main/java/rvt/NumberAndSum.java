package rvt;

import java.util.Scanner;

public class NumberAndSum {
    public static void main(String[] args)   {
        Scanner scanner = new Scanner(System.in);
        int numberCount = 0;
        int sum = 0;
        while (true) {
            System.out.print("Give a number: ");
            int number = Integer.parseInt(scanner.nextLine());

            if (number == 0) {

            }      
            
            numberCount++;
            sum += number;
        

        System.out.println("Number of numbers: " + numberCount);
        System.out.println("Sum of the numbers: " + sum);

        scanner.close();
        
    }
}


    

}
