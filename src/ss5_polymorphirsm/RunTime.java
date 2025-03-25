package ss5_polymorphirsm;


class Animal {
    void Sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Bird extends Animal {
    @Override
    void Sound() {
        System.out.println("Birdsong");
    }
}

class Cat extends Animal {
//    @Override
//    void Sound() {
//        System.out.println("Cat mews");
//    }
}

public class RunTime {
    public static void main(String[] args) {
        Animal animal1 = new Bird(); // Đa hình. nhờ có đa hình mà cha có thể tham chiếu được tới con
        Animal animal2 = new Cat();

        animal1.Sound(); // output: Birdsong. // Đối tượng được xác định trong lúc runtime
        animal2.Sound();
    }
}
