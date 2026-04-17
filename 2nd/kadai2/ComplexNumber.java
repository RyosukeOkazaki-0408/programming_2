
public class ComplexNumber {
    private double real = 0, imaginal = 0;

    public ComplexNumber() {}
    public ComplexNumber(double real, double imaginal) {
        this.real = real;
        this.imaginal = imaginal;
    }
    public ComplexNumber(ComplexNumber a) {
        this(a.real, a.imaginal);
    }

    @Override
    public String toString() {
        if(imaginal == 0) { return real + ""; }
        if(imaginal != 1 && imaginal != -1) {
            if(real == 0) { return imaginal + "i"; }
            if(imaginal > 0) {return real + "+" + imaginal + "i"; }
            else { return real + "" + imaginal + "i"; }
        }
        else {
            if(real == 0) { return ((imaginal == 1) ? "" : "-") + "i"; }
            else { return real + ((imaginal == 1) ? "+" : "-") + "i"; }
        }
    }

    //add
    public static ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        double real = a.real + b.real;
        double imaginal = a.imaginal + b.imaginal;
        return new ComplexNumber(real, imaginal);
    }
    public ComplexNumber add(ComplexNumber a) { return add(this, a); }

    //sub
    public static ComplexNumber sub(ComplexNumber a, ComplexNumber b) {
        double real = a.real - b.real;
        double imaginal = a.imaginal - b.imaginal;
        return new ComplexNumber(real, imaginal);
    }
    public ComplexNumber sub(ComplexNumber a) { return sub(this, a); }
    
    //mul
    public static ComplexNumber mul(ComplexNumber a, ComplexNumber b) {
        double real = a.real * b.real - a.imaginal * b.imaginal;
        double imaginal = a.real * b.imaginal + a.imaginal * b.real;
        return new ComplexNumber(real, imaginal);
    }
    public ComplexNumber mul(ComplexNumber a) { return mul(this, a); }
    
    //div
    public static ComplexNumber div(ComplexNumber a, ComplexNumber b) {
        double denominator = Math.pow(b.real, 2) + Math.pow(b.imaginal, 2);
        if(denominator == 0) { throw new ArithmeticException("0除算はできません。"); }
        double real = (a.real * b.real + a.imaginal * b.imaginal) / denominator;
        double imaginal = (a.imaginal * b.real - a.real * b.imaginal) / denominator;
        return new ComplexNumber(real, imaginal);
    }
    public ComplexNumber div(ComplexNumber a) { return div(this, a); }

    //abs
    public static double abs(ComplexNumber a) { return Math.sqrt(Math.pow(a.real, 2) + Math.pow(a.imaginal, 2)); }
    public double abs() { return abs(this); }

    //conjugate
    public static ComplexNumber conjugate(ComplexNumber a) { return new ComplexNumber(a.real, -a.imaginal); }
    public ComplexNumber conjugate() { return conjugate(this); }
}