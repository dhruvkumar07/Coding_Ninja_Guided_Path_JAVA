public class Solution
{
public static int maxSumRectangle(int[][] arr, int n, int m)
    {
        int max  = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++){
            int[] temparr = new int[m];
            for (int j = i; j < n; j++){
                for(int k = 0; k < m; k++){
                     temparr[k] += arr[j][k];   
                }
                 max = Math.max(max, kadanes(temparr , m));   
            }  
          }  
        return max;
    }
public static int kadanes(int[] arr , int m)
    {
        int cs = arr[0];
        int ob = arr[0];
        for(int k = 1; k < m; k++){
            int dig = cs + arr[k];
            if(dig > arr[k]){
                cs = dig;
            }
            else{
                cs = arr[k];
            }
            if(cs > ob){
                ob = cs;
            }
        }
        return ob;
    }
}
