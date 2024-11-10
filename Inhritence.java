public class Inhritence {
    public static void main(String[] args) {
        Dog leo = new Dog();
        leo.eat();
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breaths");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("barks");
    }
}
