/**
   Class to compute the approximate cover based on the given input graph
*/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/**
 Pair class is used to create pairs in edge set(u,v) where u and v are vertices. The value x is the vertex u
 and the value y is the vertex v where (u,v) denotes an edge in the edge set.
*/
class Pair
{
   public int first;
   public int second;
   
   Pair(int x, int y)
   {
     first = x;
     second = y;
   }
   /*
   This methods is used to override the display method toString() to display the edge in (u,v) pair form
   */	  
   public String toString() 
   {
   return "(" + this.first + "," + this.second + ")";
   }
}
/**
  Class to compute Approx vertex cover based on the given adjacency matrix of the graph
 */
public class ApproxVertexCover 
{
   /* 
   The below mentioned variables are declared as public static since they are globally updated. 
   */
   public static  int[][] adjMatrix = null;
   public static int[][] edgeSetMatrix = null;
   public static int numVertices = 0;
   public static int numEdges = 0;
   public static ArrayList<Pair> edgelist = new ArrayList<Pair>();
   public static ArrayList<Integer> coverlist = null;
   /**
       Driver method for ApproxVertexCover
       @param args  command line arguments array, args[0] should contain
          the input file containing the adjacency matrix of the graph whose 
		  approx vertex cover we should calculate. The main method handles
		  the FileNotFoundException and IOException.
    */
   public static void main(String[] args) throws FileNotFoundException, IOException 
   {
     final String INPUT_FILE_NAME = args[0];
     adjMatrix = getAdjMatrix(INPUT_FILE_NAME);
     edgeSetMatrix = adjMatrix;
     coverlist  = new ArrayList<Integer>();
	 int k = 0;
	 int l = 0;
     for(k = 0; k < adjMatrix.length; k++)
     {
       for (l = 0; l < adjMatrix.length; l++)
       {
         if(adjMatrix[k][l] == 1)
	     {
           Pair obj = new Pair(k, l);
           edgelist.add(new Pair(k, l));
         }
       }
     }
     int minrange,maxrange;
     System.out.println("Edges chosen : ");
	 /**
	 APPROX-VERTEX-COVER(G) : Implements the Approximate vertex cover Algorithm
		1. C = null
		2. E'= E[G]
		3. while E' ≠ ∅
		4.    let {u, v} be an arbitrary edge of E'
        5.    C = C ∪ {u, v}
        6.    Remove from E' every edge incident with either u or v
        7. return C.
		*/
	 //Step 3: Checks whether the edgelist is empty
     while(!edgelist.isEmpty())
     {
       minrange = 0;
       maxrange = edgelist.size() - 1;
	   
	   //Step 4: Selects a random edge (u,v), given as u_remove and v_remove from the remaining edge set
       int random_edge_selected = randInt(minrange, maxrange);
       Pair rem  = edgelist.get(random_edge_selected);
       System.out.println(rem);
       int u_remove = rem.first;
       int v_remove = rem.second;
	   
	   //Step 5: Adding the edge selected to the cover list 
       coverlist.add(u_remove);
       coverlist.add(v_remove);
	   
	   //Step 6: Remove from the edge set E', every edge incident on u or v
       remove_edges_possible(u_remove,v_remove,random_edge_selected);
     }
     System.out.println("Cover found");
     Collections.sort(coverlist);
	 
	 //Step 7: The edge set is empty and the cover is returned
     System.out.println(coverlist);
  }
   /**
      This method outputs the results after deleting the random edge selected from the remaining edge set.
	  @param u_remove number, is the vertex u
	  @param v_remove, is the vertex v where the pair (u,v) denotes the edge selected at random
	  @param random_edge_selected is the index from the edge set which is selected at random
   */
   public static  void remove_edges_possible(int u_remove, int v_remove,int random_edge_selected)
   {
     ArrayList<Pair> edgelist1 = new ArrayList<Pair>();
	 int k = 0;
	 int l = 0;
     for(k = 0; k < edgeSetMatrix.length; k++)
     {
       for (l = 0; l < edgeSetMatrix.length; l++)
       {	
         edgeSetMatrix[k][u_remove] = 0;
         edgeSetMatrix[k][v_remove] = 0;
         edgeSetMatrix[u_remove][l] = 0;
         edgeSetMatrix[v_remove][l] = 0;
         if(edgeSetMatrix[k][l] == 1)
         {
           Pair obj = new Pair(k, l);
           edgelist1.add(new Pair(k, l));
         }
       }
     }
     edgelist = edgelist1;	
   }	
   /**
      This method returns a random index from the edge set which will be deleted
	  @param minrange number, is the lowerbound of edge set which is 0
	  @param maxrange number, is the upper bound of edgeset
	  @return int randomNum,returns a random index between the lower bound and upper bound of edge set.
   */		
   public static int randInt(int minrange, int maxrange) 
   {
     Random rand = new Random();
     int randomNum = rand.nextInt((maxrange - minrange) + 1) + minrange;
     return randomNum;
   }
   /**
      This method reads the adjacency matrix from the input file
	  @param filePath string, takes the file path as input 
      @return int[][] result, which returns the adjacency matrix
   */
   public static int[][] getAdjMatrix(String filePath) throws FileNotFoundException, IOException 
   {	
     FileReader reader = new FileReader(filePath);
     BufferedReader buffer = new BufferedReader(reader);
     ArrayList<String> list = new ArrayList<String>();
     String line = buffer.readLine();
     
     while (line != null) 
     {
         list.add(line);
         line = buffer.readLine();
     }
     int row = list.size();
     int col = list.get(0).split(" ").length;
     numVertices = row;     
     int[][] result = new int[row][col];     
     int i = 0;
     for (String str : list) 
     {
         String[] arr = str.split(" ");
         int j = 0;
         for (String s : arr) 
         {
             result[i][j] = new Integer(s).intValue();
             j++;
         }
         i++;
     }
     int j = 0;
	 int k = 0;
     for (j = 0; j < numVertices; j++)
     {
     	for (k = 0; k < numVertices; k++)
     	{
     		if (1 == result[j][k])
     		{
     			numEdges++;
     		}
     	}
     }
     buffer.close();
     return result;
  }
}
