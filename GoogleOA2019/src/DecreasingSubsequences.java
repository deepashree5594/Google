public class DecreasingSubsequences {

        public static int leastSubsequences(int[] nums)
        {
            int[]  res = new int[nums.length];
            int size = 0;
            for (int val : nums) {
                int pos=binarySearch(res, 0, size, val);
                res[pos]=val;
                if (pos == size) size++;
            }
            return size;
        }
        public static int binarySearch(int[] nums, int low, int high, int target)
        {
            while (low<high)
            {
                int mid = (high+low)/2;
                if (nums[mid] <= target)
                    low = mid+1;
                else
                    high = mid;
            }
            return low;
        }


    public static void main(String[] args) {
        int arr[] = new int[]{1,1,1,1};
        int r = leastSubsequences(arr);
        System.out.println(r);
    }
        }



