/*Given an array A[] of N positive integers. The task is to find the maximum of j - i subjected to the constraint of A[i] < A[j] and i < j.
Example 2:

Input:
N = 9
A[] = {34, 8, 10, 3, 2, 80, 30, 33, 1}
Output:
6
Explanation:
In the given array A[1] < A[7]
satisfying the required 
condition(A[i] < A[j]) thus giving 
the maximum difference of j - i 
which is 6(7-1).*/

//CODE:
class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int A[], int N) { 
        
        // Your code here
        int lmin[]=new int[N];
        int rmax[]=new int[N];
        lmin[0]=A[0];
        for(int i=1;i<N;i++)
        lmin[i]=Math.min(A[i],lmin[i-1]);
        rmax[N-1]=A[N-1];
        for(int i=N-2;i>=0;i--)
        rmax[i]=Math.max(A[i],rmax[i+1]);
        int i=0,j=0,maxdiff=0;
        while((i<N)&&(j<N))
        {
            if(lmin[i]<=rmax[j])
            {
                maxdiff=Math.max(maxdiff,j-i);
                j++;
            }
            else
            i++;
        }
        return maxdiff;
    }
}


