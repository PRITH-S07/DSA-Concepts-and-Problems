# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeKLists(self, lists):
        """
        :type lists: List[ListNode]
        :rtype: ListNode
        """
        z=[]
        for i in lists:
            itr=i
            while itr:
                z.append(itr.val)
                itr=itr.next
        z.sort()
        dummyhead=ListNode(0)
        curr=dummyhead
        for i in z:
            nnode=ListNode(i)
            curr.next=nnode
            curr=nnode
        return dummyhead.next