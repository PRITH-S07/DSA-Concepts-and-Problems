class Node: # class creation for node initialization
    def __init__(self,data=None,next=None): # represents an individual element in a linked list
        self.data=data # "data" can contain integers, numbers or complex objects
        self.next=next # "next" is the pointer to the next element
class LinkedList:
    def __init__(self):
        self.head=None # "head" variable points to the head of the linked list
    def insert_at_beginning(self,data): # takes data and inserts it @ the beginning of the linked list
        node=Node(data,None) # here, insert node at the beginning and the next value of that node will be the current head
        self.head=node # to set the current head as the node
    def print(self): # to print LL
        if self.head is None: # if LL is blank
            print("Empty LL")
            return
        itr=self.head # create this temporary variable and assign "head" to it
        llstr="" # create ll string
        while itr:
            llstr+=str(itr.data)+"-->" if itr.next is not None else str(itr.data)
            itr=itr.next
        print(llstr)
    def insert_at_end(self,data):
        if self.head is None: # if LL is blank
            self.head=Node(data,None) # head is the "Node" created using the data. We want "next" after this to be empty as we want to insert at the end.
            return
        itr=self.head
        while itr.next:
            itr=itr.next
        itr.next=Node(data,None)
    def insert_values(self,data_list): # takes a list of values as an input and creates a new fresh linked list
        self.head=None
        for data in data_list:
            self.insert_at_end(data)
    def get_length(self): # to return length of the linked list
        itr=self.head
        count=0
        while itr:
            count+=1
            itr=itr.next
        return count
    def remove_at(self, index): # to remove element at a certain index
        if index<0 or index>self.get_length():
            raise Exception("Invalid input")
        if index==0:
            self.head=self.head.next
            return
        count=0
        itr=self.head
        while itr:
            if count==index-1:
                itr.next=itr.next.next
                break
            count+=1
            itr=itr.next
    def insert_at(self, index, data): # to insert at a specified index
        if index<0 or index>self.get_length():
            raise Exception("Invalid input")
        if index==0:
            self.insert_at_beginning(data)
            return
        itr=self.head
        count=0
        while itr:
            if count==index-1: # we want to modify the next pointer of the previous ele. that's why we stop at the prev. ele.
                node=Node(data,itr.next)
                itr.next=node
                break
            count+=1
            itr=itr.next
            
if __name__ == '__main__':
    ll = LinkedList()
    ll.insert_values(["banana","mango","grapes","orange"])
    ll.print()
    ll.insert_at(1,"blueberry")
    ll.print()
    ll.remove_at(2)
    ll.print()
    ll.insert_values([45,7,12,567,99])
    ll.insert_at_end(67)
    ll.print()
    
    
"""Output is:
banana-->mango-->grapes-->orange
banana-->blueberry-->mango-->grapes-->orange
banana-->blueberry-->grapes-->orange
45-->7-->12-->567-->99-->67"""
