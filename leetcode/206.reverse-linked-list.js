/*
 * @lc app=leetcode id=206 lang=javascript
 *
 * [206] Reverse Linked List
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
 * @param {ListNode} head
 * @return {ListNode}
 */

// 28/28 cases passed (56 ms)
// Your runtime beats 53.43 % of javascript submissions
// Your memory usage beats 39.39 % of javascript submissions (44.3 MB)
// var reverseList = function(head) {
//   if(head == null || head.next == null) return head
  
//   let n = reverseList(head.next)
//   head.next.next = head
//   head.next = null

//   return n

// };

// 28/28 cases passed (61 ms)
// Your runtime beats 22.65 % of javascript submissions
// Your memory usage beats 67.87 % of javascript submissions (44.1 MB)
var reverseList = function(head) {
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




class ListNode {
  constructor(val, next) {
    this.val = val === undefined ? 0 : val;
    this.next = next === undefined ? null : next;
  }
}


let head = new ListNode(
  1,
  new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))
);
// let head = new ListNode(1, 2);
// console.log(head);

let r = reverseList(head);

console.log(r);