package org.example;

import java.util.Objects;

public class Employee {
    int empId;
    String name;
    String desig;
    long salary;

    public Employee(int empId, String name, String desig, long salary) {
        this.empId = empId;
        this.name = name;
        this.desig = desig;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(desig, employee.desig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, name, desig, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", desig='" + desig + '\'' +
                ", salary=" + salary +
                '}';
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }
}
