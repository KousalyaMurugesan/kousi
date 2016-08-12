import java.util.*;
import java.io.*;
class prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int i;
for(i=2;i<=a-1;i++)
{
if(a%i==0)
{
System.out.print("Not a prime number");
break;
}
}
if(a==i)
{
System.out.print("prime number");
}
}
}
