
public class ComplexNumberTester {
    public static void main(String[] args) {

        //引数が空のインスタンス
        ComplexNumber a = new ComplexNumber();

        ComplexNumber b = new ComplexNumber(3, -5);
        ComplexNumber c = new ComplexNumber(0, 4);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println();

        System.out.println("b.add(c) = " + b.add(c));
        System.out.println("add(b,c) = " + ComplexNumber.add(b,c));
        System.out.println();

        System.out.println("b.sub(c) = " + b.sub(c));
        System.out.println("sub(b,c) = " + ComplexNumber.sub(b,c));
        System.out.println();

        System.out.println("b.mul(c) = " + b.mul(c));
        System.out.println("mul(b,c) = " + ComplexNumber.mul(b,c));
        System.out.println();

        System.out.println("b.div(c) = " + b.div(c));
        System.out.println("div(b,c) = " + ComplexNumber.div(b,c));
        System.out.println();

        System.out.println("b.abs() = " + b.abs());
        System.out.println("abs(b) = " + ComplexNumber.abs(b));
        System.out.println();

        System.out.println("b.conjugate() = " + b.conjugate());
        System.out.println("conjugate(b) = " + ComplexNumber.conjugate(b));
    }
}