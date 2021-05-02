/*
 * javac SelectSort.java 
 * Java SelectSort
*/

public class SelectSort
{
        public static void main(String[]args)
        {
                int [] myArray = {108,27,9,54,3};

                sort(myArray);
                for (int i = 0 ; i < myArray.length ; i++)
                {
                System.out.println(myArray[i]);
                }
        }

        public static void sort(int[]arrays)
        {
                for (int i = 0; i < arrays.length; i++)
                {
                    int minIndex = i;
                    for (int j = i + 1;j < arrays.length; j++)
                    {
                    if (arrays[minIndex] > arrays[j])
                    {
                            minIndex = j;
                    }
                    
                }
                if (i != minIndex)
                {
                        int temp = arrays[i];
                        arrays[i] = arrays[minIndex];
                        arrays[minIndex] = temp;
                }
                }
        }
}
