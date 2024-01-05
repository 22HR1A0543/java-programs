import java.io.*;
class BufferedReaderExample1
{
public static void main(String[]args)throws Exception
{
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
System.out.println("enterr ur name");
String name=br.readLine();
System.out.println("welcome"+name);
}
}