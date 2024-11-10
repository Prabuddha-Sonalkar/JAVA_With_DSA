import java.util.*;

public class LineraSearch {

    public static int Linear_Search(int numbers[], int key) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        System.out.println("enter the elements of array");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("enter the key element");
        int key = sc.nextInt();
        sc.close();

        int index = Linear_Search(numbers, key);
        if (index == -1) {
            System.out.println("element not found");
        } else {
            System.out.println("element found at index " + index);
        }
    }
}
