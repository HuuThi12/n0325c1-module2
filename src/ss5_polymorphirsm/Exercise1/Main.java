package ss5_polymorphirsm.Exercise1;

public class Main {
    public static void main(String[] args) {

        /** upcasting
         * Dog dog = new Dog();
         * Animal animal = dog;
         * System.out.println(animal);
         */

        Animal animal = new Dog();
        Dog dog = (Dog) animal; // dowcasting
        System.out.println(dog);

        if (animal instanceof Dog){
            dog = (Dog) animal;
        }

    }
}
