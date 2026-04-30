package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxSalaryEmployee {
    public static void main(String[] args) {
        List<Employee> empList =  new ArrayList<>();
        empList.add(new Employee(101,"ABC", 709875));
        empList.add(new Employee(102,"DEF", 234345));
        empList.add(new Employee(103,"GFI", 543423));
        Employee maxSalaryEmp = empList.stream().max(Comparator.comparingLong(Employee::getSalary)).orElse(null);
        System.out.println(maxSalaryEmp);
        /// ////////////////////////////////////////////////////////////
        //sort employee with two different fields
        empList.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getEmpId)).forEach(System.out::println);

    }
}
