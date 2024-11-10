
public class Temp {

    public static int maxWeightCell(int N, int Edge[]) {
        // Step 1: Calculate weights
        int wt[] = new int[N];
        for (int i = 0; i < N; i++) {
            if (Edge[i] != -1)
                wt[Edge[i]] += i;
        }

        // Step 2: Find the cell with the maximum weight
        int max_wt = -1;
        int max_wt_idx = -1;
        for (int i = 0; i < N; i++) {
            if (wt[i] >= max_wt) { // If there are multiple cells with the maximum weight, return the cell with the highest index.
                max_wt = wt[i];
                max_wt_idx = i;
            }
        }
        return max_wt_idx;
    }

    public static void main(String[] args) {
        // Example manual input
        int N = 5; // Number of nodes
        int Edge[] = {2, 2, -1, 2, 3}; // Edge array
        
        // Temp T = new Temp();
        // int result = T.maxWeightCell(N, Edge);
        
        System.out.println("The cell with the maximum weight is: " + maxWeightCell(N,Edge));
    }

}

