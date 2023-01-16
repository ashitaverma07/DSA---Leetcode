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
    public ListNode deleteDuplicates(ListNode head) {
         ListNode fakeHead = head;
    while(fakeHead != null && fakeHead.next != null){
        if(fakeHead.val == fakeHead.next.val){
            fakeHead.next = fakeHead.next.next;
        } else{
            fakeHead = fakeHead.next;
        }
    }
    return head;
    }
}