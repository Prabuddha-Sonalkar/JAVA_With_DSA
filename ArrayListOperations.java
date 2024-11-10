import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        // Create an ArrayList of Integer
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);

        // Get element at index 1
        Integer number = list.get(1);
        System.out.println("Element at index 1: " + number);

        // Set element at index 1
        list.set(1, 25);
        System.out.println("Updated element at index 1: " + list.get(1));

        // Remove element at index 2
        list.remove(2);
        System.out.println("List after removal: " + list);

        // Check if the list contains 10
        boolean containsTen = list.contains(10);
        System.out.println("Contains 10: " + containsTen);

        // Display the final list
        System.out.println("Final List: " + list);
    }
}
