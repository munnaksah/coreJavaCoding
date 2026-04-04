package com.kodewala.stream.practics;


import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    double salary;
     

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

public class Driver5 {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee("Abhishesk", 50000),
                new Employee("Deepak", 70000),
                new Employee("Murali", 60000),
                new Employee("Sudhir", 70000)
        );

        Optional<Double> secondHighest = list.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        
     
        
        System.out.println("secondHighest : "+ secondHighest);

//        secondHighest.ifPresent(System.out::println);
    }
}