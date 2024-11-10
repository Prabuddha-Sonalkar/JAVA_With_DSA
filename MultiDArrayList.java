import java.util.ArrayList;

public class MultiDArrayList {
    public static void main(String[] args) {
        // Create a multidimensional ArrayList
        ArrayList<ArrayList<Integer>> multiList = new ArrayList<>();

        // Add first sublist [1, 2]
        ArrayList<Integer> firstSubList = new ArrayList<>();
        firstSubList.add(1);
        firstSubList.add(2);
        multiList.add(firstSubList);

        // Add second sublist [3, 4]
        ArrayList<Integer> secondSubList = new ArrayList<>();
        secondSubList.add(3);
        secondSubList.add(4);
        multiList.add(secondSubList);

        System.out.println(multiList);

        // Print the firstSubList and secondSubList
        System.out.println("First Sublist: " + firstSubList);
        System.out.println("Second Sublist: " + secondSubList);

       
    }
    
}
