package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample1 {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(new Employee(101,"Ram", "Developer", 10000),
                new Employee(102,"Ram", "Developer", 5000), new Employee(103,"Shyam", "Developer", 15000), new Employee(104,"Sita", "Developer", 19000));

        List<Employee> list = empList.stream().filter(e-> e.getSalary() > 5000 && e.getSalary() < 15000).collect(Collectors.toList());
        System.out.println(list);
    }
}

