import java.util.*;

public class introString {
    public static void main(String[] args) {
        String str = "abc";
        String str2 = new String("hello");

        System.out.println(str);
        System.out.println(str2);

        // Strings in java Immutable
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); // nextLine - for full statement input

        System.out.println(name);

        // string length
        System.out.println(name.length());

        sc.close();
    }
}
