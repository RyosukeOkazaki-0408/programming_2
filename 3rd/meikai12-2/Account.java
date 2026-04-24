class Account {
	private String name;
	private String no;
	private long balance;

    // コンストラクタ
    public Account(String name, String no, long balance) {
        this.name = name;
        this.no = no;
        this.balance = balance;
    }

    // ゲッタと預金引き出し
	public long getBalance() { return balance; }
    public void withdraw(long k) { balance -= k; }
}