import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
     Scanner in=new Scanner(System.in);
     int a=in.nextInt();
     String s=Integer.toString(a);
     StringBuilder sb=new StringBuilder(s);
     sb.reverse();
     String sss=sb.toString();
     System.out.println(sss);
     
   }
}