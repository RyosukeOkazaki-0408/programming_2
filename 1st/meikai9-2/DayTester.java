// mainメソッドを含むDayTesterクラスを書く

public class DayTester{
    public static void main (String [] args){

        Day pattern_1 = new Day();
        Day pattern_2 = new Day(120);
        Day pattern_3 = new Day(1500,12);
        Day pattern_4 = new Day(2006,4,8);
        Day pattern_5 = new Day(pattern_4);
        
        System.out.println(pattern_1);
        System.out.println(pattern_2);
        System.out.println(pattern_3);
        System.out.println(pattern_4);
        System.out.println(pattern_5);

    }
}
