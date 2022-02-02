/*A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Sample Input:
madam
Sample Output:
Yes
*/
import java.io.*;
import java.util.*;

public class String_Pelindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuffer st = new StringBuffer(str);
        st.reverse();
        String rev = st.toString();
        if (str.equals(rev))
        {
            System.out.println("Yes");
        }
         else
        {
            System.out.println("No");
        }
    }
}
