import java.util.*;
class Main
{
  public static void main(String args[])
  {
     Scanner in=new Scanner(System.in);
     String s1=in.nextLine();
    int a=s1.length();
     String s2=in.nextLine();
    int b=s2.length();
    int arr[]=new int[26];
    for(int i=0;i<26;i++)
    {
       arr[i]=0;
    }
    for(int i=0;i<a;i++)
    {
      char ch=s1.charAt(i);
      int offset=ch-'a';
      arr[offset]++;
    }
     for(int j=0;j<b;j++)
    {
      char ch=s2.charAt(j);
      int offset=ch-'a';
      arr[offset]--;
    }
    int count=0;
    for(int i=0;i<26;i++)
    {
      if(arr[i]==0)
      {
         count++;
      }
    }
    if(count==26)
    {
      System.out.println("Anagram");
    }
    else
    {
      System.out.println("Not anagrams");
    }
  }
}