
/*
 * Menu Driven program to
 * 1)Display all anagrams of the inputted word
 * 2)Check whether a word is the anagram of another
 * 
 * Anagrams words formed by rearranging the letters of another, 
 * such as spar, formed from rasp.
 */

import java.io.*; //importing io package
public class Anagrams //start of class
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int c = 0; //declaring variables

    void checkAnagrams()throws IOException 
    {
        System.out.println("Enter two words: ");
        String s1= br.readLine(); //taking input
        String s2= br.readLine();

        int found=0, notfound=0; //declaring flag variables
        //checking if the words are anagrams
        if(s1.length()==s2.length()) //comparing word lengths
        {

            for(int i=0; i<s1.length(); i++)
            {
                found=0;
                //checking if the s2 has all the letters of s1
                for(int j=0; j<s2.length(); j++)
                {
                    if(s1.charAt(i) == s2.charAt(j))
                    {
                        found=1;
                        break;
                    }
                }
                //breaking from the loop if a letter of s1 is absent from the s2
                if(found==0)
                {
                    notfound=1;
                    break;
                }
            }
            //printing the result
            if(notfound==1)
            {
                System.out.println("Strings are not Anagrams.");
            }
            else
            {
                System.out.println("Strings are Anagrams.");
            }
        }
        else //anagrams must be of equal length
        {
            System.out.println("Strings are not Anagrams.");
        }
    }

    void createAnagrams()throws IOException
    {
        System.out.println("Enter a word: ");
        String s= br.readLine(); //taking input
        System.out.println("The Anagrams are: ");
        displayAnagrams("",s); //calling the create method to print the anagrams
        //printing the no. of anagrams that the word has
        System.out.println("This word has "+c+" Anagrams.");
    }

    void displayAnagrams(String s1, String s2)
    {
        if(s2.length()<=1) //printing and maintaining counter for all anagrams
        {
            c++; //increases value of 'c' for every anagram
            System.out.println(s1+s2); //
        }
        else
        {
            for(int i=0;i<s2.length();i++)
            {
                String x= s2.substring(i,i+1); //storing different parts of the word in different Strings
                String y= s2.substring(0,i);
                String z= s2.substring(i+1);
                displayAnagrams(s1+x,y+z); //call the function itself, displayAnagrams() recursively
            }
        }
    }

    public static void main(String args[])throws Exception //start of main
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Anagrams obj=new Anagrams(); //creating class objects
        //displaying menu options
        System.out.println("To check if two words are anagrams, enter 1");
        System.out.println("To display all anagrams of a word, enter 2");
        //taking user input
        int choice= Integer.parseInt(br.readLine());
        switch(choice)
        {     
            case 1: //to check if two words are anagrams
            obj.checkAnagrams();
            break;

            case 2: //to display all anagrams of a word
            obj.createAnagrams();
            break;

            default:
            System.out.println("Incorrect value entered.");
            break;
        }
    }// end of main
}//end of class

/*
 *             Variable Description Table
 * 
 * S.No.    Variable Name        Data Type               Description
 *  1            c                  int            to store number of anagrams of a word
 *  2            s                String           to store user inputted word for anagram creation
 *  3            s1               String           one of two words entered to compare as anagrams
 *  4            s2               String           one of two words entered to compare anagrams
 *  5          found                int            flag variable
 *  6         notfound              int            flag variable
 *  7          choice               int            stores user's choice
 *  8            x                String           stores segments of the string to create anagrams
 *  9            y                String           stores segments of the string to create anagrams
 *  10           z                String           stores segments of the string to create anagrams
 *  11           i                 int             loop control variable
 *  12           j                 int             loop control variable
 */