/*
 * javac ShellSort.java 
 * Java ShellSort
*/

public class ShellSort 
{
        public static void main(String[]args)
        {
                int [] myArray = {81,3,9,0,27,54,108};
                
                shellSort(myArray);

                for (int i = 0; i < myArray.length; i++)
                {
                        System.out.println(myArray[i]);
                }
        }

        public static void shellSort(int[]arrays)
        {
                for (int gap = arrays.length/2; gap > 0; gap = gap/2)
                {
                        for (int i = gap; i < arrays.length; i++)
                        {
                                int j = i;
                                while(j-gap >= 0 && arrays[j] < arrays[j-gap])
                                {
                                        swap(arrays, j, j-gap);
                                        j = j-gap;
                                }
                        }
                }
        }

        public static void swap(int[]arrays, int a, int b)
        {
                arrays[a] = arrays[a] + arrays[b];
                arrays[b] = arrays[a] - arrays[b];
                arrays[a] = arrays[a] - arrays[b];
        }
}



