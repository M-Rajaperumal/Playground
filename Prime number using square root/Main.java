import java.util.*;
class Main
{
  public static void main(String args[])
  {
     Scanner in=new Scanner(System.in);
     int a=in.nextInt();
    int count=0;
    for(int i=1;i<=a;i++)
    {
      if(a%i==0)
      {
         count++;
      }
    }
    if(count==2)
    {
       System.out.println("Given number is a prime number");
    }
    else
    {
       System.out.println("Given number is not a prime number");
    }
    
  }
}