package geeks_prac;
import java.util.*;

// The program computes the maximum size square sub-matrix with all 1s
public class Maimumordersquaresubmatrix {
	public static void main(String args[])
	{
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Entering the order of matrix");
	    int m;
	    int n;
	    System.out.println("The row order is");
	    m = scan.nextInt();
	    System.out.println("The column order is");
	    n = scan.nextInt();
	    System.out.println("Enter the matrix :");
	    int i,j;
	    int arr[][] = new int[10][10];
	    for(i=0;i<m;i++)
	    {
	    for(j=0;j<n;j++)
	    {
	    arr[i][j] = scan.nextInt();
	    }
	    }
	    
	    System.out.println("Printing the matrix input");
	    
	    for(i=0;i<m;i++)
	    {
	    for(j=0;j<n;j++)
	    {
	   
	    System.out.println(arr[i][j]);
	  
	    }
	    System.out.println("\n");
	    }
	    
	    int sub[][] = new int[m][n];
	    
	    for(i=0;i<m;i++)
	    {
	    j=0;
	    sub[i][j] = arr[i][j];
	    }
	    
	    for(j=0;j<n;j++)
	    {
	    i=0;
	    sub[i][j] = arr[i][j];
	    }
	    
	    for(i=1;i<m;i++)
	    {
	    for(j=1;j<n;j++)
	    {
	    if(arr[i][j] == 0)
	    {
	        sub[i][j] = 0;
	    }
	    else if(arr[i][j] == 1)
	    {
	        sub[i][j] = Math.min(arr[i-1][j],Math.min(arr[i][j-1],arr[i-1][j-1]))+1;
	    }
	    
	    
	    }
	    
	    }
	    
	    //Final output
	    int maxorder = 0;
	    for(i=0;i<m;i++)
	    {
	    for(j=0;j<n;j++)
	    {
	    if(sub[i][j] > maxorder)
	    {
	        maxorder = sub[i][j];
	    }
	    
	    }
	    }
	    System.out.println("The maximum order of the array with square of 1's are");
	    System.out.println(maxorder);

	} // End of main
}
