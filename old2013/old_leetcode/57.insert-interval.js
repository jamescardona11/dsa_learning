/*
 * @lc app=leetcode id=57 lang=javascript
 *
 * [57] Insert Interval
 */

// @lc code=start
/**
 * @param {number[][]} intervals
 * @param {number[]} newInterval
 * @return {number[][]}
 */
function insert(intervals, newInterval) {
  let result = [];
  let i = 0;

  // Agregamos todos los intervalos antes del nuevo intervalo
  while (i < intervals.length && intervals[i][1] < newInterval[0]) {
    result.push(intervals[i]);
    i++;
  }

  // Unimos todos los intervalos que se solapan con el nuevo intervalo
  while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
    newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
    newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
    i++;
  }
  result.push(newInterval);

  // Agregamos todos los intervalos restantes
  while (i < intervals.length) {
    result.push(intervals[i]);
    i++;
  }

  return result;
}
// @lc code=end
