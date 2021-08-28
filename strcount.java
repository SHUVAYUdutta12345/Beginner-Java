import java.util.Scanner;

public class strcount
{
    public static void main(String args[])
    {
      
  Scanner sc=new Scanner(System.in);
  String a=sc.nextLine();
  String rs="";
  int len=a.length();
 for(int i=0;i<=len;i++)
{
char ch=a.charAt(i);
rs=ch+rs;
System.out.println(rs);
}
}
}