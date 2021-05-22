import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in=new Scanner(System.in);
      String s1=in.nextLine();
      int a=s1.length();
      int arr[]=new int[26];
      for(int i=0;i<26;i++)
      {
        arr[i]=0;
      }
      for(int j=0;j<=a-1;j++)
      {
         if(s1.charAt(j)>='a'&&s1.charAt(j)<='z')
         {
        int offset=s1.charAt(j)-'a';
        arr[offset]++;
         }
         else if(s1.charAt(j)>='A'&&s1.charAt(j)<='Z')
         {
             int offset=s1.charAt(j)-'A';
             arr[offset]++;
             
         }
      }
      for(int q=0;q<26;q++)
      {
        if(arr[q]==0)
        {
          System.out.print((char)('a'+q)+" ");
        }
      }
    }
}