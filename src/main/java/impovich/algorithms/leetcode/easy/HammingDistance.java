package impovich.algorithms.leetcode.easy;

/**
 * https://leetcode.com/problems/hamming-distance/#/description
 * Hamming Distance - https://en.wikipedia.org/wiki/Hamming_distance
 *
 The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

 Given two integers x and y, calculate the Hamming distance.

 Note:
 0 ≤ x, y < 231.

 Example:

 Input: x = 1, y = 4

 Output: 2

 Explanation:
 1   (0 0 0 1)
 4   (0 1 0 0)
        ↑   ↑

 The above arrows point to positions where the corresponding bits are different.
 * */

/**
 * @author Alexander Hamza
 *         created 04/05/2017.
 */
public class HammingDistance {

    public int hammingDistance(int x, int y) {
        StringBuilder first = new StringBuilder(Integer.toBinaryString(x));
        StringBuilder second = new StringBuilder(Integer.toBinaryString(y));

        while (first.length() < second.length()) {
            first.insert(0, 0);
        }

        while (second.length() < first.length()) {
            second.insert(0, 0);
        }

        int hammingDistance = 0;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) hammingDistance++;
        }

        return hammingDistance;
    }
}
