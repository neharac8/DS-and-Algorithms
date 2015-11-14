
/*
 * Class to find the element in a rotated sorted array
 */

public class Searchelem_fromrotated {
	/*
	 * Main method
	 */
	public static void main(String args[])
	{
		int arr[] = new int[]{4,5,6,7,0,1,2};
		
		int target = 6;
		
		int pivot = findpivot(arr, target);
		
		int resultindex = search(arr,target,pivot);
		System.out.println(resultindex);
	}
	
	/*
	 * Method search() to display the array index
	 */
    public static int search(int[] nums, int target,int pivot) {
        
        
       
        if(nums.length == 0)
        {
            return 0;
        }
        if(nums.length == 1 && target == nums[0])
        {
            return 0;
        }
        if(nums.length == 1 && target != nums[0])
        {
            return -1;
        }
        int indexfound;
       
        if(target >= nums[0])
        {
            int low = 0;
            int high = pivot;
        indexfound = binsearch(nums, target, low, high);
        }
        else
        {
            int low = pivot + 1;
            int high = nums.length - 1;
            indexfound  = binsearch(nums, target, low, high);
        }
        
        return indexfound;
    }
    
    /*
     * Method findpivot : To find the position where the array is roatated
     */
    public static int findpivot(int nums[], int target)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<nums[i+1])
            {
                
            }
            else
            {
                return i;
            }
        }
        return -1;
    }
    
    /*
     * Method binsearch : To locate the index using binary search
     */
    public static int binsearch(int[] nums, int target, int low, int high)
    {
    	 while(high>=low)
         {
        int mid = (low+high)/2;
        
       
            if(target == nums[mid])
            {
                return mid;
            }
            
            else if(target > nums[mid])
            {
                low = mid;
            }
            else
            {
                high = mid;
            }
        }
        return -1;
        
        
        
        
    }
}//end of class