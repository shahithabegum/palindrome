import java.util.*;
class palin
{
  public static void main(String arg[])
   {
     try
         {
            String s=" ";
	// int c=1;
	Scanner t=new Scanner(System.in);
	System.out.println("enter a string");
	s=t.next();
                  StringBuilder sb=new StringBuilder(s);
	sb.reverse();
	String d=sb.toString();
	if(s.equals(d))
	 {
	   System.out.println("palindorme");
	 }
	 else{
	     System.out.println("not");
	 }
	 }
	catch(Exception e)
	{
	  System.out.println(e);
	}
       }
}