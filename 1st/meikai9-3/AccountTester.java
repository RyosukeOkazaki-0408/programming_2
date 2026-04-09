// mainメソッドを含むAccountTesterクラスを書く
public class AccountTester{
    public static void main(String [] args){
        Day day = new Day(2026, 4, 8);
        Account pattern_1 = new Account("A", "00000001", 0, day);

        System.out.println(pattern_1);

        pattern_1.deposit(500);
        Day openDay = pattern_1.getOpenDay();

        System.out.println();
        System.out.println(openDay);
        System.out.println();

        System.out.println(pattern_1);
    }
}
