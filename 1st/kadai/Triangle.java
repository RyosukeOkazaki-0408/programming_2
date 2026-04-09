// Triangleクラスを書く

public class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;     this.b = b;     this.c = c;
    }

    public Triangle(double l, double m) {
        this(l, l, m);
    }

    public Triangle(double n) {
        this(n, n);
    }

    public Triangle() {
        this(0);
    }

    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }
    
    public void setA(double a) { this.a = a; }
    public void setB(double b) { this.b = b; }
    public void setC(double c) { this.c = c; }

    public boolean existing() {
        return a + b > c && b + c > a && c + a > b;
    }

    public boolean isosceles() {
        if(!this.existing()) { return false; }
        if(a == b || b == c || c == a) { return true; }
        return false;
    }

    public boolean equilateral() {
        if(!this.existing()) { return false; }
        if(a == b && b == c) { return true; }
        return false;
    }

    public boolean compareTriangle(Triangle tri) {
        if(this.a == tri.a && this.b == tri.b && this.c == tri.c) {return true; }
        if(this.a == tri.a && this.b == tri.c && this.c == tri.b) {return true; }
        if(this.a == tri.b && this.b == tri.c && this.c == tri.a) {return true; }
        if(this.a == tri.b && this.b == tri.a && this.c == tri.c) {return true; }
        if(this.a == tri.c && this.b == tri.a && this.c == tri.b) {return true; }
        if(this.a == tri.c && this.b == tri.b && this.c == tri.a) {return true; }
        return false;
    }

    @Override
    public String toString() {
        String str;
        if(this.equilateral()) { str = "この図形は正三角形です。"; }
        else if(this.isosceles()) { str = "この図形は二等辺三角形です。"; }
        else if(this.existing()) { str = "この図形は三角形です。"; }
        else str = "この図形は三角形ではありません。";
        return "各辺の長さは、" + a + ", " + b + ", " + c + "です。\n" + str;
    }
}