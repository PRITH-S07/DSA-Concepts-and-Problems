class Solution
{
 
    // arr: input array
    // n: size of array
    //Function to rearrange an array so that arr[i] becomes arr[arr[i]]
    //with O(1) extra space.
    static void arrange(long arr[], int n)
    {
        // your code here
        long temp[]=arr.clone();
        for(int i=0;i<n;i++)
        {
        int t=(int) temp[i];
        arr[i]=temp[t];
        }
    }
}// The use of arr.clone() is very important and extremely useful.
