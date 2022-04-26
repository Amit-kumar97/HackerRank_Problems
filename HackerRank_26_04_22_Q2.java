/*
Given a integer x, return x with its digits reversed.

Input Format:
Take input a number n.

Constraints:

-200 <= n <= 200

Output Format:

Print the reversed number

Sample Input 0:
-102

Sample Output 0:
-201

Explanation 0:
Number : 210
Reversed Number : 12
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ans="";
        if(s.charAt(0)=='-')
            ans+="-";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!='-')
                ans+=s.charAt(i);
        }
        System.out.println(Integer.parseInt(ans));
    }
}
