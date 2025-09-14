
import java.io.*;
import java.util.*;
import java.lang.*;

public class  FindMinMaxElementInArray{

   public static void main(String[] args)
   {
      //Find the maximum element in array 

       //creating object of scanner class
       Scanner sc= new Scanner(System.in);

       //input the size of array
       System.out.println("Enter the size of array:");
       int sizeOfArray=sc.nextInt();

       //declaring the array (initialized by default with 0)
       int[] arr= new int[sizeOfArray];

       //input the array elements
       System.out.println("Enter the array element:");
       for(int i=0;i<sizeOfArray;i++)
       {
           arr[i]=sc.nextInt();  
       }

       //print the array
       System.out.println("Print the array");
       for(int i=0;i<sizeOfArray;i++)
       {
           System.out.println(arr[i]+" ");
       }

       //intializing the min | max result
       int max=arr[0], min=arr[0];

       //simple logic to find the min & max of the array 
       for(int i=0;i<arr.length;i++)
       {
        if(max<=arr[i])
        {
            max=arr[i];
        }
        if(min>=arr[i])
        {
            min=arr[i];
        }
       }


       //print the result
       System.out.println("Max element of given array is: "+max);
       System.out.println("Min element of given array is : "+ min);


   }

}