public class Hirarchial_Inheri {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
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

// class Mammals extends Animal {

//     int legs;
// }

class Dog extends Animal {

    void bark() {
        System.out.println("Barks");
    }
}