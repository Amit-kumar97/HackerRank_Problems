import java.util.Arrays;
import java.util.Scanner;

/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

Input Format:
n1 & n2 (represents the size of arrays, arr1 and arr2)
User inputs in arr1 and arr2

Input: n1 = 2, n2 = 2, arr1 = [5,6], arr2 = [7,8]
Output: 6.5
Explanation: merged array = [5,6,7,8] and median is (6 + 7) / 2 = 6.5.
Sample Input 0:
2
1
1 3
2

Sample Output 0:
2.0
 */

public class CalculateMedian {

    public static double findmedian(int arr1[], int arr2[])
    {
        double median;
        int arnew[] = new int[arr1.length+arr2.length];
        int j = 0;
        for (int i=0; i<arnew.length; i++)
        {
            if (i<arr1.length)
            {
                arnew[i] = arr1[i];
            }
            else
            {
                arnew[i] = arr2[j];
                j++;
            }
        }
        Arrays.sort(arnew);
        if (arnew.length%2!=0)
        {
            int k = arnew.length/2;
            median = arnew[k];
        }
        else
        {
            int k = arnew.length/2-1;
            int m = arnew.length/2;
            int sum = (arnew[k]+arnew[m]);
            median = sum/2;
        }
        System.err.println("Concatenated Array:");
        for (int res:arnew)
        {
            System.err.print(res+" ");
        }
        System.err.println();
        return median;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the Size of 1st Array:");
        int n1 = sc.nextInt();
        System.err.println("Enter the Size of 2nd Array:");
        int n2 = sc.nextInt();
        int ar1[] = new int[n1];
        int ar2[] = new int[n2];
        System.err.println("Enter the Elements of 1st Array:");
        for (int i=0; i<ar1.length; i++)
        {
            ar1[i] = sc.nextInt();
        }
        System.err.println("Enter the Elements of 2nd Array:");
        for (int i=0; i<ar2.length; i++)
        {
            ar2[i] = sc.nextInt();
        }
       System.err.println("Median of Both the Arrays = "+findmedian(ar1,ar2));
    }
}
