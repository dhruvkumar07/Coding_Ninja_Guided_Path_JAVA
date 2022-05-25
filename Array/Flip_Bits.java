public class Solution {
	public static int flipBits(int[] arr,int n) {
        //Write your code here
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0)  arr[i] = 1;
            else {
                arr[i] = -1;
                count++;
            }
        }   
        int cs = 0;
        int ob = 0;
        
        for(int i = 0; i < n; i++){
            int dig = cs + arr[i];
            if(arr[i] < dig){
                cs = dig;
            }
            else{
                cs = arr[i];
            }
            if(cs > ob){
                ob = cs;
            }
        }
        return ob + count;
	}
}
