// Sort objects so that objects of the same color are adjacent, with the colors in the order red, white and blue.


public class Solution {
    public void sortColors(int[] nums) {
        
        if(nums == null || nums.length < 2)
        {
            
            return;
        }
        int countarr[] = new int[3];
        int n = nums.length;
        int bsort[] = new int[n];
        int i,j;
        
        for(i=0;i<3;i++)
        {
            countarr[i] = 0;
        }
        for(j=0;j<n;j++)
        {
            countarr[nums[j]] = countarr[nums[j]] + 1;
        }
        
        //Pass 2
         j =0;
         int numsindex = 0;
         while(j<=2)
         {
             if(countarr[j] != 0)
             {
                 nums[numsindex] = j;
                 numsindex = numsindex + 1;
                 countarr[j] = countarr[j] - 1;
             }
             else
             {
                 j++;
             }
         }
       
       
       
       
       
       
       
    }
}