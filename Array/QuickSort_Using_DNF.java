import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> quickSortUsingDutchNationalFlag(ArrayList<Integer> arr) {
        // Write your code here.
        int[] ans = new int[arr.size()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = arr.get(i);
        }
        quicksort(ans , 0 , ans.length - 1);
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < ans.length; i++){
            res.add(ans[i]);
        }
        return res;
        
    }
    static void quicksort(int[] arr, int low, int high){
        if(low < high){
            int p = partition(arr, low, high);
            quicksort(arr, low, p-1);
            quicksort(arr, p+1, high);
        }
    }
    static void swap(int[] arr, int low, int pivot){
        int tmp = arr[low];
        arr[low] = arr[pivot];
        arr[pivot] = tmp;
    }
    static int partition(int[] arr, int low, int high){
        int p = low, j;
        for(j=low+1; j <= high; j++)
            if(arr[j] < arr[low])
                swap(arr, ++p, j);

        swap(arr, low, p);
        return p;
    }
}
