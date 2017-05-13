package impovich.algorithms.leetcode.easy;

/**
 * https://leetcode.com/problems/array-partition-i/#/description
 * <p>
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 * <p>
 * Example 1:
 * Input: [1,4,3,2]
 * <p>
 * Output: 4
 * Explanation: n is 2, and the maximum sum of pairs is 4.
 * Note:
 * n is a positive integer, which is in the range of [1, 10000].
 * All the integers in the array will be in the range of [-10000, 10000].
 */

import java.util.Arrays;

/**
 * @author Alexander Hamza
 *         created 13/05/2017.
 */
public class ArrayPartitionI {

    public int arrayPairSum(int[] nums) {
        if (nums == null || nums.length < 2) return 0;
        if (nums.length % 2 != 0) return 0;
        if (nums.length / 2 > 10000) return 0;

        Arrays.sort(nums);

        if (nums[0] < (-10000)) return 0;
        if (nums[nums.length - 1] > 10000) return 0;

        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }
}
