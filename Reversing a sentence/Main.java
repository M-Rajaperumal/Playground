import java.util.Scanner;
class Main {  
public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    
String[] split = s.split(" ");
String result = "";
for (int i = split.length - 1; i >= 0; i--) {
  result += (split[i] + " ");
}
System.out.println(result.trim());
}  
}  