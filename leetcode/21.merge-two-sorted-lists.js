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
// 208/208 cases passed (56 ms)
// Your runtime beats 70.78 % of javascript submissions
// Your memory usage beats 75.03 % of javascript submissions (43.8 MB)
// var mergeTwoLists = function(list1, list2) {
//   // check input
//   if (!list1) return list2;
//   if (!list2) return list1;

//   let merge = new ListNode();
//   let head = merge

  
//   while(list1 && list2){

//     if(list1.val < list2.val){
//       merge.next = list1
//       list1 = list1.next
//     }else{
//       merge.next = list2
//       list2 = list2.next
//     }

//     merge = merge.next
//   }

//   merge.next = list1 || list2

//   return head.next
    
// };

// Recursive

// 208/208 cases passed (69 ms)
// Your runtime beats 10.73 % of javascript submissions
// Your memory usage beats 87.78 % of javascript submissions (43.6 MB)

var mergeTwoLists = function(list1, list2) {
  // check input
  if(list1 == null) return list2
  if(list2 == null) return list1  

  if(list1.val < list2.val){
    list1.next = mergeTwoLists(list1.next, list2)
    return list1
  }else{
    list2.next = mergeTwoLists(list1, list2.next)
    return list2
  }
};
// @lc code=end




class ListNode {
  constructor(val, next) {
    this.val = val === undefined ? 0 : val;
    this.next = next === undefined ? null : next;
  }

  toString(){
    return this.val
  }
}


let l1 = new ListNode(
  1,
  new ListNode(2, new ListNode(3, new ListNode(4)))
);

let l2 = new ListNode(
  1,
  new ListNode(2, new ListNode(4, new ListNode(5, new ListNode(6))))
);
// let head = new ListNode(1, 2);
// console.log(head);

let r = mergeTwoLists(l1, l2);

console.log(r);