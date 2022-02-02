/*Alina joined the company last week. She receives the company mails in bulk and it is very hectic to go through each and every mail.
She wants to filter out the emails that are related to Human Resources(HR) Department. So help her make the list of the designations
that are related to HR.
Write a program that accepts designations in a String array. Check the given array elements containing "HR" and display the total 
number of elements that contains "HR" and display the elements in the upper case. 
If no elements contains "HR" then return "-1" as output.
Input Format:
A multiline string input.
Output Format:
Number of designation that contains "HR" along with the elements.

Sample Input 0:
4
HRExecutive
Accountant
HRManager
SalesMan
Sample Output 0:
2
HREXECUTIVE
HRMANAGER

Sample Input 1:
2
Operator
Programmer
Sample Output 1:
-1
 */
import java.io.*;
import java.util.*;

public class Designation_Challenge {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        int count=0;
        String rs[]=new String[n];
        for(int i=0;i<n;i++){
            if(arr[i].contains("HR")){
                rs[count]=arr[i];
                count++;
            }
        }
        if(count==0)
        {
            System.out.println(-1);
            return;
        }
        System.out.println(count);
        for(int i=0;i<n;i++){
            if(rs[i]!=null)
            System.out.println(rs[i].toUpperCase());
        }
    }
}
