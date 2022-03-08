import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
Shelly has been given a stream of characters and she has to find first non repeating character each time a character
is inserted to the stream.

Example:
Input : aabc
Output : a -1 b b

Input Format:
a-z lowercase characters

Output Format:
print -1 if queue is empty or print first non repeating character.

Sample Input 0:
aac

Sample Output 0:
a -1 c
 */
public class HackerRank_08_03_2022 {

    public static void firstnonrep(String str) {
        int[] charcount = new int[26];
        Queue<Character> q = new LinkedList<Character>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            charcount[ch - 'a']++;
            while (!q.isEmpty()) {
                if (charcount[q.peek() - 'a'] > 1) {
                    q.remove();
                } else {
                    System.out.print(q.peek() + " ");
                    break;
                }
            }
            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        firstnonrep(s);
//         if(s.length()==0)
//         {
//             System.out.println(-1);
//         }

//         else
//         {
//             char c=s.charAt(0);
//             System.out.print(c+" ");
//             String s1=""+String.valueOf(c);
//             for(int i=1;i<s.length();i++){
//                 if(s.charAt(i)==c)
//                 {
//                     System.out.print(-1+" ");
//                     s1="";
//                 }
//                 else
//                 {
//                     s1=s1+String.valueOf(s.charAt(i));
//                     System.out.print(s1.charAt(0)+" ");
//                     System.out.println(c);

//                 }
//             }
//         }
    }
}
