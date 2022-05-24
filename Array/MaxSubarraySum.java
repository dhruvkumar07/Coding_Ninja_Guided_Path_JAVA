import java.util.* ;
import java.io.*;

public class Solution {

	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
        long cb = arr[0];
        long ob = arr[0];

        for(int i = 1; i < n; i++){
            long dig = cb + arr[i];
            if(dig > arr[i]){
                cb = dig;
            }
            else{
                cb = arr[i];
            }
            if (cb < 0){
                cb = 0;
            }
            if( cb > ob){

                ob = cb;
            }
        }
            long ans = ob;
            return ans;
	}

}
