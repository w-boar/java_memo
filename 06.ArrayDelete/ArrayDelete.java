/*
 * javac ArrayDelete.java 
 * Java ArrayDelete
*/

import java.util.Scanner;

public class ArrayDelete
{
        public static void main(String[]args)
        {
                int [] myArray = {108,27,9,54,3};
                
                System.out.println(" Please choose an index to be deleted:");
                Scanner in = new Scanner(System.in);
                int index = in.nextInt();


                int[]tempArray = new int[myArray.length -1];

                for (int i = 0 ; i < myArray.length ; i++)
                {
                        if (i < index)
                                tempArray[i] = myArray[i];
                        if (i > index)
                                tempArray[i - 1] = myArray[i];
                }

                myArray = tempArray;
                for (int i = 0; i < myArray.length; i++)
                {
                        System.out.println(myArray[i]);
                }
        }
}
