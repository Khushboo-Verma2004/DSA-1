class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode result = new ListNode(0);
        ListNode dummy = result;
        ListNode secondList = new ListNode(0);
        ListNode secondHead = secondList;
        while(head!=null){
            if(head.val<x){
                result.next = head;
                result = result.next;
            }
            else{
                secondList.next = head;
                secondList = secondList.next;
            }
            head = head.next;
        }
        result.next = secondHead.next;
        return dummy.next;
    }
}
