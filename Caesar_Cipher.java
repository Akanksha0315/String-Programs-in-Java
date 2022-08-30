/*Program to convert String entered by user to Caesar Cipher Encryption
 CAESAR CIPHER is an encryption technique which is implemented as ROT13 (‘rotate by 13 places’).
 It is a simple letter substitution cipher that replaces a letter with the letter 13 places after 
 it in the alphabets, with the other characters remaining unchanged. */
import java.io.*; //importing java.io package
class Caesar_Cipher //start of class
{
   public static void main(String args[])throws IOException //start of main method
   {
      String word = " ";
      String caesar = " ";
      int ascii = 0;
      int count = 0;
      //initializing variables
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter a sentence");
      word = br.readLine();
      //taking input from user
      word = word + " ";
      //giving a space after String entered so the number of words in string can be counted
      int l = word.length();
      //finding length of String
      for(int i = 0; i < l; i++)
      {
         ascii = (int)(word.charAt(i));
         if(word.charAt(i) == ' ')
         {
            count++ ; //counting the number of words in sentence
          }
         if(ascii >= 65 && ascii <= 77)//checking if character lies between 'A' and 'M'
         {
            caesar = caesar + (char)(ascii + 13);
          }
         else if(ascii >= 78 && ascii <= 90)//checking if character lies between 'N' and 'Z'  
         {
            caesar = caesar + (char)(ascii - 13); 
          }
         else if(ascii >= 97 && ascii <= 109)//checking if character lies between 'a' and 'm'
         {
            caesar = caesar + (char)(ascii + 13);
          } 
         else if(ascii >= 110 && ascii <= 122)//checking if character lies between 'n' and 'z'
         {
            caesar = caesar + (char)(ascii - 13); 
          }
         else //there are no changes to special characters and punctuation
         {
            caesar = caesar + word.charAt(i); 
            }//end of if-else statement
       }//end of for loop
      if(count >= 3 && count <= 100)//checking if the sentence lies betweem 3 to 100 words
      {
         System.out.println("The cipher text is");
         System.out.println(caesar);
         //displaying encrypted/ciphered text
         System.out.println(" ");
        }
      else //display message for invalid length of sentence
      {
         System.out.println("INVALID LENGTH");
         System.out.println(" ");
        }//end of if-else statement
   }//end of main method
}//end of class
/**VDT
 VARIABLE   DATATYPE          DESCRIPTION
   word     String      to take input from user      
  caesar    String      to store encrypted word     
  ascii      int     to store ASCII value of character     
  count      int    to find length of sentence entered 
    i        int      control variable to run loop    */


          

