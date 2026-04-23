public class TimeAccountTesterEx12 {
    public static void main(String[] args) {
        Account a = new Account("a", "1", 500);
        Account b = new TimeAccount("b", "2", 400, 100);

        System.out.println("a: 500, b: 500");
        print(a, b);

        b.withdraw(100);

        System.out.println("a: 500, b: 400");
        print(a, b);

        a.withdraw(500);

        System.out.println("a: 0, b: 400");
        print(a, b);
    }

    private static void print(Account a, Account b) {
        switch (TimeAccount.compBalance(a, b)) {
            case 0: System.out.println("a = b"); break;
            case 1: System.out.println("a > b"); break;
            case -1: System.out.println("a < b"); break;
        }
        System.out.println();
    }
}