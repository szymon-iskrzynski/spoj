package pl.pen;

import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int repeat = scanner.nextInt();
        for (int i = 1; i <= repeat; i++) {

            String string = scanner.nextLine();
            System.out.println(shortString("asd"));
        }
    }

    public static String shortString(String aString) {
        return "a";
    }
}
