import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/*
Ram has a queue. He wants to reverse the first K element of his queue.
Help him do the same using Stack data structure.

Input Format:
size of queue
integer K denoting number of elements that need to be reversed
input the queue

Output Format:
reverse queue

Sample Input 0:
7
3
12 3 4 67 88 22 54

Sample Output 0:
4 3 12 67 88 22 54
 */

public class Reverse_K_Element {

    static Queue<Integer> queue;

    public static void main(String args[]) {

         queue = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        System.out.println("Enter the number of Element that need to be reversed:");
        int k = sc.nextInt();

        int ar[] = new int[n];

        System.out.println("Enter Elements in Array:");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }

        System.out.println("Initial Array:");
        for(int i=0; i< ar.length; i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();

        reverse(k,ar);

        System.out.println("After reversing first K Element :");
        print();
    }

    public  static void reverse(int k,int ar[])
    {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < k; i++) {
            st.push(ar[i]);
        }
        while(!st.isEmpty())
        {
            queue.add(st.pop());
        }
        for (int i = k; k < ar.length; k++) {
            queue.add(ar[k]);
        }
    }

    public static void print()
    {
        for (int  res:queue) {
            System.out.print(res+" ");
        }
    }
}
