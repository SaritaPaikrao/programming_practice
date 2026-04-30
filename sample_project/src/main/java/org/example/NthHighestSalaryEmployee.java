package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSalaryEmployee {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee(101,"ABC","xyz", 12344),
                new Employee(101,"ABC","xyz", 12344),
                new Employee(101,"DFG","khm", 54523),
                new Employee(101,"KJH","uio", 453423),
                new Employee(101,"HGH ","dss", 454344));
        Map<Long,List<Employee>> mpEmp = list.stream().collect(Collectors.groupingBy(Employee::getSalary));
        mpEmp.entrySet().stream().sorted((e1,e2) -> Long.compare(e2.getKey(),e1.getKey()))
                        .skip(5-1).findFirst();
        System.out.println(mpEmp);
     }
}
