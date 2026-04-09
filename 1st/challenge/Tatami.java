// Tatamiクラスを書く

public class Tatami {
    private int id, x, y;
    private boolean direction;

    Tatami(int id, int x, int y, boolean direction) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    int getId() { return id; }
    int getX() { return x; }
    int getY() {return y; }
    boolean getDirection() { return direction; }
}