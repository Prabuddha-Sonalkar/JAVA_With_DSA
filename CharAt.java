public class CharAt {

    public static void PrintLetters(String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String firstname = "Prabuddha";
        String lastname = "Sonalkar";
        String fullname = firstname + " " + lastname;

        PrintLetters(fullname);
    }
}
