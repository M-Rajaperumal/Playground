import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int f=1;
    System.out.print(fact(n));
  }
  public static int fact(int a)
  {
  if(a==0||a==1)
  {
    return 1;
  }
    else 
    {
      return (a*fact(a-1));
    }
}
}