import java.util.*;
public class Solution {

	public static long maxSubSumKConcat(ArrayList<Integer> arr, int n, int k) {
		// Write your code here.
        for(int i = 0; i < n; i++ ){
            arr.add(n+i , arr.get(i));
        }
        long cs = arr.get(0);
        long ob = arr.get(0); //alloverbest
        long sum = 0; //sum of all element only once w/o repetation
        for(int i = 0; i < n; i++){
            sum = sum + arr.get(i);
        }
        for(int i = 1; i < 2*n; i++){
            long dig = cs + arr.get(i);
            if(dig > arr.get(i)){
                cs = dig;
            }
            else{
                cs = arr.get(i);
            }
            if(cs > ob){
                ob = cs;
            }
        }
        if(sum > 0){
            return (sum * (k-2)) + ob;
        }
        else{
            return ob;
        }

	}
    
}
