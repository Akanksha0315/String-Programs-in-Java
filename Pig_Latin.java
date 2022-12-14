/*
 Program to accept a word from user and to convert it into pig latin
 
 A Pig Latin is an encrypted word in English, which is generated by doing following alterations:
 
 The first vowel occurring in the input word is placed at the start of the new word along with the 
 remaining alphabets of it. The alphabets present before the first vowel are shifted at the end of the 
 new word followed by “ay”.
 */
import java.io.*; //importing java.io.*;
class Pig_Latin //start of class
{
   public static void main(String args[])throws IOException //start of main method
   {
      int pos = 0;
      char ch;
      String word;
      String a, b, c;
      //initializing variables
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter a word");
      word = br.readLine();
      //taking input from user
      word = word.toUpperCase(); //converting to Uppercase
      int l = word.length(); //finding length of String entered by user
      for(int i = 0; i < l; i++)
      {
         ch = word.charAt(i);
         if(ch =='A'|| ch =='E'|| ch =='I'|| ch =='O'|| ch =='U')//searching for vowel if any
         {
            pos = i; 
            break;
         }//end of if statement
      }//end of for loop
      a = word.substring(0,pos);
      b = word.substring(pos,l);
      c = b + a + "AY";
      //converting String entered by user to pig latin
      System.out.println(" ");
      System.out.println(c);
    }//end of main method
}//end of class
/**VDT
 VARIABLE   DATATYPE                  DESCRIPTION
 
  pos         int            to store position of character 
   ch         char           to store character of a String 
  word       String             to take input from user
   a         String     to store portion of String entered by user
   b         String     to store portion of String entered by user 
   c         String           to store the converted word
   i          int             control variable to run loop 

 */
