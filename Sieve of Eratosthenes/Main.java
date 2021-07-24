import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
   int a=in.nextInt();
   for(int i=1;i<=a;i++)
   {
      raja(i);
   }
  }
  public static void raja(int a)
  {
    int count=0;
     for(int i=1;i<=a;i++)
     {
        if(a%i==0)
        {
            count++;
        }
     }
    if (count==2)
    {
        System.out.print(a+" ");
    }
  }
  
}

