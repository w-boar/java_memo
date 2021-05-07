/*
 * javac InsertSort.java 
 * Java InsertSort
*/

public class InsertSort 
{
        public static void main(String[]args)
        {
                int [] myArray = {108,27,9,54,3};
                
                sort(myArray);

                for (int i = 0; i < myArray.length; i++)
                {
                        System.out.println(myArray[i]);
                }
        }

        public static void sort(int[]arrays)
        {
                for (int i = 1; i < arrays.length; i++)
                {
                        int insertElement = arrays[i];
                        int insertPosition = i;
                        for (int j = insertPosition - 1; j >= 0; j--)
                        {
                               if(insertElement < arrays[j])
                               {
                                    arrays[j+1] = arrays[j];
                                    insertPosition--;
                               }
                               else
                               {
                                       break;
                               }
                        }
                        arrays[insertPosition] = insertElement;
                }
        }
}
