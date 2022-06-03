import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Solution {
   public static List<Integer> countSmallerOrEqual(int[] a, int[] b, int n, int m) {
      List<Integer> list = new ArrayList<>();
      Arrays.sort(b);
      for(int i=0 ; i<n ; i++){
          list.add(count(b,m,a[i]));
      }
       return list;
   }
   public static int count(int[] arr, int m, int x){
       int left=0, right=m-1, count=0;
       while(left<=right){
           int mid=(left+right)/2;
           if(arr[mid]<=x){
               count=mid+1;
               left=mid+1;
           }
           else{
               right=mid-1;
           }
       }
       return count;
   }
}
