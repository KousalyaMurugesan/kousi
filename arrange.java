import java.util.*;
public class arrange
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String s2[]=s1.split(" ");
String s3="";
int count=0,i=0;
int l=s.nextInt();
System.out.println("['");
while(i<s2.length)
 {
   count+=s2[i].length();
   while(count<=l)
   {
     if(s2[i].charAt(s2[i].length()-1)!='.')
     {
       s3+=s2[i]+" ";
	count+=s2[i+1].length()+1;
	i++;
     }
	else
	{
	   s3+=s2[i]+" ";
	   i++;
	   break;
	}
   }
System.out.println(s3+" ");
count=0;
s3="";
 }
System.out.print("']");
}
}