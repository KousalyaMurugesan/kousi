import java.util.*;
class count
{
   public static void main(String []args)
   {
     Scanner s=new Scanner(System.in);
     int a[]=new int[5];
     int cnt;
     for(int i=0;i<a.length;i++)
     {
       a[i]=s.nextInt();
     }
     for(int i=0;i<a.length;i++)
     {
	cnt=0;
       for(int j=0;j<a.length;j++)
        {
	   if(i!=j)
	   {
             if(a[i]==a[j])
             {
		cnt++;
	     }
	   }
        }
	if(cnt==0)
	{
		System.out.println(a[i]);
	}
      }
 }
}