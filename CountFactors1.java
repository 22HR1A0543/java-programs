import java.util.*;
public class CountFactors1
 {
      public static void main(String [] args)
 {
	Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
	int count=0;
        for(int i = 1; i <= num; i++)
        {
           if(num % i == 0)
	   {
		count++;
		
                System.out.print(i); 
if(i!=num)
System.out.print(",");
     	  }

      }
	System.out.println("count of factors "+num+"is "+count);
if(count==2){System.out.println("prime");
}
else
{System.out.println("not prime");
}
 }
}