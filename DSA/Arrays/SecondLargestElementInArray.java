import java.util.Arrays;

public class SecondLargestElementInArray {
    
    public static void main(String[] args)
    {
        //declaring & assining the array
        int[] arr = new int[]{5,3,2,7,8,9,11,76,21,14};

        //to find the second largest number first we sort the array in acending arder 

        for(int i=0;i<arr.length;i++)
        {
           for(int j=0;j<arr.length-1;j++)
           {
               if(arr[j]>arr[j+1])
               {
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
               }
           }
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Second largest element of array is: "+arr[arr.length-2]);

    }
}
