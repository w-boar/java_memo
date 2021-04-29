/*
 * javac PrintArray.java 
 * java PrintArray
*/

public class PrintArray
{
        public static void main(String[]args)
        {
                int [] myArray  = {108, 27, 9, 54};
                for(int i = 0; i < myArray.length; i++)
                {
                        if(i < myArray.length)
                        System.out.println(myArray[i]);
                }
        }
}
