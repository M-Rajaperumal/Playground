import java.util. Scanner;
class Main
{
  public static void main(String args[])
  {
    int n;
    Scanner in=new Scanner(System.in);
    n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<=n-1;i++)
    {
     arr[i]=in.nextInt();
    }
    set(n,arr);
  }
  public static void set(int n,int list[])
  {
    for(int i=0;i<=n-2;i++)
    {
      for(int j=i+1;j<=n-1;j++)
      {
       for(int k=j+1;k<=n-1;k++)
       {
       System.out.print("("+list[i]+", "+list[j]+", "+list[k]+") ");
       }
      }
      System.out.println();
    }
  }
}