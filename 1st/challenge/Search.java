public class Search {
    private static int cnt;
    
    public static void dfs(int size) {
        cnt = 0;
        Room room = new Room(size);

        dfs(room, 1);
    }

    private static void dfs(Room room, int id) {
        int[][] vis = room.getVis();
        int size = room.getSize();
        int x = -1, y = -1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (vis[i][j] == 0) {
                    x = i;
                    y = j;
                    break;
                }
            }
            if (x != -1) { break; }
        }

        if (x == -1) {
            System.out.println("---------------\n" + ++cnt + "個目（" + room.getSunpo() + "畳半）\n\n" + room);
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
    }
}
