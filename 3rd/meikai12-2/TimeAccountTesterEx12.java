public class TimeAccountTesterEx12 {
    public static void main(String[] args) {
        Account a = new Account("a", "1", 500);
        Account b = new TimeAccount("b", "2", 400, 100);

        // 初期値の表示(等しいことを確認)
        System.out.println("a: 500, b: 500");
        print(a, b);

        // bから100引き出し
        b.withdraw(100);

        // aの方が大きくなっていることを確認
        System.out.println("a: 500, b: 400");
        print(a, b);

        // aから500引き出し
        a.withdraw(500);

        // bの方が大きくなっていることを確認
        System.out.println("a: 0, b: 400");
        print(a, b);
    }

    // 大小関係を視覚的にわかりやすくしたmethod
    private static void print(Account a, Account b) {
        switch (TimeAccount.compBalance(a, b)) {
            case 0: System.out.println("a = b"); break;
            case 1: System.out.println("a > b"); break;
            case -1: System.out.println("a < b"); break;
        }
        System.out.println();
    }
}