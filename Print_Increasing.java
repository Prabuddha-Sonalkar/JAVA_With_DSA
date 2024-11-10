public class Print_Increasing {
    public static void PrintIncreasing(int n) {
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        PrintIncreasing(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=5;
        PrintIncreasing(n);
    }
}
