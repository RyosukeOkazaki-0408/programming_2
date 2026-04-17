//===== ＤＶＤプレーヤ =====//
public class DVDPlayer implements ExPlayer {

	@Override public void play() {											// ○再生 
		System.out.println("--ＤＶＤ再生開始！");
	}

	@Override public void stop() {											// ○停止
		System.out.println("--ＤＶＤ再生終了！"); 
	}

	@Override public void slow() {											// ●スロー再生
		System.out.println("--ＤＶＤスロー再生開始！"); 
	}
}
