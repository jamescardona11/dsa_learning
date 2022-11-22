/*
 * @lc app=leetcode id=21 lang=javascript
 *
 * [21] Merge Two Sorted Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} list1
 * @param {ListNode} list2
 * @return {ListNode}
 */
var mergeTwoLists = function (list1, list2) {
  // check input
  if (!list1) return list2;
  if (!list2) return list1;

  let merge = new ListNode();
  let head = merge;

  while (list1 && list2) {
    if (list1.val < list2.val) {
      merge.next = list1;
      list1 = list1.next;
    } else {
      merge.next = list2;
      list2 = list2.next;
    }

    merge = merge.next;
  }

  merge.next = list1 || list2;

  return head.next;
};
// @lc code=end

let arr1 = [0, 3, 4, 31];
let arr2 = [4, 6, 30];

console.log(mergeTwoLists(arr1, arr2));
// mergeTwoLists(arr1, arr2);
