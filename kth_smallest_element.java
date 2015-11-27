package heap;

import java.util.Scanner;

//To find the kth smallest element
public class kth_smallest_element {

	public static int[] arr = null;
	public static int largest;
	public static int[] heap_arr = null;
	public static int n;
	public static int left;
	public static int right;
	public static int k;
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		arr = new int[]{2,6,5,4,8,9,567,988,123,33};
		
		System.out.println("Enter the value for k");
		k = scan.nextInt();
		
		heap_arr = new int[k];
		
		for(int i=0;i<k;i++)
		{
			heap_arr[i] = arr[i];
		}
		
		build_max_heap(heap_arr);
		
		for(int i=k;i<arr.length;i++)
		{
			if(heap_arr[0] > arr[i])
			{
				heap_arr[0] = arr[i];
				build_max_heap(heap_arr);
			}
		}
		
		System.out.println("The "+k+"th smallest element is:"+heap_arr[0]);
	}
	
	public static void build_max_heap(int heap_arr[])
	{
		n = heap_arr.length - 1;
		for(int i=n/2;i>=0;i--)
		{
			heapify(heap_arr,i);
		}
	}
	
	public static void heapify(int heap_arr[], int i)
	{
		left = 2*i;
		right = 2*i + 1;
		
		if(left <= n && heap_arr[left]>heap_arr[i])
		{
			largest = left;
		}
		else
		{
			largest = i;
		}
		if(right <= n && heap_arr[right]>heap_arr[largest])
		{
			largest = right;
		}
		if(largest != i)
		{
			exchange(i,largest);
			heapify(heap_arr,largest);
		}
	}
	public static void exchange(int i, int j)
	{
		int temp = heap_arr[i];
		heap_arr[i] = heap_arr[j];
		heap_arr[j] = temp;
	}
	
	
	
	
}
