import java.util.*;

public class Array {

    public static void main(String[] args) {
        int marks[] = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks");
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        sc.close();

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage = " + percentage + "%");

    }
}
