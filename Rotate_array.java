//Function to rotate an array

public class Solution {
    public void rotate(int[] nums, int k) {
        
        int order = k % nums.length;
        k=order;
        if(nums == null || k<0 || order < 0)
        {
            throw new IllegalArgumentException("Illegal argument");
           
        }
        int n = nums.length;
        int diff = n - k;
        
        rotatearr(nums, 0, diff-1);
        rotatearr(nums, diff, n-1);
        rotatearr(nums, 0, n-1);
        
        
    }
    
    public void rotatearr(int[] nums, int first, int last)
    {
        int temp;
        if(nums == null || nums.length == 1)
        {
            return;
        }
        while(first < last)
        {
            temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;
            first++;
            last--;
        }
    }
}