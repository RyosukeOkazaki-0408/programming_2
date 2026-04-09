public class Account {
    private String name;
    private String no;
    private long balance; 
    private Day openDay;

    public Account(String n, String num, long z, Day openDay) {
        name = n;
        no = num;
        balance = z;
        this.openDay = new Day(openDay);
    }

    public String getName() {
        return name;
    }

    public String getNo() {
        return no;
    }

    public long getBalance() {
        return balance;
    }

    public Day getOpenDay() {
        return new Day(openDay);
    }

    public void deposit(long k) {
        balance += k;
    }

    public void withdraw(long k) {
        balance -= k;
    }

    @Override
    public String toString() {
        return "口座名義：" + name + "\n口座番号：" + no + "\n預金残高：" + balance + "\n口座開設日：" + openDay;
    }

}
