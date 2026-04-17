
public class MyTimeTester {
    public static void main(String[] args) {
        MyTime.setHourDif(9);
        MyTime JP = new MyTime(13, 45); //Japan
        System.out.println("標準時との時差は" + MyTime.getHourDif() + "時間");

        //時刻の表示
        System.out.print("日本(東京)の時刻は");
        JP.printTime();
        System.out.print("標準時は");
        JP.printUTC();

        System.out.println();

        MyTime.setHourDif(8);
        MyTime KL = new MyTime(); //Kuala Lumpur
        KL.setTime(12, 45);
        System.out.println("標準時との時差は" + MyTime.getHourDif() + "時間");

        //時刻の表示
        System.out.print("マレーシア(クアラルンプール)の時刻は");
        KL.printTime();
        System.out.print("標準時は");
        KL.printUTC();
    }
}