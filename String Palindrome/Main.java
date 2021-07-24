import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        StringBuilder sb=new StringBuilder(s1);
        sb.reverse();
        String rev=sb.toString();
        if(s1.equals(rev)==true)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}