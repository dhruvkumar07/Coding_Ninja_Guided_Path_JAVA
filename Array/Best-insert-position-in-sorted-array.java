public class Solution {	
	public static int bestInsertPos(int [] arr, int n, int m){
		// Write your code here.
        if(arr[n - 1] < m) return n;
        if(arr[0] > m || arr.length == 0) return 0;
        
        int l = 0; int h = n - 1;
        int ans = 0;
        while(l <= h){
            int mid = (h + l) / 2;
            if(arr[mid] > m){
                h = mid - 1;
                ans = mid;
            }
            else if (arr[mid] < m){ 
                l = mid + 1;
                ans = mid + 1;
            }
            else{
                return mid;
            }
        }
        return ans;
	}
}
