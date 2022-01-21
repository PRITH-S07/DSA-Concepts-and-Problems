/*Given two sorted arrays of sizes N and M respectively. The task is to find the median of the two arrays when they get merged.
If there are even number of elements in the resulting array, find the floor of the average of two medians.*/

class Solution
{
    //Function to find the median of the two arrays when they get merged.
    public static int findMedian(int arr[], int n, int brr[], int m)
    {
        //Your code here
        int mix[]=new int[m+n];
       int k=0;
       int i=0;
       int j=0;
       while(i<n && j<m){
           if(arr[i]>brr[j]){
               mix[k]=brr[j];
               j++;
           }
           else if(arr[i]<brr[j]){
               mix[k]=arr[i];
               i++;
           }
           else if(arr[i]==brr[j]){
               mix[k]=arr[i];
               mix[k+1]=brr[j];
               i++;
               j++;
               k++;
           }
           k++;
       }
       while(i<n){
           mix[k]=arr[i];
           i++;
           k++;
       }
       while(j<m){
           mix[k]=brr[j];
           k++;
           j++;
       }
   //    System.out.println(Arrays.toString(mix));
       if(mix.length%2==1){
           return mix[mix.length/2];
       }
       return (mix[mix.length/2]+mix[mix.length/2-1])/2;
    }
