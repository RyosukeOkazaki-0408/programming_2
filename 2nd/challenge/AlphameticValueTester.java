// mainメソッドを含むAlphameticValueTesterクラスを書く

public class AlphameticValueTester {
   public static void main(String[] args) {
      AlphameticValue a = new AlphameticValue("ABCDEFG");
      AlphameticValue b = new AlphameticValue("JJAIBIC");
      AlphameticValue c = new AlphameticValue("BIHJABD");

      //時間計測と処理の実行
      long start = System.nanoTime();
      AlphameticValue.dfs(a, b, c);
      long end = System.nanoTime();

      //値の取得と解の表示
      int cnt = AlphameticValue.getCnt();
      StringBuilder sb = AlphameticValue.getSb();

      sb.append("処理時間: ").append(String.format("%.3f", (double)(end - start) / 1E9)).append("秒").append("\n解の個数: ").append(cnt).append("個\n");
      System.out.println(sb);
   }
}
