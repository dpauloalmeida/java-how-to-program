package com.deitel.exercicios.Capitulo24.Cap24_4;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Scanner;

public class Test {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {

        int choice;

        while ((choice = choiceMenu()) != 0) {
            switch (choice) {
                case 1:
                    Calendar calendar = Calendar.getInstance();

                    ResultQueries.addEmployee(new Employees(
                            "Daniele", "Almeida", calendar,
                            "Salariado", "Produção"));
                    break;

                default:
                    System.out.println("*** Inválido ***");
            }
        }

    }

    public static int choiceMenu() {
        System.out.println("==============================================");
        System.out.println("================ Main Window =================");
        System.out.println("==============================================");
        System.out.println("1 - Insert");
        System.out.println("2 - Update");
        System.out.println("3 - Delete");
        System.out.println("0 - Closed");
        System.out.print("? ");

        int choice = sc.nextInt();

        return choice;
    }
}
