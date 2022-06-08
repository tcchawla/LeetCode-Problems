import java.util.Arrays;

/* Problem Link
 https://leetcode.com/problems/contains-duplicate/
*/

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 0, 2};
        boolean ans = containsDuplicate(nums);
        System.out.println(ans);
    }
/* This is the solution using brute-force approach     Time Complexity - O(N * N) Space -  O(1)
    static boolean containsDuplicate(int[] nums) {
        if(nums.length < 2) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = i + 1 ; j < nums.length; j++) {
                  if(num == nums[j]) {
                      return true;
                  }
            }
        }
        return false;
    }
*/

/* This was the method which I was trying to use without HashSet, but getting errors
     static boolean containsDuplicate (int[] nums) {
              if(nums.length < 2) {
             return false;
         }
         int[] unique = new int[nums.length];
         for (int i = 0; i < nums.length; i++) {
             int num = nums[i];
             for (int j = 0; j < nums.length; j++) {
                 if(num != 0 && num == unique[j]) {
                     return true;
                 } else if(num == 0 && j == i) {
                     return false;
                 }
             }
             unique[i] = num;
         }
         return false;
     }
 */


// This is the Solution - Using Sorting     Time Complexity - O(N) Space - O(1)
    static boolean containsDuplicate(int[] nums) {
        if(nums.length < 2) {
            return false;
        }

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i <= nums.length - 1; i++) {
            if(i+1 < nums.length && nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}

