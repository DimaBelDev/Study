package net.study.other.scanner;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ScannerTest2 {
    public static void main(String[] args) {

        Set<String> stringSet = new TreeSet<>();

        try (Scanner scanner = new Scanner(new FileReader(new File("C:\\Users\\Anonymous\\Desktop\\test1.txt")))){
            while (scanner.hasNext()){
                stringSet.add(scanner.useDelimiter("\\W").next()); // для разделения использую пробелы запятые и т.д.
            }
            for(String i : stringSet){
                System.out.println(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
