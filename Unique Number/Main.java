import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
      Scanner in=new Scanner(System.in);
     int a=in.nextInt();
     int b=in.nextInt();
     int count=0;
     for(int i=a;i<=b;i++)
     {
       String s=Integer.toString(i);
       int ss=s.length();
       for(int j=0;j<ss;j++)
       {
         for(int k=0;k<ss;k++)
         {
             if(k!=j && s.charAt(j)!=s.charAt(k))
             {
                  count++;
             }
         }
       }
         
     }
     if(count==0)
     {
        System.out.println("No Unique Number");
     }
     else
     {
     System.out.println(count/2);
     }
   }
}