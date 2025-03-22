package ss4_extend;


import java.util.Scanner;

public class Student extends Person {
    public double score;

    public Student() {
    }

    public Student(int id, String name) {
        super(id, name);
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.print("Nhập vào điểm: ");
        this.score = Double.parseDouble(scanner.nextLine());
    }

    public void output() {
        super.output();
        System.out.println("Điểm: " + this.score);
    }

}
