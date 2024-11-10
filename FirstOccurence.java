public class FirstOccurence {
    public static int First_Occurence(int arr[],int key, int i) {

        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }

        return First_Occurence(arr, key, i+1);
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        
        System.out.println(First_Occurence(arr, 6, 0));
    }
}
