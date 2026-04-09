// Tatamiクラスを書く

public class Tatami {
    private int id, x, y;
    private boolean direction;

    public Tatami(int id, int x, int y, boolean direction) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getId() { return id; }
    public int getX() { return x; }
    public int getY() {return y; }
    public boolean getDirection() { return direction; }
}