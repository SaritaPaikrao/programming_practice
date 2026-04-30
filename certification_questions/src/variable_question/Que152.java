package variable_question;

public class Que152 {
    public static void main(String[] args) {
        int wd=0;
        String days[] = {"sun","mon","wed","sat"};
        for(String st : days){
            switch (st){
                case "sat":
                case "sun":
                    wd -=1;
                    break;
                case "mon":
                    wd++;
                case "wed":
                    wd +=2;

            }
        }
        System.out.println(wd);
    }
}
