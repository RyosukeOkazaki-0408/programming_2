
public class MyTime {
    private int hour = 0, minute = 0;
    private static int hourDifference = 0;

    public MyTime(int hour, int minute) {
        this.hour = hour - hourDifference;
        while(this.hour < 0) { this.hour += 24; }
        this.hour %= 24;
        this.minute = minute;
    }
    public MyTime() {}

    public static int getHourDif() { return hourDifference; }
    public static void setHourDif(int n) { hourDifference = n; }

    public void setTime(int hour, int minute) {
        this.hour = hour - hourDifference;
        while(this.hour < 0) { this.hour += 24; }
        this.hour %= 24;
        this.minute = minute;
    }
    public void setUTC(int hour, int minute) {
        this.hour = hour;
        while(this.hour < 0) { this.hour += 24; }
        this.hour %= 24;
        this.minute = minute;
    }

    public void printTime() {
        int tmp = hour + hourDifference;
        while(tmp < 0) { tmp += 24; }
        tmp %= 24;
        System.out.println(tmp + "時" + minute + "分");
    }
    public void printUTC() { System.out.println(this); }

    @Override
    public String toString() { return hour + "時" + minute + "分"; }
}