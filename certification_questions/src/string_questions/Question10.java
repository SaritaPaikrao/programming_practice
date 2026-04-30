package string_questions;

public class Question10 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Java");
        StringBuffer stringBuffer = new StringBuffer("Java");
        System.out.println(stringBuffer.equals(stringBuilder));
        String s = "Java";
        if(stringBuffer.toString().equals(s)){
            System.out.println("Match 1");
        } else if (stringBuilder.equals(s)) {
            System.out.println("Match 2");
        }else {
            System.out.println("No match");
        }
    }
}
