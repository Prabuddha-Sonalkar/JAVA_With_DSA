public class ShortestPath {
    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            } else if (dir == 'N') {
                y++;
            } else {
                y--;
            }
        }

        int X2 = x * x; // X square =
        int Y2 = y * y;
        return ((float) Math.sqrt(X2 + Y2));

    }

    public static void main(String[] args) {
        String path = "NSE";
        System.out.println(getShortestPath(path));

    }
}
