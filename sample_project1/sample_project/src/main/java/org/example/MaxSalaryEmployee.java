package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxSalaryEmployee {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101, "Sarita", 60000));
        empList.add(new Employee(102, "Vikas", 120000));
        empList.add(new Employee(103, "Riva", 220000));

        Employee maxEmployee = empList.stream().max(Comparator.comparingLong(Employee::getSalary)).orElse(null);

        System.out.println(maxEmployee);
    }
}
