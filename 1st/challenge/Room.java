// Roomクラスを書く

public class Room {
    private int size;
    private int sunpo;
    private int[][] vis;
    private int[][] tateSukima, yokoSukima;

    public Room(int size) {
        if(size < 3) { throw new IllegalArgumentException("その寸法では畳を敷き詰められません。"); }
        if(size%2 == 0) { throw new IllegalArgumentException("その部屋のサイズでは炉を設置できません。"); }
        this.size = size;
        this.sunpo = (size-2) * 4;
        this.vis = new int[size][size];
        this.tateSukima = new int[size][size-1];
        this.yokoSukima = new int[size-1][size];

        int mn = Integer.MIN_VALUE;
        vis[size/2][size/2] = -1;
        tateSukima[size/2][size/2] = mn;
        tateSukima[size/2][size/2-1] = mn;
        yokoSukima[size/2][size/2] = mn;
        yokoSukima[size/2-1][size/2] = mn;
    }

    public int getSunpo() { return sunpo; }
    public int getSize() { return size; }
    public int[][] getVis() { return vis; }

    public boolean setTatami(Tatami tatami) {
        int id = tatami.getId();
        int x = tatami.getX();
        int y = tatami.getY();
        boolean direction = tatami.getDirection();
        
        if(vis[x][y] != 0) { return false; }
        if(direction) { 
            if(y >= size-1) { return false; }
            if(vis[x][y+1] != 0) { return false; }
            vis[x][y] = id;
            vis[x][y+1] = id;
        }
        else {
            if(x >= size-1) { return false; }
            if(vis[x+1][y] != 0) { return false; }
            vis[x][y] = id;
            vis[x+1][y] = id;
        }
        checkTatami(tatami, true);
        if(crossedTatami(tatami)) {
            removeTatami(tatami);
            return false;
        }
        return true;
    }

    public void removeTatami(Tatami tatami) {
        int x = tatami.getX();
        int y = tatami.getY();
        boolean direction = tatami.getDirection();

        vis[x][y] = 0; 
        if(direction) { vis[x][y+1] = 0; }
        else { vis[x+1][y] = 0; }

        checkTatami(tatami, false);
    }

    private void checkTatami(Tatami tatami, boolean bool) {
        int x = tatami.getX();
        int y = tatami.getY();
        boolean direction = tatami.getDirection();
        int n;
        if(bool) { n = 1; }
        else n = -1;

        if(direction) {
            if(x < size-1 && y < size) { yokoSukima[x][y] += n; }
            if(y < size && x-1 >= 0) { yokoSukima[x-1][y] += n; }
            if(x-1 >= 0 && y+1 < size) { yokoSukima[x-1][y+1] += n; }
            if(x < size-1 && y+1 < size) { yokoSukima[x][y+1] += n; }
            if(x < size && y-1 >= 0) { tateSukima[x][y-1] += n; }
            if(x < size && y+1 < size-1) { tateSukima[x][y+1] += n; }
        } else {
            if(x < size && y < size-1) { tateSukima[x][y] += n; }
            if(x < size && y-1 >= 0) { tateSukima[x][y-1] += n; }
            if(y-1 >= 0 && x+1 < size) { tateSukima[x+1][y-1] += n; }
            if(y < size-1 && x+1 < size) { tateSukima[x+1][y] += n; }
            if(y < size && x-1 >= 0) { yokoSukima[x-1][y] += n; }
            if(y < size && x+1 < size-1) { yokoSukima[x+1][y] += n; }
        }
    }

    private boolean crossedTatami(Tatami tatami) {
        int x = tatami.getX();
        int y = tatami.getY();
        boolean direction = tatami.getDirection();

        if(direction) { //yoko
            if (y < size && y-1 >= 0 && x+1 < size 
                && yokoSukima[x][y] > 0 && yokoSukima[x][y-1] > 0  
                && tateSukima[x][y-1] > 0 && tateSukima[x+1][y-1] > 0) {
                    return true;
                }
            if(x < size && y < size && x-1 >= 0 && y-1 >= 0
                && yokoSukima[x-1][y] > 0 && yokoSukima[x-1][y-1] > 0 
                && tateSukima[x-1][y-1] > 0 && tateSukima[x][y-1] > 0) {
                    return true;
                }
            if(x+1 < size && y+2 < size 
                && yokoSukima[x][y+2] > 0 && yokoSukima[x][y+1] > 0 
                && tateSukima[x][y+1] > 0 && tateSukima[x+1][y+1] > 0) {
                    return true;
                }
            if(x < size && x-1 >= 0 && y+2 < size
                && yokoSukima[x-1][y+2] > 0 && yokoSukima[x-1][y+1] > 0 
                && tateSukima[x-1][y+1] > 0 && tateSukima[x][y+1] > 0) {
                return true;
            }
        } else { //tate
            if(x < size && y < size && x-1 >= 0 && y-1 >= 0
                && yokoSukima[x-1][y] > 0 && yokoSukima[x-1][y-1] > 0 
                && tateSukima[x][y-1] > 0 && tateSukima[x-1][y-1] > 0) {
                return true;
            }
            if(x < size && x-1 >= 0 && y+1 < size
                && yokoSukima[x-1][y+1] > 0 && yokoSukima[x-1][y] > 0 
                && tateSukima[x][y] > 0 && tateSukima[x-1][y] > 0) {
                return true;
            }
            if(y < size && y-1 >= 0 && x+2 < size
                && yokoSukima[x+1][y] > 0 && yokoSukima[x+1][y-1] > 0 
                && tateSukima[x+2][y-1] > 0 && tateSukima[x+1][y-1] > 0) {
                return true;
            }
            if(y+1 < size && x+2 < size
                && yokoSukima[x+1][y+1] > 0 && yokoSukima[x+1][y] > 0 
                && tateSukima[x+2][y] > 0 && tateSukima[x+1][y] > 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(vis[i][j] == -1) { sb.append(" #"); }
                else sb.append(' ').append((char)('A' + vis[i][j] - 1));
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}