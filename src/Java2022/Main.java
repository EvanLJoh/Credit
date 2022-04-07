package Java2022;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        long digits;
        digits = input.nextLong();
        int sum = 0;

        String type = String.valueOf(digits);

        if (type.startsWith("3")) {
            System.out.print("AMERICAN EXPRESS");
        } else if (type.startsWith("4")) {
            System.out.print("VISA");
        } else if (type.startsWith("5")) {
            System.out.print("MASTERCARD");
        } else {
            System.out.print("INVALID");
        }

        while (digits > 0)
            digits = digits / 10;

        if (digits % 2 != 0) {
            digits *= 2;
        }

        if (digits > 9) {
            digits = (digits % 10) + 1;
        } else
            digits *= 1;

        sum += digits;

        if (sum % 10 == 0) {
            //System.out.print("VALID");
        } else {
            System.out.print("INVALID");
        }
    }
}
