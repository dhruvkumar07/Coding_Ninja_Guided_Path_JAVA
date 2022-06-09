import java.util.*;

public class Solution{
	public static boolean possibleToMakeTriangle(ArrayList<Integer> arr){
		// Write your code here.
        if(arr.size() < 3) return false;
        boolean flag = false;
        Collections.sort(arr);
        for(int i = 0; i < arr.size() - 2; i++){
            if(arr.get(i) + arr.get(i+1) > arr.get(i+2)) flag = true;
        }
        return flag;
	}
}
