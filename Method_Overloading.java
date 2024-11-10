public class Method_Overloading {
    public static void main(String[] args) {
        Cal c1 = new Cal();
        System.out.println(c1.sum(1, 2));
        System.out.println(c1.sum((float) 1.5, (float) 2.5));
        System.out.println(c1.sum(1, 2, 4));

    }
}

class Cal {

    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

}