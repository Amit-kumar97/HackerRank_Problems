import java.util.Arrays;
import java.util.Scanner;

//------hackerRank Problem
/*
Program to find Smallest and Largest elements from One Dimensional Array Elements.
To find Smallest element from the Array - We will assume that first element is smallest and assign it in a variable and
then compare each element from array with the variable, if any of the element is smaller than variable assign that
element into variable, finally we will get smallest elements.
To find Largest element from the Array - We will assume that first element is largest and assign it in a variable and
then compare each element from array with the variable, if any of the element is larger than variable assign that
element into variable, finally we will get largest elements.

Input Format:
Take an integer n as the size of array.
Take n elements of array from the user.

Output Format:
First line should print the smallest element of the array.
Second line should print the largest element of the array.

Sample Input:
5
2 65 98 75 21

Sample Output:
2
98
 */
public class TraversArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n = sc.nextInt();
        System.out.println("Enter the element of Array:");
        int[] ar = new int[n];
        for (int i=0; i<ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
        //-------------Sorting Array to Easily find the smallest and largest Element
        Arrays.sort(ar);
        System.out.println("Smallest Number of Array:"+ar[0]);                    //----------Smallest is ar[0] value
        System.out.println("Largest Number of Array:"+ar[n-1]);                   //----------largest is ar[n-1] value
    }
}
