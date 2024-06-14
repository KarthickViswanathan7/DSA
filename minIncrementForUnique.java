import java.util.*;
class minIncrementForUnique {
    public static int minIncrementForUnique(int[] nums) {
    
    int l = nums.length;
    Arrays.sort(nums);
    int steps=0;
        for (int i = 1; i <l ; i++) {
            if(nums[i]<=nums[i-1])
            {

                steps+=(nums[i-1]-nums[i])+1;
                nums[i]=nums[i-1]+1;

            }
        }
        return steps;
    }
}
//[3,2,1,2,1,7]
//[1,2,2]