import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
	  Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.print(sum(n));
    }
  public static int sum(int a)
  {
    if(a!=0)
    {
    return a+sum(a-1);
    }
    else
      return a;
  }
}