// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
import java.util.Arrays;

public class MinMaxFinder {

    private static int[] findMinMax(int[] A, int n){
        int[] result = {Integer.MIN_VALUE, Integer.MAX_VALUE};
        for(int i=0; i < n; i++){
            if(result[0] < A[i]){
                result[0] = A[i];
            }
            if(result[1] > A[i]){
                result[1] = A[i];
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        int[] A = { 4, 9, 6, 5, 2, 3 };
        int N = A.length;
        System.out.println("Minimum & Maximum element are: " + Arrays.toString(findMinMax(A, N)));
    }
}
