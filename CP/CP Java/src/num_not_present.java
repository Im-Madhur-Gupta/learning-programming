import java.util.LinkedList;
import java.util.List;

// AWSM Question
class Solution4 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int index;
        List<Integer> nums_not_present = new LinkedList<>();
        for (int e : nums) {
            index = Math.abs(e); // got the absolute value
            if(nums[index-1]>0){
                nums[index-1] *= -1;
                // marking that the (index) was seen in nums by making nums[index-1] value negative
            }
        }
        // Ab, agr (index+1) wala number aya hoga to nums[index] will be negative.
        // Agr (index+1) wala number ni aya hoga to nums[index] will be positive.
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                nums_not_present.add(i+1);
            }
        }
        return nums_not_present;
    }
}