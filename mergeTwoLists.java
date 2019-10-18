/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //Need to create a dummyNode so that he can hang the stuff on
        ListNode dummynode = new ListNode(0);
        ListNode tail = dummynode;
        while (true){
            if (l1 == null){
                //If you put the return statement here it will show error saying that there is a line that it is unreachable
                tail.next = l2;
                break;
            }
            if (l2 == null){
                //Same for here thats why we need a break instead of a line
                tail.next = l1;
                break;
            }
            //l1 val 
            if (l1.val <= l2.val){
                tail.next = l1;
                l1 = l1.next;
            }
            else{
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        //Return function will be anything after the head thats why it should be .next
        return dummynode.next;
    }
}
