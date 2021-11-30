import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int evens[] = new int[nums.length];
        int odds[] = new int[nums.length];
        int e=0,o=0;
        for (int i : nums) {
            if (i % 2 == 0) {
                evens[e++]=i;
            } else {
                odds[o++]=i;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (e!=0){
                nums[j] = evens[e--];
            }
            else{
                nums[j] = odds[o--];
            }
        }
        return nums;
    }
}
