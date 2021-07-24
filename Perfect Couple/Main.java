import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      int n;
      Scanner in=new Scanner(System.in);
      n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
        arr[i]=in.nextInt();
      }
      int value=in.nextInt();
      set(n,arr,value);
    }
  public static void set(int a,int list[],int val)
  {
   for(int i=0;i<=a-1;i++)
   {
    for(int j=i+1;j<=a-1;j++)
    {
      if((list[i]+list[j])==val)
      {
       System.out.println(list[i]+", "+list[j]);
      }
    }
   }
  }
}