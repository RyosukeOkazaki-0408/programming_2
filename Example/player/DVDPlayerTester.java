// ＤＶＤプレーヤクラスDVDPlayerの利用例

class DVDPlayerTester {

	public static void main(String[] args) {
		DVDPlayer a = new DVDPlayer();
		Player    b = new DVDPlayer();
		ExPlayer  c = new DVDPlayer();

		System.out.println("DVDPlayer型変数a");
		a.play();					// 再生
		a.stop();					// 停止
		a.slow();					// スロー再生

		System.out.println("Player型変数b");
		b.play();					// 再生
		b.stop();					// 停止

		System.out.println("ExPlayer型変数c");
		c.play();					// 再生
		c.stop();					// 停止
		c.slow();					// スロー再生
	}
}
