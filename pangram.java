import java.util.*;
public class pangram
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
boolean b=false;
for(char c='a',C='A';c<='z'&&C<='Z';c++,C++)
{
  for(int i=0;i<s1.length();i++)
  {
    if(s1.charAt(i)==c||s1.charAt(i)==C)
    {
      b=true;
      break;
    }b=false;
 }
 if(!b)
 {
 break;
 }
}
if(b==true)
{
System.out.println("complete String");
}
else
{
System.out.println("not complete String");
}
}
}