package Stack;

//------------HackerRank
import java.util.Scanner;
import java.util.Stack;

/*
Write a program to delete the middle element of an array using stack.By using the fundamental functions of stack - push(), pop(), peek(), etc.
Input Format:
An integer n denoting the size of the input integer array.
n elements of integer array.

Constraints:
1

Output Format:
Print the remaining elements of array in reverse order after deleting the middle element.

Sample Input 0:
5
1 3 4 7 6

Sample Output 0:
6 7 3 1

Sample Input 1:
8
3 5 1 9 5 6 2 4

Sample Output 1:
4 2 6 5 1 5 3
 */
public class Remove_Middle {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int ar[] = new int[size];
        for (int i=0; i<ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
        int p=0;
        if(size%2==0)
            p=(size/2)-1;
        else
            p=size/2;

        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<ar.length;i++)
        {
            if(i==p)
                continue;
            else
            {
                stack.push(ar[i]);
            }
        }
        while(!(stack.isEmpty()))
        {
            System.out.print(stack.pop()+" ");
        }
    }
}
