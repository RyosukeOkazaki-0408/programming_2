// Humanクラスを書く

public class Human{
    private String name, grade;
    private double height, weight;
    private Day birthday;

    public Human() {
        this.name = "";
        this.height = 0.0;
        this.weight = 0.0;
        this.grade = "";
        this.birthday = new Day();
    }

    public Human(String name, double height, double weight, String grade, Day birthday) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.grade = grade;
        this.birthday = new Day(birthday);
    }

    public String getName() { return name; }
    public double getHeight() { return height; }
    public double getWeight() { return weight; }
    public String getGrade() { return grade; }
    public Day getBirthday() { return new Day(birthday); }
    public Human copy() {
        return new Human(name, height, weight, grade, new Day(birthday));
    }

    public void setName(String name) { this.name = name; }
    public void setHeight(double height) { this.height = height; }
    public void setWeight(double weight) { this.weight = weight; }
    public void setGrade(String grade) { this.grade = grade; }
    public void setBirthday(Day birthday) { this.birthday = new Day(birthday); }
    public void set(String name, double height, double weight, String grade, Day birthday) {
        setName(name);
        setHeight(height); 
        setWeight(weight);
        setGrade(grade);
        setBirthday(birthday);
    }

    @Override
    public String toString() {
        return "name: " + name + "\nheight: " + height + "\nweight: " + weight + "\ngrade: " + grade + "\nbirthday: " + birthday;
    }
}