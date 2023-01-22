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
    // 1 -> 2 -> 3
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }else{
//             i want to iterate till i find the last element
            ListNode newHead = reverseList(head.next);
            head.next.next = head;
            head.next = null;
//             after the first iteration newHead it will return 3 and set the case ;
//             after second iteration new head will return 2 and set the case ;
            
            
            return newHead;
            
        }
        
    }
}