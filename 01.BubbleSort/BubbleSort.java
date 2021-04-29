/*
 * javac BubbleSort.java 
 * Java BubbleSort
*/

public class BubbleSort
{
        public static void main(String[]args)
        {
                int [] myArray = {108,27,9,54,3};
                sort(myArray);

                for(int i = 0; i < myArray.length; i++)
                {
                        System.out.println(myArray[i]);
                }
        }

        public static void sort(int[]arrays)
        {
                for (int i = 0; i < arrays.length-1; i++)
                {
                        boolean isSwap = false;
                        for (int j = 0; j < arrays.length -i -1; j++)
                        {
                                if (arrays[j] > arrays[j+1])
                                {
                                        int temp = arrays[j];
                                        arrays[j] = arrays[j+1];
                                        arrays[j+1] = temp;
                                        isSwap = true;
                                }
                        }
                        if(!isSwap)
                        {
                                break;
                        }
                }
        }
}
                    

