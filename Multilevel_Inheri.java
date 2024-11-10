public class Multilevel_Inheri {
    public static void main(String[] args) {
        Dog leo = new Dog();
        leo.eat();
        leo.legs = 4;
        System.out.println(leo.legs);
    }
}

class Animal {

    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breath() {
        System.out.println("Breaths");
    }
}

class Mammals extends Animal {

    int legs;
}

class Dog extends Mammals {

    void bark() {
        System.out.println("Barks");
    }
}