public class ObjClass {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // object creation
        p1.setColor("blue");
        System.out.println(p1.color);
        // p1.setTip(5);
        p1.tip = 10;
        System.out.println(p1.tip);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}