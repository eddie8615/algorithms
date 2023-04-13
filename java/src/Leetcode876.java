import utils.ListNode;

public class Leetcode876 {
    public ListNode solution(ListNode head){
        ListNode oneStep = head;
        ListNode twoStep = head;

        while(twoStep != null && twoStep.next != null){
            oneStep = oneStep.next;
            twoStep = twoStep.next.next;
        }

        return oneStep;        
    }
}
