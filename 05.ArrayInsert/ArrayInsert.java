/*
 * javac ArrayInsert.java 
 * Java ArrayInsert
*/

public class ArrayInsert
{
        public static void main(String[]args)
        {
                int [] myArray = {108,27,9,54,3};
                
                myArray = insert(myArray,81,3);

                for (int i = 0 ; i < myArray.length ; i++)
                {
                        System.out.println(myArray[i]);
                }
        }

        public static int[] insert(int[]array, int number, int insertIndex)
        {
                int[]tempArray = new int[array.length + 1];
                for (int i = 0 ; i < array.length ; i++)
                {
                        if (i < insertIndex)
                        {
                                tempArray[i] = array[i];
                        }
                        else
                        {
                                tempArray[i+1] = array[i];
                        }
                }
     
        tempArray[insertIndex] = number;

        return tempArray;
        }
}
