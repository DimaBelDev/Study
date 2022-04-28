package net.study.other.scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // String s1 = scanner.next(); // передает значение до пробела
        // System.out.println(s1);
//        String s2 = scanner.nextLine();// передает стороку
//        String s3 = scanner.nextLine();
//        System.out.println("First " + s2);
//        System.out.println("Second " + s3);
//
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        System.out.println(x + y);
          Scanner scanner = new Scanner("Hey \n How are you \n what were you doing \n");
        System.out.println(scanner.nextLine());

        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

    }
}
