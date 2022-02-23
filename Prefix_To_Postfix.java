package Stack;

//------------HackerRank
import java.util.Scanner;
import java.util.Stack;

/*
Convert the input prefix expression into Infix expression.
Prefix : An expression is called the prefix expression if the operator appears in the expression before the operands. Simply of the form (operator operand1 operand2).
Example : *+AB-CD
Infix : An expression is called the Infix expression if the operator appears in between the operands in the expression. Simply of the form (operand1 operator operand2).
Example : (A+B) * (C-D)
Input Format

Input a string from the user.

Constraints:
Nil

Output Format:
Print the infixed String.

Sample Input 0
*+AB-CD

Sample Output 0:
((A+B)*(C-D))

Explanation 0:
x+AB-CD is the input prefix and it's corresponding infix from is ((A+B)x(C-D)).
 */
public class Prefix_To_Postfix {
    public static String convert(String str)
    {
        Stack<String> stack = new Stack<String>();
        for(int i=str.length()-1; i>=0; i--)
        {
            char c = str.charAt(i);

            if(IsOperator(c))
            {
                String s1 = stack.pop();
                String s2 = stack.pop();
                String temp = "("+s1+c+s2+")";
                stack.push(temp);
            }
            else
            {
                stack.push(c+"");
            }
        }

        String result=stack.pop();
        return result;
    }

    public static boolean IsOperator(char ch)
    {
        switch (ch)
        {
            case '+':
            case '-':
            case '/':
            case '*':
                return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(convert(str));
    }
}
