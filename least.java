import java.util.*;
public class least
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String s1=s.next();
int k=s.nextInt();
StringBuffer s2=new StringBuffer();
char v[]=s1.toCharArray();
Arrays.sort(v);
for(int i=0;i<v.length-k;i++)
{
s2.append(v[i]);
}
System.out.println(s2.toString());
}
}