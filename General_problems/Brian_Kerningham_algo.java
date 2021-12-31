class Main
{
  public static int countbits(int n)
  {
    int res = 0;
    while(n>0)
    {
      n = (n&(n-1));
      res++;
    }
    return res;
  }
}
//Time complexity = Theta(set_bit_count)
