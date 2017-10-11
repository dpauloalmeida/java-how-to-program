package com.deitel.exercicios.Capitulo23.Cap23_17;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class ProcessingEmployees {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Danilo Almeida", "TI", 5000),
                new Employee("Diogo Paulo", "TI", 3000),
                new Employee("Danile Almeida", "Gerente", 3000),
                new Employee("Aldi Alves", "Empresario", 3000),
                new Employee("Ana Lucia", "Administracao", 2500)
        };

        List<Employee> list = Arrays.asList(employees);

        Instant start = Instant.now();
        System.out.printf("%-16s%-12s%s%n", "Nome", "Salário", "Departamento");
        list.stream().forEach(System.out::println);
        Instant finish = Instant.now();

        System.out.println(Duration.between(start, finish).toMillis());

        System.out.println();

        start = Instant.now();
        System.out.printf("%-16s%-12s%s%n", "Nome", "Salário", "Departamento");
        list.stream().parallel().forEach(System.out::println);
        finish = Instant.now();

        System.out.println(Duration.between(start, finish).toMillis());
    }
}
