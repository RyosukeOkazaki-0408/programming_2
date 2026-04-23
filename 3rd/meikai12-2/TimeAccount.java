class TimeAccount extends Account {
	private long timeBalance;

	TimeAccount(String name, String no, long balance, long timeBalance) {
		super(name, no, balance);
		this.timeBalance = timeBalance;
	}

	public long getTimeBalance() { return timeBalance; }

	static int compBalance(Account a, Account b) {
		long aBalance = a.getBalance();
		long bBalance = b.getBalance();

		if(a instanceof TimeAccount) {
			TimeAccount aTime = (TimeAccount)a;
			aBalance += aTime.getTimeBalance();
		}
		if(b instanceof TimeAccount) {
			TimeAccount bTime = (TimeAccount)b;
			bBalance += bTime.getTimeBalance();
		}

		if(aBalance > bBalance) return 1;
		if(aBalance < bBalance) return -1;
		return 0;
	}
}
