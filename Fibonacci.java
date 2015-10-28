package geeks_prac;

import java.util.Arrays;

// The class generates the Fibonacci series
public class Fibonacci {

	public static int[] Fib(int n)
	{
		int arr1[] = new int[n];
		arr1[0] = 0;
		arr1[1] = 1;
		int i;
		
		for(i=2;i<n;i++)
		{
			arr1[i] = arr1[i-1] + arr1[i-2];
		}
			return arr1;
	}
	public static void main(String args[])
	{
		int n=9;
		int arr[] = new int[n];
		arr = Fib(n);
		System.out.println(Arrays.toString(arr));
	}
}
