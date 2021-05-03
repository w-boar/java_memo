/*
 * javac ArrayAppend.java 
 * Java ArrayAppend
*/

public class ArrayAppend
{
        public static void main(String[]args)
        {
                int [] myArray = {108,27,9,54,3};
                
                int [] tempArray = new int[myArray.length + 1];

                for (int i = 0 ; i < myArray.length ; i++)
                {
                tempArray[i] = myArray[i];
                }
        
                tempArray[myArray.length] = 81;
                myArray = tempArray;

                for (int i = 0 ; i < myArray.length ; i++)
                {
                System.out.println(myArray[i]);
                }
        }
}
