//Program to input two integers (between 1 and 12 & 0 and 59), and then to display the time they represent, in words.
import java.io.*; //importing java.io package
class Time_in_Words //start of class
{
   public static void main(String args[])throws IOException //start of main method
   {
      int hour = 0, mins = 0, ones = 0, tens = 0, temp = 0;
      //initializing variables
      String A[] = {"ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN", "ELEVEN","TWELVE", "ONE"};
      String B[] = {"ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINTEEN"};
      String C[] = {"TEN","TWENTY","THIRTY","FOURTY","FIFTY"};
      String D[] = {"O'CLOCK","MINUTES TO","MINUTES PAST","QUARTER TO","QUARTER PAST"};
      //intializing required 1D Arrrays
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter a number between 1 to 12(inclusive)");
      hour = Integer.parseInt(br.readLine());
      System.out.println("Enter a number between 0 to 59(inclusive)");
      mins = Integer.parseInt(br.readLine());
      //taking input from user
      if(hour >= 1 && hour <= 12 && mins >= 0 && mins <= 59) //condition required to be met 
      {
         //preparing outputs for various time conditions
         if(mins <= 9)
         {
            System.out.println(hour + " : 0" + mins);
         }
         else
         {
            System.out.println(hour + " : " + mins);
         } //end of if-else statement
         if(mins <= 30)
          {
            if(mins == 15)
             {
              System.out.println(D[4] + " " + A[hour-1]);
             }
            else if(mins%10 == 0) 
              {
                System.out.println(C[(mins/10)-1] + " " + D[2] + " " + A[hour-1]);
             }
            else if(mins >= 11 && mins <= 19)
             {
                System.out.println(B[mins-11] + " " + D[2] + " " + A[hour-1]);
             }
            else if(mins <= 9)
            {
               System.out.println(A[mins-1] + " " + D[2] + "" + A[hour-1]); 
            }
            else if(mins == 0)
            {
               System.out.println(A[hour-1] + " " + D[0]); 
            }
            else
            {
               ones = mins % 10;
               tens = mins / 10;
               System.out.println(C[tens-1] + " " + A[ones-1] + " " + D[2] + " " + A[hour-1]);
            }//end of if-else statement 
            }
          else 
         {
            temp = 60 - mins;
            if(temp == 15)
            {
               System.out.println(D[3] + " " + A[hour]); 
            }
            else if((temp%10) == 0)
            {
               System.out.println(C[(temp/10)-1] + " " + D[1] + " " + A[hour]) ;
            }
            else if(temp >= 11 && temp <= 19)
            {
                System.out.println(B[temp-11] + " " + D[1] + " " + A[hour]) ;
            }
            else if(temp <= 9)
            {
               System.out.println(A[temp-1] + " " + D[1] + " " + A[hour]); 
            }
            else 
            {
               ones = temp % 10;
               tens = temp / 10;
               System.out.println(C[tens-1] + " " + A[ones-1] + " " + D[1] + " " + A[hour]);
            }//end of if-else statement
         }//end of if-else statement
      }
      else
      {
         System.out.println("INVALID INPUT");
       }//end of if-else statement
      System.out.println("");  
    }//end of main method
}//end of class
/**VDT
 VARIABLE   DATATYPE          DESCRIPTION
   hour       int       to take input from user      
   mins       int       to take input from user   
   ones       int      to store ones place value   
   tens       int      to store tens place value 
   temp       int          temporary variable
  A[][]     String      to store a set of words      
  B[][]     String      to store a set of words     
  C[][]     String      to store a set of words     
  D[][]     String      to store a set of words  
    i         int    control variable to run loop         */
