/*
 * javac ReverseArray.java 
 * Java ReverseArray
*/

public class ReverseArray 
{
        public static void main(String[]args)
        {
                int [] myArray = {108,27,9,54,3};
                
                reverse(myArray);

                for (int i = 0; i < myArray.length; i++)
                {
                        System.out.println(myArray[i]);
                }
        }

        public static void reverse(int[]arrays)
        {
                int length = arrays.length;
                int middle = length / 2;
                for (int i = 1; i < middle; i++)
                {
                        int temp = arrays[i];
                        arrays[i] = arrays[length-i-1];
                        arrays[length-i-1] = temp;
                }
        }
}
