public class StrCompare {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");

        // if (s1 == s2) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal"); // gives not equal
        // }

        if (s1.equals(s2)) {
            System.out.println("Strings are equal"); // gives equal
        } else {
            System.out.println("Strings are not equal");
        }

    }
}
