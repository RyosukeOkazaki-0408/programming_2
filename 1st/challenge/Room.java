// Roomクラスを書く
import java.util.ArrayList;
import java.util.List;

public class Room {
    private int size;
    private List<Tatami> tatamis;
    private int[][] room;

    Room(int dimention) {
        this.size = dimention/4 + 2;
        this.tatamis = new ArrayList<>();
        this.room = new int[size][size];
    }

    public void addTatami(Tatami tatami) {
        tatamis.add(tatami);
    }

    public boolean setTatami(Tatami tatami) {
        int id = tatami.getId();
        int x = tatami.getX();
        int y = tatami.getY();
        boolean direction = tatami.getDirection();
        
        if(x < 0 || x >= size-1 && direction) return false;
        else if(y < 0 || y >= size-1 && !direction) return false;

        room[x][y] = id;
        if(direction) { room[x][y+1] = id; }
        else room[x+1][y] = id;

        return true;
    }
}