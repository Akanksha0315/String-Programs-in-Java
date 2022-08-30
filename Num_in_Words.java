//Program to display the number entered by user in words
import java.io.*; //importing java.io package
class Num_in_Words //start of class
{
   public static void main (String args[])throws IOException //start of main method
   {
      int num = 0, count = 0, ones = 0, tens = 0;
      //initializing variables
      String A[] = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SVEVEN", "EIGHT", "NINE"};
      String B[] = {"TEN", "TWENTY", "THIRTY", "FOURTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINTY"};
      String C[] = {"ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINTEEN"};
      //initializing required 1D Arrays
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter a number between 0 to 99");
      num = Integer.parseInt(br.readLine());
      //taking input from user
      for(int i = num; i > 0; i = i/10) //counting number of digits
      {
         count++;
       } //end of for loop
      if(num <= 9) //for numbers 0 to 9
      {
         System.out.println(A[num]);
      }
      else if(count == 2) //for numbers 10 to 99
      {
         if((num % 10) == 0) //for two digit numbers that end with 0
         {
            System.out.println(B[(num/10)-1]);
         }
         else if(num >= 11 && num <= 19) //for numbers 11 to 19 
         {
            System.out.println(C[num-11]);
         }
         else //for other two digit numbers
         {
            ones = num % 10;
            tens = num / 10;
            System.out.println(B[tens-1] + " " + A[ones]);
         }//end of if-else statement
        }
      else 
      {
          System.out.println("Number is not in range"); 
          //displaying possible output
      }//end of if-else statement 
   }//end of main method
}//end of class
/**VDT
 VARIABLE   DATATYPE          DESCRIPTION
   num        int       to take input from user      
  count       int      to count number of digits    
   ones       int      to store ones place value   
   tens       int      to store tens place value  
  A[][]     String      to store a set of words      
  B[][]     String      to store a set of words     
  C[][]     String      to store a set of words     
    i         int     control variable to run loop     */