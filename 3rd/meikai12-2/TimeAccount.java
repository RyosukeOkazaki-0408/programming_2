// 定期預金付き銀行口座クラス【試作版】

public class TimeAccount extends Account {
	private long timeBalance;		// 預金残高（定期預金）

	//--- コンストラクタ ---//
	public TimeAccount(String name, String no, long balance, long timeBalance) {
        super(name, no, balance);
		this.timeBalance = timeBalance;		// 預金残高（定期預金）
	}

	//--- 口座名義を調べる ---//
	String getName() {
		return name;
	}

	//--- 口座番号を調べる ---//
	String getNo() {
		return no;
	}

	//--- 預金残高を調べる ---//
	long getBalance() {
		return balance;
	}

	//--- 定期預金残高を調べる ---//
	long getTimeBalance() {
		return timeBalance;
	}

	//--- k円預ける ---//
	void deposit(long k) {
		balance += k;
	}

	//--- k円おろす ---//
	void withdraw(long k) {
		balance -= k;
	}

	//--- 定期預金を解約して全額を普通預金に移す ---//
	void cancel() {	
		balance += timeBalance;
		timeBalance = 0;
	}

    static int compBalance(Account a, Account b) {
        int aBalance = ((a instanceof TimeAccount)?(TimeAccount)a.getTimeBalance():a.getBalance());
        int bBalance = ((b instanceof TimeAccount)?(TimeAccount)b.getTimeBalance():b.getBalance());

        if(aBalance > bBalance) return 1;
        if(aBalance < bBalance) return -1;
        else return 0;
    }
}
