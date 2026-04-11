// mainメソッドを含むAccountTesterクラスを書く
public class AccountTester{
    public static void main(String [] args){

    //アカウントインスタンスの作成
    Day day = new Day(2026, 4, 8);
    Account pattern_1 = new Account("A", "00000001", 0, day);

    //変更前アカウントの表示
    System.out.println(pattern_1);

    //残高を増やして口座開設日を取得
    pattern_1.deposit(500);
    Day openDay = pattern_1.getOpenDay();

    //口座開設日と変更後アカウントの表示
    System.out.println();
    System.out.println(openDay);
    System.out.println();

    System.out.println(pattern_1);
}
}
