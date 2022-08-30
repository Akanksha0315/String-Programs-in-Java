//Write a Program to convert all letters of a String entered by user to Lowercase
import java.io.*;
class Lowercase
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
      s = na.toLowerCase();
      System.out.println(s);
    }
}
   