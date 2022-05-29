import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0) count0++;
            else if(arr[i] == 1) count1++;
            else  count2++;
        }
        int ind = 0;
        while(count0 > 0){
            arr[ind] = 0;
            count0--; ind++;
        }
        while(count1 > 0){
            arr[ind] = 1;
            count1--; ind++;
        }
        while(count2 > 0){
            arr[ind] = 2;
            count2--; ind++;
        }
        
    }
}
