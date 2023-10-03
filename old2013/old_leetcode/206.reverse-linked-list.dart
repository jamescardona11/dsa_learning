// ignore_for_file: public_member_api_docs, sort_constructors_first
/*
 * @lc app=leetcode id=206 lang=javascript
 *
 * [206] Reverse Linked List
 */

// @lc code=start

//Definition for singly-linked list.
class ListNode {
  int val;
  ListNode? next;
  ListNode([this.val = 0, this.next]);

  @override
  String toString() => 'ListNode(val: $val, next: $next)';

  String asString() => 'ListNode(val: $val)';
}

class Solution {
  ListNode? reverseList(ListNode? head) {
    ListNode? prev = null;
    while (head != null) {
      ListNode? next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }

    return prev;
  }
}
// @lc code=end

// Runtime: 624 ms, faster than 9.46% of Dart online submissions for Reverse Linked List.
// Memory Usage: 148.5 MB, less than 24.32% of Dart online submissions for Reverse Linked List.

void main() {
  final s = Solution();
  final node = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))));

  // print(node);

  final newH = s.reverseList(node);

  print('newH.toString()');
  print(newH.toString());
}
