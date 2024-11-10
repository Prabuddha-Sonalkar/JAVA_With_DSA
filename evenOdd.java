public class evenOdd {
    public static void even_Odd(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }

    public static void main(String[] args) {
        even_Odd(5);
        even_Odd(10);
    }
}
