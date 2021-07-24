import java.util.*;
class Main
{
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in); 
    int n=in.nextInt();
    int count=0;
    for(int i=1;i<=n;i++)
    {
       for(int j=1;j<=i;j++)
       {
          if(i%j==0)
          {
            count++;
          }
       }
      //System.out.println(count);
      if(count==2)
      {
         System.out.print(i+" ");
      }
      count=0;
    }
  }

   
  }
