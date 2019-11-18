public class WateringFlowers
{
    public static void main(String[] args) {
        int[] p = new int[]{2,4,5,1,2};
        int count = Solution(p,5,7);
        System.out.println(count);

    }
    public static int Solution(int[] plants, int capacity1, int capacity2){
        if (plants.length == 0) return 0;
        int refills  = 2;
        int i = 0;
        int j = plants.length-1;
        int maxcapacity1 = capacity1;
        int maxcapacity2 = capacity2;
        while (i<=j)
        {
            if (i==j)
            {
                if (capacity1+capacity2<plants[i]){
                    refills++;
                    break;
                }
                break;
            }
            if (capacity1 >= plants[i])
            {
                capacity1 -= plants[i];
                i++;
            }
            else
            {
                refills++;
                capacity1 = maxcapacity1;
                capacity1 -= plants[i];
                i++;
            }
            if (capacity2 >= plants[j])
            {
                capacity2-= plants[j];
                j--;
            }
            else
            {
                capacity2 = maxcapacity2;
                capacity2 -= plants[j];
                j--;
            }
        }
        return  refills;
    }
}
