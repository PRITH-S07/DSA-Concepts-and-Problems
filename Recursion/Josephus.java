class Main
{
  public int jos(int n, int k)
  {
    if(n==1)
      return 0;
    else
      return (jos(n-1,k)+k)%n;
  }
  public int main()
  {
    System.out.println("Safe position is: "+jos(5,3));// However, if the circle starts it's numbering with 1 and not 0, simply replace 'jos(5,3)' with 'jos(5,3)+1'
  }
}

//Time complexity = Theta(N)
