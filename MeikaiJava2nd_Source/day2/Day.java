// 日付クラスDay【第２版】

public class Day {
	private int year;			// 年
	private int month;		// 月
	private int date;			// 日

	//--- コンストラクタ ---//
	public Day()                              { set(1, 1, 1); }
	public Day(int year)                      { set(year, 1, 1); }
	public Day(int year, int month)           { set(year, month, 1); }
	public Day(int year, int month, int date) { set(year, month, date); }
	public Day(Day d)                         { set(d.year, d.month, d.date); }

	//--- 年・月・日を取得 ---//
	public int getYear()  { return year; }		// 年
	public int getMonth() { return month; }		// 月
	public int getDate()  { return date; }		// 日

	//--- 年・月・日を設定 ---//
	public void setYear(int year)   { this.year  = year; }		// 年
	public void setMonth(int month) { this.month = month; }		// 月
	public void setDate(int date)   { this.date  = date; }		// 日

	public void set(int year, int month, int date) {	// 年月日
		this.year  = year;			// 年	
		this.month = month;			// 月
		this.date  = date;			// 日
	}

	//--- 曜日を求める（日曜日～土曜日を0～6で返却） --//
	int dayOfWeek() {
		int y = year;
		int m = month;
		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	//--- 日付dと等しいか ---//
	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}

	//--- 文字列表現を返却 ---//
	public String toString() {
		String[] wd = {"日", "月", "火", "水", "木", "金", "土"};
		return String.format("%04d年%02d月%02d日(%s)",
														year, month, date, wd[dayOfWeek()]);
	}
}
