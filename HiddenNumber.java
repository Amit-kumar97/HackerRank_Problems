import java.util.Scanner;

//------hackerRank Problem
/*
Given an array of n integers, The task is to find another integer x .such that, if all the elements of the array are 
subtracted individually from the number x, then the sum of all the differences should add to 0. If any such integer 
exists, print the value of x, else print -1.
The idea is to calculate the total sum of the array and divide it by the size of the array. If the sum of the array is 
perfectly divisible by its size then the quotient obtained from this division operation will be the required hidden 
number.
Input Format:
N is the size of array A[i] is value array
Output Format:
X as integer
Sample Input:
4
2 4 5 7
Sample Output:
-1
Sample Input:
3
1 2 3
Sample Output:
2
 */
public class HiddenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int size = sc.nextInt();
        int ar[] = new int[size];
        System.out.println("Enter the Elements of Array:");
        for (int i=0; i<ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
        int sum = 0;                                   //------------local variable for calculating for the sum of Array 
        for (int i=0; i<ar.length; i++)
        {
            sum += ar[i];
        }
        //----------------------If the sum of the array is perfectly divisible by its size then the quotient is print 
        if(sum%size==0)
        {
            System.out.println(sum/size);
        }
        else                                        //--------------------else "-1" will be printed on the console
        {
            System.out.println("-1");
        }
    }
}
