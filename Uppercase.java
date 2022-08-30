//Write a Program to convert the first letter of each word to Uppercase
import java.io.*;
class Uppercase
{
   public static void main(String args[])throws IOException
   {
      String na;
      String s;
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter a sentence");
      na = br.readLine();
      int l = na.length();
      s = na.toUpperCase();
      System.out.println(s);
    }
}
   