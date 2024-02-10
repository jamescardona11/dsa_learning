/*
 * @lc app=leetcode id=322 lang=javascript
 *
 * [322] Coin Change
 */

// @lc code=start
/**
 * @param {number[]} coins
 * @param {number} amount
 * @return {number}
 */
// 189/189 cases passed (186 ms)
// Your runtime beats 20.81 % of javascript submissions
// Your memory usage beats 5.14 % of javascript submissions (59.8 MB)
var coinChange = function (coins, amount) {
  return coinChangeDS(coins, amount, new Map())
};

const coinChangeDS = (coins, amount, memo) => {
  if (amount == 0) return 0
  if (amount < 0) return -1
  if (memo.has(amount)) return memo.get(amount)


  let minCoins = -1
  for (let i = 0; i < coins.length; i++) {
    let subCoins = coinChangeDS(coins, amount - coins[i], memo)
    if (subCoins != -1) {
      let numCoins = subCoins + 1
      if (numCoins < minCoins || minCoins == -1) {
        minCoins = numCoins
      }
    }
  }
  memo.set(amount, minCoins)
  return minCoins


}
// @lc code=end



let r = coinChange([1, 2, 5], 11)
console.log(r)