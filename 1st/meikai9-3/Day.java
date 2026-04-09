// Dayクラスを書く

public class Day {

    private int year = 1;
    private int month = 1;
    private int date = 1;

    public Day() {}
    public Day(int year) { this.year = year; }
    public Day(int year, int month) { this(year); this.month = month; }
    public Day(int year, int month, int date) { this(year, month); this.date = date; }
    public Day(Day d) { this(d.year, d.month, d.date); }

    @Override
    public String toString() {

        return String.format("%4d年 %2d月 %2d日", year, month, date);
    }
}