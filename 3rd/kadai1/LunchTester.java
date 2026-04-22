public class LunchTester {

    public static void main(String[] args) {
        LunchA a = new LunchA("チキンカレー",450);
        LunchA bAsA = new LunchB("お子様カレー",300,"エビフライ",200);
        LunchA cAsA = new LunchC("激辛カレー",500,"はちみつ", 100, "野菜サラダ", 180);

        a.print();
        bAsA.print();
        cAsA.print();
    }
}