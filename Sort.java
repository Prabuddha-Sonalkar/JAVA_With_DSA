// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> List=new ArrayList<>();

        List.add(4);
        List.add(2);
        List.add(5);
        List.add(1);
        List.add(3);

        System.out.println(List);
        Collections.sort(List);//ascending
        System.out.println(List);

        //desending
        Collections.sort(List,Collections.reverseOrder());
        System.out.println(List);
}
}

