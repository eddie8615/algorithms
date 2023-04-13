from ListNode import ListNode
from typing import Optional

class Leetcode142:
    def detectCycle(self, head:Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return None
        visited = set()

        while head is not None:
            if head in visited:
                return head
            else:
                visited.add(head)
                head = head.next
        return None