package geeks_prac;
import java.util.*;

//The class checks for pairs in array when the sum is given
public class Checkforpairinarray {

	public static void main(String args[])
	{
	Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
	Scanner scan = new Scanner(System.in);
	int arr[] = new int[6];
	int sumval = 0;
	int i;
	
	System.out.println("Enter the array");
	for(i=0;i<arr.length;i++)
	{
		arr[i] = scan.nextInt();
	}
	System.out.println("Enter the sum");
	sumval = scan.nextInt();
	for(i=0;i<arr.length;i++)
	{
	    map.put(arr[i],i);
	}
	for(i=0;i<arr.length;i++)
	{
		
	    if(map.containsKey(sumval- arr[i]))
	    {
	    int diff = sumval-arr[i];
	    if(map.containsKey(diff))
	    {
	        System.out.println("Pair :");
	        System.out.println(arr[i] + "," + diff);
	        
	    }
	    
	    }

	}
	}
}
