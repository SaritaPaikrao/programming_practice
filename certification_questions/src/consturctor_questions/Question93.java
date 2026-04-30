package consturctor_questions;

public class Question93 {
    public static void main(String[] args) {
      //  Employee employee = new Employee();
        Employee employee1 =  new Employee("Jack", 50);
        Employee employee2 = new Employee("Jack",40,30000);
    }
}

class Employee{
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age) {
        setName(name);
        setAge(age);
        setSalary(20000);
    }
public void printDetails(){
    System.out.println(name+" "+age+" "+salary);
}
    public Employee(String name, int age, int salary) {
        this(name,age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
