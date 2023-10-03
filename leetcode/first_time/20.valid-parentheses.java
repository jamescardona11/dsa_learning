import java.util.Stack;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        boolean result = false;
    // System.out.println(s);
    if(s.length() % 2 != 0) return result;
    Stack<Integer> pending = new Stack<Integer>();

    for(int i = 0; i < s.length(); i++){
        result = false;
        if(s.charAt(i) == '(') pending.add(1);
        else if(s.charAt(i) == '[') pending.add(2);
        else if(s.charAt(i) == '{') pending.add(3);
        else if(pending.isEmpty()) break;
        else if(s.charAt(i) == ')' && pending.pop() != 1) break;
        else if(s.charAt(i) == ']' && pending.pop() != 2) break;
        else if( s.charAt(i) == '}' && pending.pop() != 3) break;
        

        result = true;
    }

    return result && pending.isEmpty();
    }
}
// @lc code=end


// Internet solution
// public boolean isValid(String s) {
// 	Stack<Character> stack = new Stack<Character>();
// 	for (char c : s.toCharArray()) {
// 		if (c == '(')
// 			stack.push(')');
// 		else if (c == '{')
// 			stack.push('}');
// 		else if (c == '[')
// 			stack.push(']');
// 		else if (stack.isEmpty() || stack.pop() != c)
// 			return false;
// 	}
// 	return stack.isEmpty();
// }


// boolean isValid(String s) {
//     if ((s.length() & 1) == 1) return false;
//     else {
//       Deque<Character> p = new ArrayDeque<>(s.length());
//       for (int i = 0; i < s.length(); i++)
//         switch (s.charAt(i)) {
//           case '(': p.push(')'); break;
//           case '{': p.push('}'); break;
//           case '[': p.push(']'); break;
//           case ')': case '}': case ']': if (p.isEmpty() || p.pop() != s.charAt(i)) return false;
//         }
//       return p.isEmpty();
//     }
//   }