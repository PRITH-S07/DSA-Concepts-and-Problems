/*Given the total number of persons n and a number k which indicates that k-1 persons are skipped and kth person is killed in circle in a fixed direction.

The task is to choose the safe place in the circle so that when you perform these operations starting from 1st place in the circle, you are the last one remaining and survive.*/

class Solution
{
   public int josephus(int n, int k)
    {
        //Your code here
        return jos(n,k)+1;
    }
    public int jos(int n, int k)
    {
        if(n==1)
        return 0;
        else
        return (jos(n-1,k)+k)%n;
    }

}
