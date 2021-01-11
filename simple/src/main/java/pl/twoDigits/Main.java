package pl.twoDigits;

import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int repeat = scanner.nextInt();
        for (int i = 1; i <= repeat; i++) {

            int number = scanner.nextInt();
            int digit = lastDigits(number);
            System.out.println(digit / 10 + " " + digit % 10);
        }
    }

    public static int lastDigits(int aNumber) {
        int digits[] = {1, 1, 2, 6, 24, 20, 20, 40, 20, 80, 00};

        if (aNumber < 10) {
            return digits[aNumber];
        } else return 0;
    }
}
