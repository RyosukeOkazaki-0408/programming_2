// Periodクラスを書く

class Period {
    private Day from;
    private Day to;

    public Period(Day from, Day to) {
        this.from = new Day(from);
        this.to = new Day(to);
    }

    public Day getFrom() {
        return new Day(from);
    }

    public Day getTo() {
        return new Day(to);
    }

    public void setFrom(Day day) {
        this.from = new Day(day);
    }

    public void setTo(Day day) {
        this.to = new Day(day);
    }

    @Override
    public String toString() {
        return "開始日：" + this.from + "\n終了日：" + this.to;
    }
}