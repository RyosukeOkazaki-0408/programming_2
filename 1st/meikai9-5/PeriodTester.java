// mainメソッドを含むPeriodTesterクラスを書く

public class PeriodTester{
    public static void main(String [] args){
        Day start = new Day();
        Day end = new Day(2026, 4, 8);

        Period period = new Period(start, end);
        
        System.out.println(period);
    }
}
