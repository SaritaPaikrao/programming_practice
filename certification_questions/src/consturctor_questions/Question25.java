package consturctor_questions;

public class Question25 {
    String name;
    boolean contract;
    double  salary;
    Question25(){
        this.name="Joe";
        this.contract=true;
        this.salary=10000;
    }

    @Override
    public String toString() {
        return "Question25{" +
                "name='" + name + '\'' +
                ", contract=" + contract +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Question25 question25 = new Question25();
        question25.name="Joe";
        question25.contract=true;
        question25.salary=10000;
        System.out.println(question25);
    }
}
