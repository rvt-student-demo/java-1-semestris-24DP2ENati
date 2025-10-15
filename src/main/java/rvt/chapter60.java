package rvt;

public class chapter60 {

    public static void ex4(String[] args) {
        int[] valA = { 13, -22, 82, 17 };
        int[] valB = { 0, 0, 0, 0 };

        // Put values into valB so that the sum of the values
        // in corresponding cells of valA and valB is 25.
        valB[0] = 12;
        valB[1] = 47;
        valB[2] = -57;
        valB[3] = 8;

        System.out.println("valA: "
            + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3]);

        System.out.println("valB: "
            + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3]);

        System.out.println("sum: "
            + (valA[0] + valB[0]) + " " + (valA[1] + valB[1]) + " "
            + (valA[2] + valB[2]) + " " + (valA[3] + valB[3]));
    }

    public static void ex5(String[] args) {
        int[] val = { 67, 69, 96, 420, 4, 15, 56, 70 };
        int temp;

        System.out.println("Original Array: "
            + val[0] + " " + val[1] + " " + val[2] + " " + val[3]
            + " " + val[4] + " " + val[5] + " " + val[6] + " " + val[7]);

        // reverse the order of the numbers in the array
        for (int i = 0; i < val.length / 2; i++) {
            temp = val[i];
            val[i] = val[val.length - 1 - i];
            val[val.length - 1 - i] = temp;
        }

        System.out.println("Reversed Array: "
            + val[0] + " " + val[1] + " " + val[2] + " " + val[3]
            + " " + val[4] + " " + val[5] + " " + val[6] + " " + val[7]);
    }

    public static void main(String[] args) {
        ex4(args);
        ex5(args);
    }
}