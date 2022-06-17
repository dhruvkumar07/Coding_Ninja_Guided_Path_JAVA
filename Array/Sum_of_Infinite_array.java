import java.util.List;

import java.util.ArrayList;

public class Solution {

    private static int mod = (int) 1e9 + 7;

    public static List<Integer> sumInRanges(int[] arr, int n, List<List<Long>> queries, int q) {

        // It stores answer for each query.
        List<Integer> ans = new ArrayList<>();

        // It store cumulative sum where sumArray[i] = sum(A[0]+..A[i]).
        long sumArray[] = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            sumArray[i] = (sumArray[i - 1] + arr[i - 1]) % mod;
        }

        // Traversing the given queries.
        for (List<Long> range : queries) {

            long l = range.get(0);
            long r = range.get(1);

            // It stores the prefix sum from index 0 to index r in an infinite array.
            long rsum = func(sumArray, r, n);

            // It stores the prefix sum from index 0 to index l-1 in an infinite array.
            long lsum = func(sumArray, l - 1, n);

            // Add answer for each query.
            ans.add((int) ((rsum - lsum + mod) % mod));

        }

        return ans;
    }

    // Function to calculate prefix sum upto index x of the infite array.
    private static long func(long sumArray[], long x, long n) {

        // Number of times the given array comes completely upto index x.
        long count = (x / n) % mod;

        long res = (count * sumArray[(int) n]) % mod;

        // Adding the remaining elements sum.
        res = (res + sumArray[(int) (x % n)]) % mod;

        return res;
    }
}
