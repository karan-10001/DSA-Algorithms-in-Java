import java.lang.*;
import java.util.*;
import java.io.*;

public class ReverseArray {

    public static void main(String[] args)
    {
        //revese the array using two pointer
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(arr));

        System.out.println("reverse the array using two pointer");

        int start=0;
        int end=arr.length-1;

        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }

        System.out.println(" reversed array : "+ Arrays.toString(arr));



        //other way is to create new array and just enter  all the element of old array from last element to first element in new array.
        
        
    }
    
}
