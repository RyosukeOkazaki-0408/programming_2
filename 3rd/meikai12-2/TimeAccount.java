class TimeAccount extends Account {
	private long timeBalance;

	TimeAccount(String name, String no, long balance, long timeBalance) {
		super(name, no, balance);
		this.timeBalance = timeBalance;
	}

	// ゲッタ
	public long getTimeBalance() { return timeBalance; }

	static int compBalance(Account a, Account b) {
		long aBalance = a.getBalance();
		long bBalance = b.getBalance();

		// 定期預金を持っていれば、その残高を加える
		if(a instanceof TimeAccount) {
			TimeAccount aTime = (TimeAccount)a;
			aBalance += aTime.getTimeBalance();
		}
		if(b instanceof TimeAccount) {
			TimeAccount bTime = (TimeAccount)b;
			bBalance += bTime.getTimeBalance();
		}

		//値の比較
		if(aBalance > bBalance) return 1;
		if(aBalance < bBalance) return -1;
		return 0;
	}
}
