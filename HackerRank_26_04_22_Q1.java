/*
Given an array, rotate the array to the right by k steps, where k is non-negative.

Input Format:
The first line contains an integer n, the number of elements in the array.

Each of the next n lines contains an integer, the data values of the elements in the array.

Next line contains an integer k, the elements to be rotated.

Constraints:
1 <= nums.length <= 105
-1000 <= nums[i] <= 1000
0 <= k <= 105

Output Format:
Print the rotated array elements space separated.

Sample Input 0:
7
1 2 3 4 5 6 7
3

Sample Output 0:
5 6 7 1 2 3 4

Explanation 0:
Input: nums = [1,2,3,4,5,6,7], k = 3

Output: [5,6,7,1,2,3,4]

Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int d=sc.nextInt();
        for(int i=0;i<n;i++)
            ans[(n+i-(n-d))%n]=arr[i];
        for(int i=0;i<n;i++)
            System.out.print(ans[i]+" ");
    }
}
