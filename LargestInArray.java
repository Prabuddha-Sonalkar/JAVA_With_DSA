
public class LargestInArray {

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest =Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if(smallest> numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("smallest is :"+ smallest);
        return largest;

    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 4, 6, 3, 0 };
        System.out.println("largest is " + getLargest(numbers));
    }
}
