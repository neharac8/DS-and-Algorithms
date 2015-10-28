//Function to determine the first missing positive

public class Solution {
    public int firstMissingPositive(int[] nums) {
        
       
        int i;
        for(i=0;i<nums.length;i++)
        {
            while(i != nums[i])
            {
                if(nums[i] < 0 || nums[i]>nums.length)
                {
                    break;
                }
                if(nums[i] == nums[nums[i]])
                {
                    break;
                }
                int temp;
                temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        
        for(i=0;i<nums.length;i++)
        {
            if(i != nums[i])
            {
                return i;
            }
        }
        return nums.length;
        
    }
}