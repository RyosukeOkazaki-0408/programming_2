// mainメソッドを含むHumanArrayInitクラスを書く

public class HumanArrayInit{

    public static void main(String [] args){
    Human[] array = new Human[3];
    
    //Humanインスタンスの作成（1と2の引数は空）
    Human pattern_1 = new Human();
    Human pattern_2 = new Human();
    Human pattern_3 = new Human("C", 160.0, 60.0, "M2");

    //set系methodを1に使用
    pattern_1.setName("A");
    pattern_1.setHeight(140.0);
    pattern_1.setWeight(45.5);
    pattern_1.setGrade("B1");

    //まとめてsetできるところも見せている
    pattern_2.set("B", 200.0, 100.0, "D1");

    //配列に代入
    array[0] = pattern_1;
    array[1] = pattern_2;
    array[2] = pattern_3;
    
    //変更前の要素を表示
    for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
        System.out.println();
    }
    
    //3に変更を加えてみる
    pattern_3.setName("C_changed");
    pattern_3.setHeight(160.5);
    pattern_3.setWeight(65.0);
    pattern_3.setGrade("D1");
            
    //get系とコピーを使用
    Human human = pattern_3.copy();
    String name = pattern_1.getName();

    //変更、コピーが成功していることを見せている
    System.out.println(human);
    System.out.println();
    System.out.println("Aの名前：" + name);
}
}
