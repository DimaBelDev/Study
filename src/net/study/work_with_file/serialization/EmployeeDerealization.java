package net.study.work_with_file.serialization;

import java.io.*;

public class EmployeeDerealization {
    public static void main(String[] args) {
        Employee employee;
        try(ObjectInputStream derealization = new ObjectInputStream(
                new FileInputStream("employee.bin"))){
             employee = (Employee) derealization.readObject();
            System.out.println(employee);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
