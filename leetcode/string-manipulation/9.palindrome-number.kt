/*
 * @lc app=leetcode id=9 lang=kotlin
 *
 * [9] Palindrome Number
 *
 * https://leetcode.com/problems/palindrome-number/description/
 *
 * algorithms
 * Easy (55.54%)
 * Likes:    12324
 * Dislikes: 2704
 * Total Accepted:    4.5M
 * Total Submissions: 8M
 * Testcase Example:  '121'
 *
 * Given an integer x, return true if x is a palindrome, and false
 * otherwise.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it
 * becomes 121-. Therefore it is not a palindrome.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a
 * palindrome.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * -2^31 <= x <= 2^31 - 1
 * 
 * 
 * 
 * Follow up: Could you solve it without converting the integer to a string?
 */
// 11511/11511 cases passed (171 ms)
// Your runtime beats 99.88 % of kotlin submissions
// Your memory usage beats 68.63 % of kotlin submissions (36.6 MB)
// @lc code=start
class Solution {
    fun isPalindrome(x: Int): Boolean {
        // Handle negative numbers (palindromes cannot be negative)
        if (x < 0) return false
      
        // Handle single-digit numbers (all are palindromes)
        if (x < 10) return true
      
        var reversed = 0
        var original = x
      
        // Reverse digits of the number efficiently
        while (original > 0) {
          val digit = original % 10
          reversed = reversed * 10 + digit
          original /= 10
        }
      
        // Check if original and reversed numbers are equal
        return x == reversed
      }
}
// @lc code=end

fun main() {
  val isNineAPalindrome = Solution().isPalindrome(9)
  println("Is 9 a palindrome: $isNineAPalindrome")
}