import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=in.nextInt();
    }
    int first=0;
    int last=n-1;
    int f=0;
    while(f==0)
    {
       if(first>last)
       {
         break;
       }
      else if(arr[first]==0)
      {
        first++;
      }
      else if(arr[last]==1)
      {
          last--;
      }
      else
      {
         arr[first]=0;
        arr[last]=1;
        first++;
        last--;
      }
    }
    for(int i=0;i<n;i++)
    {
       System.out.print(arr[i]);
    }
  }
}