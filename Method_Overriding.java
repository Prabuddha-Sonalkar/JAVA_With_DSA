public class Method_Overriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
        Animal a = new Animal();
        a.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("eat anything");
    }
}

class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("eat grass");
    }
}