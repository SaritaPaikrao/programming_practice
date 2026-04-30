package org.enumpractice;

public class EnumExample {
    public static void main(String[] args) {
    for(WEEK wk : WEEK.values()){
        System.out.println(wk);
    }
        WEEK.Friday.getWeekend();
    }
}

enum WEEK implements Weekend{
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    ;


    @Override
    public void getWeekend() {
        System.out.println("Saturday");
        System.out.println("Sunday");    }
}
interface Weekend{
  void getWeekend();
    }
