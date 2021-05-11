/*
 * javac BinarySearch.java 
 * Java BinarySearch
*/

public class BinarySearch 
{
        public static void main(String[]args)
        {
                int [] myArray = {3,9,27,54,108};
                
                int searchValue = 54;
                int position = binarySearch(myArray, searchValue);
                System.out.println(searchValue + " position is: " + position);

                System.out.println("===============");

                searchValue = 9;
                position = binarySearch(myArray, searchValue);
                System.out.println(searchValue + " position is: " + position);
        }

        public static int binarySearch(int[]arrays, int searchValue)
        {
                int low = 0;
                int high = arrays.length-1;
                int mid = 0;
                
                while(low <= high)
                {
                        mid = (low + high)/2;
                        if (arrays[mid] == searchValue)
                        {
                                return mid;
                        }
                        else if (arrays[mid] < searchValue)
                        {
                                low = mid+1;
                        }
                        else if (arrays[mid] > searchValue)
                        {
                                high = mid-1;
                        }
                }
                return -1;
        }
}

