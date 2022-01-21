/*
You are given N number of books. Every ith book has Ai number of pages and are arranged in sorted order.

You have to allocate contagious books to M number of students. There can be many ways or permutations to do so. In each permutation, one of the M students will be allocated the maximum number of pages. Out of all these permutations, the task is to find that particular permutation in which the maximum number of pages allocated to a student is minimum of those in all the other permutations and print this minimum value.

Each book will be allocated to exactly one student. Each student has to be allocated at least one book.

Note: Return -1 if a valid assignment is not possible, and allotment should be in contiguous order (see the explanation for better understanding).*/

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        int sum=0,mx=0;
        for(int i=0;i<N;i++){
            sum+=A[i];
            mx=Math.max(mx,A[i]);
        }
        int low=mx,high=sum,res=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(isFeasible(A,N,M,mid)){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;
    }
    public static boolean isFeasible(int arr[],int n, int k, int ans){
        int req=1,sum=0;
        for(int i=0;i<n;i++){
            if(sum+arr[i]>ans){
            req++;
            sum=arr[i];
            }
            else{
                sum+=arr[i];
            }
        }
        return (req<=k);
    }
}
