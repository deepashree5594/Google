import java.util.Arrays;
public class MinimumNumberofChairs {
    public static int minChairs(int[] s, int[] e) {
        Arrays.sort(s);
        Arrays.sort(e);
        int chairs=0;
        int i = 0;
        int j = 0;
        while(i<s.length)
        {
            if(s[i] <= e[j]) {
                chairs++;
                i++;
            }
            else
            {
                chairs--;
                j++;
            }
        }
           return chairs;
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 6, 5, 3};
        int b[] = {5, 5, 7, 6, 8};
        int res = minChairs(a,b);
        System.out.println(res);
    }
}