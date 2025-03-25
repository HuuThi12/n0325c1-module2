package ss5_polymorphirsm;


class calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CompileTime {
    public static void main(String[] args) {
        calculator calculator = new calculator();

        int sum1 = calculator.add(2,3); // compiler chọn phương thức add(int, int)
        double sum2 = calculator.add(2.2,2.4); // compiler chọn phương thức add(double, double)
        int sum3 = calculator.add(2,3,6);



    }
}
