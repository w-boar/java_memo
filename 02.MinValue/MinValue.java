/*
 * javac MinValue.java 
 * Java MinValue
*/

public class MinValue
{
        public static void main(String[]args)
        {
                int [] myArray = {108,27,9,54,3};

                int minValue = min(myArray);

                System.out.println("MinValue = " + minValue);
        }

        public static int min(int[]arrays)
        {
                int minIndex = 0;
                for (int i = 0; i < arrays.length; i++)
                {
                    if (arrays[minIndex] > arrays[i])
                    {
                            minIndex = i;
                    }
                }
                return arrays[minIndex];
        }
}
