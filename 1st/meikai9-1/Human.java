// Humanクラスを書く

public class Human{
    private String name = "", grade = "";
    private double height = 0.0, weight = 0.0;

    public Human() {}
    public Human(String name, double height, double weight, String grade) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.grade = grade;
    }

    public String getName() { return name; }
    public double getHeight() { return height; }
    public double getWeight() { return weight; }
    public String getGrade() { return grade; }
    public Human copy() {
        return new Human(name, height, weight, grade);
    }

    public void setName(String name) { this.name = name; }
    public void setHeight(double height) { this.height = height; }
    public void setWeight(double weight) { this.weight = weight; }
    public void setGrade(String grade) { this.grade = grade; }
    public void set(String name, double height, double weight, String grade) {
        setName(name);
        setHeight(height); 
        setWeight(weight);
        setGrade(grade);
    }

    @Override
    public String toString() {
        return "name: " + name + "\nheight: " + height + "\nweight: " + weight + "\ngrade: " + grade;
    }
}