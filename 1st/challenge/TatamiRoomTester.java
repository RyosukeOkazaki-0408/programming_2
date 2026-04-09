// mainメソッドを含むTatamiRoomTesterクラスを書く

public class TatamiRoomTester{
    private static int sunpo, cnt = 0;

    public static void main(String [] args){
        Room room_1 = new Room(3);
        Room room_2 = new Room(5);
        Room room_3 = new Room(7);
        sunpo = room_1.getSunpo();
        dfs(room_1, 1);
        cnt = 0;
        sunpo = room_2.getSunpo();
        dfs(room_2, 1);
        cnt = 0;
        sunpo = room_3.getSunpo();
        dfs(room_3, 1);
    }

    public static void dfs(Room room, int id) {
        int[][] vis = room.getVis();
        int size = room.getSize();
        int x = 0, y = 0;

        boolean flg = true;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (vis[i][j] == 0) {
                    x = i;
                    y = j;
                    flg = false;
                    break;
                }
            }
            if (!flg) { break; }
        }

        if (flg) {
            System.out.println("----------\n" + ++cnt + "個目（" + sunpo + "畳半）\n\n" + room);
            return;
        }

        Tatami yokoTatami = new Tatami(id, x, y, true);
        Tatami tateTatami = new Tatami(id, x, y, false);
        if(room.setTatami(tateTatami)) {
            dfs(room, id+1);
            room.removeTatami(tateTatami);
        }
        if(room.setTatami(yokoTatami)) {
            dfs(room, id+1);
            room.removeTatami(yokoTatami);
        }
        return;
    }
}
