import java.util.Arrays;

public class LargestSubArrayLengthk {
    public static void main(String[] args) {
        int[] array = new int[]{1,4,2,3,5};
        int v= 4;
        int[] r = maxSubarray(array,v);
        System.out.println(Arrays.toString(r));
    }

    public static int[] maxSubarray(int[] a, int k)
    {
        int[] res = new int[k];
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;

        if (a.length == 0) return new int[]{};

        for (int i = 0;i<a.length-k+1;i++)
        {
            if (a[i] >  max)
            {
                max = a[i];
                maxIndex = i;
            }
        }
        for (int i=0; i<k;i++)
        {
            res[i] = a[maxIndex];
            maxIndex++;
        }
        return res;
    }
}
