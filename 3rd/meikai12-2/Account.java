// 銀行口座クラス【第１版】
public class Account {
	private String name;		// 口座名義
	private String no;			// 口座番号
	private long balance;		// 預金残高

    public Account(String name, String no, long balance) {
        this.name = name;
        this.no = no;
        this.balance = balance;
    }

    public long getBalance() {
		return balance;
	}
}