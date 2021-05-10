/*
 * javac ArraySearch.java 
 * Java ArraySearch
*/

import java.util.Scanner;

public class ArraySearch 
{
        public static void main(String[]args)
        {
                int [] myArray = {108,27,9,54,3};
                
                System.out.println("Please enter the value you are looking for: ");
                Scanner in = new Scanner(System.in);
                int value = in.nextInt();

                boolean isSearch = false;    
                for (int i = 0; i < myArray.length; i++)
                {
                        if (myArray[i] == value)
                        {
                                isSearch = true;
                                System.out.println("Found value: " + value + " the index is: " + i);
                        }
                                
                }
                if (isSearch == false)
                        System.out.println("value not found");
        }
}
