package impovich.algorithms.easy;


/*
https://leetcode.com/problems/single-number/#/description
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
* */

import java.util.HashSet;
import java.util.Set;

/**
 * @author Alexander Hamza
 *         created 04/05/2017.
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        Set<Integer> elementsHolder = new HashSet<>();

        for (int num : nums) {
            if (!elementsHolder.add(num)) {
                elementsHolder.remove(num);
            }
        }

        // unhandled java.util.NoSuchElementException in case nums array doesn't contain unique element or empty
        return elementsHolder.iterator().next();
    }

    public int singleNumberWithOutExtraMemory(int[] nums) {
        int result = nums[0];
        for(int i = 1; i < nums.length; i++) result ^= nums[i];
        return result;
    }
}
