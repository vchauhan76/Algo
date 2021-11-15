package Company;

import java.util.Arrays;

public class KthLargestElementInAnArray {


    public static int largestElement(int [] nums, int k) {

        Arrays.sort(nums);
        int len = nums.length;

        return nums[len - k];

    }


    public static void main(String args[]) {



    }


}
