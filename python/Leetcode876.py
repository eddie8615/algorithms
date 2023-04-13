from typing import Optional
from ListNode import ListNode

class Leetcode876:
    def solution1(self, head: Optional[ListNode]) -> Optional[ListNode]:
        one_step = head
        two_step = head
        while two_step != None and two_step.next != None:
            one_step = one_step.next
            two_step = two_step.next.next
        return one_step
    