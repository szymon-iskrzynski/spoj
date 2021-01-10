package pl.primeNumbers;

import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int repeat = scanner.nextInt();
        for (int i = 1; i <= repeat; i++) {

            int number = scanner.nextInt();
            System.out.println(isItPrimeNumber(number));
        }
    }

    public static String isItPrimeNumber(int aNumber) {
        if (aNumber < 2) {
            return "NIE";
        }

        for (int i = 2; i < (aNumber/2)+1; i++) {
            if (aNumber % i == 0) {
                return "NIE";
            }
        }
        return "TAK";
    }
}
