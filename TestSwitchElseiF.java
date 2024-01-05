import java.io.*;
import java.util.*;
class TestSwitchElseiF
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
String month;
if(a==1){System.out.println("JAN");}
else if(a==2){System.out.println("FEB");}
else if(a==3){System.out.println("MAR");}
else if(a==4){System.out.println("APRIL");}
else if(a==5){System.out.println("MAY");}
else if(a==6){System.out.println("JUNE");}
else if(a==7){System.out.println("JULY");}
else if(a==8){System.out.println("AUGUST");}
else if(a==9){System.out.println("SEP");}
else if(a==10){System.out.println("OCT");}
else if(a==11){System.out.println("NOV");}
else if(a==12){System.out.println("DEC");}

else{System.out.println("invalid choice");}
}
}