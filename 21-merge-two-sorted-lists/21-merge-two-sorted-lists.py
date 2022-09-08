# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeTwoLists(self, list1, list2):
        """
        :type list1: Optional[ListNode]
        :type list2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        dummyhead=ListNode(0)
        curr=dummyhead
        while list1!=None and list2!=None:
            if list1.val<list2.val:
                newNode=ListNode(list1.val)
                curr.next=newNode
                curr=newNode
                list1=list1.next if list1 else None
            elif list2.val<list1.val:
                newNode=ListNode(list2.val)
                curr.next=newNode
                curr=newNode
                list2=list2.next if list2 else None
            else:
                newNode=ListNode(list1.val)
                curr.next=newNode
                curr=newNode
                list1=list1.next if list1 else None
                newNode=ListNode(list2.val)
                curr.next=newNode
                curr=newNode
                list2=list2.next if list2 else None
        if list1!=None:
            #newNode=ListNode(list1.val)
            newNode=list1
            #curr.next=newNode
            curr.next=newNode
            curr=newNode
            #list1=list1.next if list1 else None
        elif list2!=None:
            #newNode=ListNode(list2.val)
            newNode=list2
            curr.next=newNode
            curr=newNode
            #list2=list2.next if list2 else None
        return dummyhead.next