/*
 * @lc app=leetcode id=206 lang=javascript
 *
 * [206] Reverse Linked List
 */

class ListNode {
  constructor(val, next) {
    this.val = val === undefined ? 0 : val;
    this.next = next === undefined ? null : next;
  }
}

// @lc code=start
/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseList = function (head) {
  let prev = null;
  while (head != null) {
    let next = head.next;
    head.next = prev;
    prev = head;
    head = next;
  }

  return prev;
};
// @lc code=end

// 28/28 cases passed (76 ms)
// Your runtime beats 83.57 % of javascript submissions
// Your memory usage beats 84.35 % of javascript submissions (43.8 MB)

let head = new ListNode(
  1,
  new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))
);
// let head = new ListNode(1, 2);
console.log(head);

let r = reverseList(head);

console.log(r);
