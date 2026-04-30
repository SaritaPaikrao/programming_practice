package string_questions;

public class Question92 {
    public static void main(String[] args) {
        String name[] = {"thomas", "Peter", "Joseph"};
        String pwd[] = new String[3];
        int idx = 0;
         try{
             for(String s:name){
                 pwd[idx] = s.substring(2,6);
             }
         }catch (Exception e){
             System.out.println("Inavlid");
         }
         for (String p: pwd){
             System.out.println(p);
         }
    }
}
