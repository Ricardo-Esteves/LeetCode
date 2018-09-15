/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode result = new ListNode(0);
        ListNode i = l1 , j = l2, curr = result;
        int carry = 0;
        
        while (i != null || j != null){
            
            //If one list is bigger than other eliminate the error of one int + null
            int x = (i != null) ? i.val : 0;
            int y = (j != null) ? j.val : 0;
            
            //Sum Two numbersmwith carry
            int sum = carry + x + y;
        
            //Find Carry
            carry = sum / 10;
        
            //Find the real number on the List
            curr.next = new ListNode(sum % 10);
            
            //Point for the next open space in the list
            curr = curr.next;
            
            //Check if the Lits have next
            if (i != null) i = i.next;
            if (j != null) j = j.next;
        }
        
        //Last Case
        if (carry > 0){
            
            curr.next = new ListNode(carry);
        }
        
        return result.next;
    }
}