// 日付クラスDay【第１版】の配列（その３：初期化）

class DayArrayInit {

	public static void main(String[] args) {
		String[] wd = {"日", "月", "火", "水", "木", "金", "土"};

		// 明治・大正・昭和・平成・令和の初日
		Day[] x = { new Day(1868,  9,  8),		// 明治
								new Day(1912,  7, 30),		// 大正
								new Day(1926, 12, 25),		// 昭和
								new Day(1989,  1,  8),		// 平成
								new Day(2019,  5,  1),		// 令和
							};

		for (int i = 0; i < x.length; i++)
			System.out.printf("x[%d] = %04d年%02d月%02d日(%s)\n",
													i, x[i].getYear(), x[i].getMonth(), x[i].getDate(),
													wd[x[i].dayOfWeek()]);
	}
}
