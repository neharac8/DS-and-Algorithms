import java.util.*;

class Rem_Char_first_frmsec{

public static void main(String args[])
{
    String str1, str2;
    Scanner scan = new Scanner(System.in);
    str1 = "geeksforgeeks";
    str2 = "mask";
    String result = removechars(str1, str2);
    System.out.println("Result is :"+result);
    
    
    

}// close of main

public static String removechars(String str1, String str2)
{
     StringBuilder sb = new StringBuilder();
     boolean[] asciival = new boolean[256];
     for(int i=0;i<str2.length();i++)
     {
         char ch = str2.charAt(i);
         asciival[ch] = true;
     
     }   
     for(int j=0;j<str1.length();j++)
     {
         char ch2 = str1.charAt(j);
         if(asciival[ch2] == false)
         {
             sb.append(ch2);
         }
     
     }
     return sb.toString();

}// close of method

}//end of class