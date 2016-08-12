import java.util.*;
import java.io.*;
class prime
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int x=s.nextInt();
int i;
for(i=2;i<=x-1;i++)
{
if(x%i==0)
{
System.out.print("Not a prime number");
break;
}
}
if(x==i)
{
System.out.print("prime number");
}
}
}
