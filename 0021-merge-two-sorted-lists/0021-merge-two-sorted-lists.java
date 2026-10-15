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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a fake node to easily build the new list's structure
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        
        // Loop until one of the lists runs out of nodes
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;   // Link to list1 node
                list1 = list1.next;   // Move list1 pointer forward
            } else {
                tail.next = list2;   // Link to list2 node
                list2 = list2.next;   // Move list2 pointer forward
            }
            tail = tail.next;         // Always move our new list's tail forward
        }
        
        // Attach the leftover chunk of whichever list didn't empty out
        tail.next = (list1 != null) ? list1 : list2;
        
        // Return the actual head, skipping the dummy node
        return dummy.next;
    }
}
