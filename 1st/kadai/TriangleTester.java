// mainメソッドを含むTriangleTesterクラスを書く

public class TriangleTester{
    public static void main(String [] args){

        //trianglesにTriangleインスタンスを3つ入れる
        Triangle[] triangles = new Triangle[3];

        triangles[0] = new Triangle(3, 4, 5);
        triangles[1] = new Triangle(3, 4);
        triangles[2] = new Triangle(5);

        //テストケース1と2の作成
        Triangle test_1 = new Triangle();
        test_1.setA(triangles[0].getA());
        test_1.setB(triangles[0].getB());
        test_1.setC(triangles[0].getC());

        Triangle test_2 = new Triangle(3,5,10);

        //変更前の配列の要素を表示
        for(int i = 0; i < 3; i++) {
            explain("\ntriangles[" + i + "]", triangles[i]);
            System.out.print("----------------");
        }

        //test1とtest2がどのような形かを表示するmethod
        explain("\ntest_1", test_1);
        System.out.print("----------------");
        explain("\ntest_2", test_2);
        System.out.print("----------------");

        //合同な三角形かどうか判定して、わかりやすく表示
        System.out.println("\n" + explain(triangles[0].compareTriangle(test_1), "triangles[0]", "test_1"));
        System.out.println("\n" + explain(triangles[0].compareTriangle(test_2), "triangles[0]", "test_2"));
    }

    //合同判定を可視化するmethod
    private static String explain(boolean bool, String tri_1, String tri_2) {
        String str;
        if(bool) { str = "等しいです。"; }
        else str = "等しくないです。";
        return tri_1 + "と" + tri_2 + "は、三辺が" + str;
    }

    //三角形の形状（三角形が存在するか）を可視化するmethod
    private static void explain(String str, Triangle tri) {
        System.out.println(str + "の" + tri); 
        System.out.println("\n正三角形か：" + tri.equilateral());
        System.out.println("二等辺三角形か：" + tri.isosceles());
        System.out.println("三角形か：" + tri.existing());
    }
}
