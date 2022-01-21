/*Given an integer array representing the heights of N buildings, the task is to delete N-2 buildings such that the water that can be trapped between the remaining two building is maximum.
Note: The total water trapped between two buildings is gap between them (number of buildings removed) multiplied by height of the smaller building.*/

class Solution
{
    //Function to return the maximum water that can be stored.
    static int maxWater(int height[], int n) 
    { 
        int l=0,h=n-1,val=0;
        while(l<=h)
        {
            if(height[l]<height[h])
            {
            val=Math.max(val,height[l]*(h-l-1));
            l++;
            }
            else if(height[l]>height[h])
            {
            val=Math.max(val,height[h]*(h-l-1));
            h--;
            }
            else
            {
            val=Math.max(val,height[h]*(h-l-1));
            h--;
            l++;
            }
        }
        return val;
    } 
