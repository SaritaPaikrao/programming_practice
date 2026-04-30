package variable_question;

public class Q102 {

        static int count = 0;
        int i =0;
        public void change(){

       while(i<5){
           i++;
           count++;
       }

    }

    public static void main(String[] args) {
        Q102 q102 = new Q102();
        Q102 q103 = new Q102();
        q102.change();
        q103.change();
        System.out.println(q102.count+"  "+q103.count);
        Float fltb=100.00f;
        double y1 =  203.22;//float flt = y1;
    }
}
