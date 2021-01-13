package pl.pen;

import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String string= new String();
        int repeat = scanner.nextInt();
        for (int i = 0; i <= repeat; i++) {
            string = scanner.nextLine();
            System.out.println(shortString(string));
        }
    }

    public static String shortString(String aString) {
        String shortString = new String();
        int stringLength = aString.length();
        aString += "#";
        int charCounter = 0;
        char singleCharFromString = aString.charAt(0);
        for (int i = 0; i <= stringLength; i++) {
            if (singleCharFromString == aString.charAt(i)) {
                charCounter++;
            } else {
                switch (charCounter) {
                    case 2:
                        shortString += singleCharFromString;
                    case 1:
                        shortString += singleCharFromString;
                        break;
                    default:
                        shortString += singleCharFromString;
                        shortString += charCounter;
                }
                charCounter = 1;
                singleCharFromString = aString.charAt(i);

            }
        }
        return shortString;
    }
}
