import java.util.Arrays;
import java.util.TreeSet;

public class StoresAndHouses{

        public static int[] nearestStores(int[] houses, int[] stores){
            TreeSet<Integer> ts = new TreeSet<Integer>();
            if (stores.length == 0) return new int[0];
            int[] res = new int[houses.length];
            for (int store :  stores)
                ts.add(store);

            for (int i = 0;i<houses.length;i++)
            {
                Integer left = ts.floor(houses[i]);
                Integer right = ts.ceiling(houses[i]);
                if ( left == null || right == null)
                    res[i] = (left == null)? right : left;
                else
                    res[i] = ((houses[i] - left) <= right - houses[i])? left: right;
            }
            return res;
        }
        public static void main(String[] args) {
            int[] h = new int[]{4, 8, 1, 1};
            int[] s = new int[]{5, 3, 1, 2, 6};
            int[] r = nearestStores(h,s);
            System.out.println(Arrays.toString(r));
        }
}

