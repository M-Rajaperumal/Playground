import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
      Scanner in=new Scanner(System.in);
     int a=in.nextInt();
     int b=in.nextInt();
     int t=0;
     if(a>b)
     {
     t=a;
     }
     else
     {
       t=b;
     }
     int arr[]=new int[b];
     int count=0;
     int y=0;
     for(int i=a;i<=b;i++)
     {
         arr[y]=raja(i);
       y++;
     }
     for(int i=0;i<t;i++)
     {
        for(int j=0;j<t;j++)
        {
          if(arr[i]-arr[j]==6)
          {
            count++;
          }
        }
     }
     if(count==0)
     {
        System.out.println("No Prime Pairs");
     }
     else
     {
     System.out.println(count);
     }
   }
  public static int raja(int a)
  {
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
       return a;
    }
    else
    {
        return 0;
    }
  }
}