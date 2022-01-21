/*Given an array arr[] of N positive integers, where elements are consecutive (sorted). Also, there is a single element which is repeating X (any variable) number of times. Now, the task is to find the element which is repeated and number of times it is repeated.
Note: If there's no repeating element, Return {-1,-1}.*/
class Solution
{
    //Function to find repeated element and its frequency.
    public static Point findRepeating(Integer arr[],int n)
    {
        //Your code here
        int ct=0,low=0,high=n-1;
        while(low<high)
        {
            int mid=(low+high)/2;
            if(mid+arr[0]<=arr[mid])
            low=mid+1;
            else
            high=mid;
        }
        if(low==n-1)
        return new Point(-1,-1);
        return new Point(arr[low],n-(arr[n-1]-arr[0]));
        //p.x,p.y
    }  
};
