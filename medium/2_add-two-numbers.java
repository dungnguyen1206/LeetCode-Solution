/**
 * Problem: Add Two Numbers
 * Link: https://leetcode.com/problems/add-two-numbers/
 * Difficulty: Medium
 *
 * Approach:
 * - Traverse both linked lists simultaneously
 * - Add corresponding digits along with carry
 * - Use a result node to build the result list
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
            ListNode result = new ListNode(0);
            int carry=0;
            ListNode head = result;
            while (l1!=null || l2!=null){
                int x = l1!=null ? l1.val:0;
                int y =l2!=null ? l2.val:0;
                int digit = x +y + carry;
                carry = digit/10;
                int value = digit%10;
                head.next = new ListNode(value);
                head = head.next;
               if(l1!=null) l1 = l1.next;
               if(l2!=null) l2=l2.next;
            }
            if(carry > 0){
                head.next = new ListNode(carry);
                head = head.next;
            }
                return result.next;
    }
}
