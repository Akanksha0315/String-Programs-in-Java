/* Program to take input for the number of sentences along with the text of the sentences from the 
user. To calculate the frequency of each word in ascending order of frequency. */
import java.io.*; //importing io package
class Paragraph //start of class
{
  public static void main(String args[])throws IOException //start of main method
  {
    int num = 0;
    int x = 0, z = 0, count = 0;
    int temp = 0;
    String t = " ";
    String na = " ";
    //initializing variables
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.println("Enter the number of sentences");
    num = Integer.parseInt(br.readLine());
    //taking input from user
    if(num >= 4) //condition for invalid input
    {
      System.out.println("INVALID VALUE");
    }
    else
    {
      System.out.println("Enter the sentence(s)");
      na = br.readLine(); //taking input from user
      na = na + " ";
      na = na.toUpperCase(); //converting to uppercase 
      int l = na.length(); //calculating length of String
      for(int i = 0; i < l; i++)
      {
        if(na.charAt(i) == ' ') //checking for spaces
        {
          count++; 
        }//end if if statement
      }//end of for loop
      System.out.println("Total number of words in paragraph = " + count);
      System.out.println("");
      String A[] = new String[count];
      int C[] = new int[count];
      for(int i = 0; i < l; i++)
      {
        if(na.charAt(i) == ' ') //condition for end of word in paragraph 
        {
          if(na.charAt(i-1) == '.' || na.charAt(i-1) == ',' || na.charAt(i-1) == '!' || na.charAt(i-1) == '?')
          {
            A[z] = na.substring(x,i-1);
          }
          else
          {
            A[z] = na.substring(x,i);
          }//end of if-else statement
          x = i + 1;
          z++;
        }//end of if statement
      }//end of for loop
      for(int i = 0; i < z; i++)
      {
        for(int j = 0; j < z; j++)
        {
          if(A[i].equals(A[j])) //checking for same words to calculate frequency 
          {
            C[i] = C[i] + 1; 
          }//end of if statement
        }//end of for loop
      }//end of for loop
      for(int i = 0; i < z; i++)
      {
        for(int j = 0; j < z-1; j++)
        {
          if(C[j] > C[j+1]) //bubble sort for ascending order
          {
            temp = C[j];
            C[j] = C[j+1];
            C[j+1] = temp;
            t = A[j];
            A[j] = A[j+1];
            A[j+1] = t;
          }//end of if statement
        }//end of for loop
      }//end of for loop
      System.out.println("The frequency of each word in the Paragraph is as follows: ");
      System.out.println("");
      for(int i = 0; i < z; i++)
      {
        System.out.println(A[i] +" " + C[i]);
        //displaying frequencies 
      }//end of for loop
    }//end of if-else statement
  }//end of main() method
}//end of class
/**VDT
Variable  Datatype           Description
 num        int        to take input from user
  x         int          temporary variable
  z         int          temporary variable
count       int       to store number of words
 temp       int      temporary variable for swap
  t        String    temporary variable for swap
 na        String      to take input from user
  l         int        to find length of String
 A[]        int    to store each word in paragraph 
 C[]        int    to store frequency of each word
  i         int     control variable to run loop
  j         int     control variable to run loop   */


