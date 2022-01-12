/*Question: Given an array arr[] of N distinct integers, check if this array is Sorted (non-increasing or non-decreasing) and Rotated counter-clockwise. Note that input array may be sorted in either increasing or decreasing order, then rotated.
A sorted array is not considered as sorted and rotated, i.e., there should be at least one rotation.

Approach:  

Take two variable say x and y, initialized as 0.
Now traverse array.
If we find previous element is smaller then current, we increase x by one.
Else If we find previous element is greater then current we increase y by one.
After traversal if any of x and y is not equals to 1, return false.
If any of x or y is 1, then compare last element with first element (0th element as current, and last element as previous.) i.e. if last element is greater increase y by one else increase x by one.
Again check for x and y if any one is equals to one return true. i.e. Array is sorted and rotated. Else return false.
Explanation: 

The idea is simple. If array is sorted and rotated , element are either increasing or decreasing, but with one exception. So we count how many times the element is greater then its previous element, and how many times the element is smaller then its previous element. 
The special case is when array is sorted but not rotated. for this check last element with first element specially.
Below is the implementation of the above approach:*/

class Solution{    
    
    // arr[]: input array
    // num: size of array
    // Function to check if array is sorted and rotated
    public static boolean checkRotatedAndSorted(int arr[], int num){
        
        // Your code here
        int x=0,y=0;
        for(int i=0;i<num-1;i++)
        {
            if(arr[i]<arr[i+1])
            x++;
            else
            y++;
        }
        if(x==1 || y==1)
        {
            if(arr[num-1]<arr[0])
            x++;
            else
            y++;
            if(x==1||y==1)
            return true;
        }
        return false;
    }
    
}
