public class Print_Decending {
    public static void PrintDecending(int n) {
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        PrintDecending(n-1);
    }
    public static void main(String[] args) {
        int n= 10;
        PrintDecending(n);
    }
}

