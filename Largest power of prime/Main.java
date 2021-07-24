import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     while(n-->0)
     {
       int a=in.nextInt();
       int b=in.nextInt();
       int x=0;
       while(a!=0)
       {
          a=a/b;
         x=x+a;
       }
       System.out.println(x);
     }
   }
}