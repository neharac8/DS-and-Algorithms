package heap;

import java.util.Scanner;

//To find the kth largest element
public class kth_largest_elements {
	
	public static int[] arr = null;
	public static int smallest;
	public static int n;
	public static int left;
	public static int right;
	public static int k;
	public static int[] heap_arr = null;

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		arr = new int[]{123,4,8,116,9,19,100,234,230,235,236};
		
		System.out.println("Enter the value for k ");
		k = scan.nextInt();
		
		heap_arr = new int[k];
		for(int i=0;i<k;i++)
		{
			heap_arr[i] = arr[i];
		}
		
		build_min_heap(heap_arr);
		
		for(int i=k;i<arr.length;i++)
		{
			if(heap_arr[0]<arr[i])
			{
				heap_arr[0] = arr[i];
				build_min_heap(heap_arr);
			}
		}
		
		System.out.println("The "+k+"th largest element is :");
		System.out.print(heap_arr[0] + " ");
		
	}
	
	public static void build_min_heap(int heap_arr[])
	{
		n = heap_arr.length - 1;
		for(int i=n/2;i>=0;i--)
		{
			heapify(heap_arr,i);
		}
	}
	
	public static void heapify(int heap_arr[] , int i)
	{
		left = 2*i;
		right = 2*i + 1;
		if(left<=n && heap_arr[left]<heap_arr[i])
		{
			smallest = left;
		}
		else
		{
			smallest = i;
		}
		if(right<=n && heap_arr[right]<heap_arr[smallest])
		{
			smallest = right;
		}
		if(smallest != i)
		{
			exchange(smallest,i);
			heapify(heap_arr,smallest);
		}
		
	}
	public static void exchange(int i, int j)
	{
		int temp = heap_arr[i];
		heap_arr[i] = heap_arr[j];
		heap_arr[j] = temp;
	}
	
	
}
