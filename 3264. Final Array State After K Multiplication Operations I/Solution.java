package Training;
import java.util.Arrays;

class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i = 0 ; i < k ; i++){
            int minIndex = 0 , minValue = Integer.MAX_VALUE;
            for(int j = 0 ; j < nums.length ; j++){
                if (nums.length == 1) {
                    minValue = nums[j];
                    minIndex = j;
                }
                if (nums[j] < minValue) {
                    minValue = nums[j];
                    minIndex = j;
                }
            }
            nums[minIndex] = minValue * multiplier;
            System.out.println(Arrays.toString(nums));
            minIndex = 0;
            minValue = Integer.MAX_VALUE;
        }

        return nums;
    }
}