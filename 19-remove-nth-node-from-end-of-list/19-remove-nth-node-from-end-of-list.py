# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        l=self.leng(head)
        pos=l-n
        ct=0
        dummyhead=ListNode(0)
        curr=dummyhead
        while head:
            if ct==pos:
                nnode=head.next
                curr.next=nnode
                curr=nnode
                break
            nnode=ListNode(head.val)
            curr.next=nnode
            curr=nnode
            head=head.next
            ct+=1
        return dummyhead.next
    def leng(self,llist):
        length=0
        while llist:
            llist=llist.next
            length+=1
        return length