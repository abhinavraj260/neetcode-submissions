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
    public boolean hasCycle(ListNode head) {
         if(head==null){
            return false;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){               //This is optimised solution with time complexity O(n) and space complexity as O(1)
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;

            }
            
        }
        return false;
        
    }
}
