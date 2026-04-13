// mainメソッドを含むHuman2ArrayInitクラスを書く

public class HumanArrayInit{

    public static void main(String [] args){
        Human2[] array = new Human2[3];

        Day day_1 = new Day(1000, 5, 1);
        Day day_2 = new Day(2000, 12, 2);
        Day day_3 = new Day();
        
        Human2 pattern_1 = new Human2();
        Human2 pattern_2 = new Human2();
        Human2 pattern_3 = new Human2("C", 160.0, 60.0, "M2", day_3);

        pattern_1.setName("A");
        pattern_1.setHeight(140.0);
        pattern_1.setWeight(45.5);
        pattern_1.setGrade("B1");
        pattern_1.setBirthday(day_1);

        pattern_2.set("B", 200.0, 100.0, "D1", day_2);

        array[0] = pattern_1;
        array[1] = pattern_2;
        array[2] = pattern_3;
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            System.out.println();
        }
        
        pattern_3.setName("C_changed");
        pattern_3.setHeight(160.5);
        pattern_3.setWeight(65.0);
        pattern_3.setGrade("D1");
        pattern_3.setBirthday(new Day(1990, 8));
                
        Human2 Human2 = pattern_3.copy();
        String name = pattern_1.getName();

        System.out.println(Human2);
        System.out.println();
        System.out.println("Aの名前：" + name);
    }
}
