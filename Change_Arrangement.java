import java.util.Scanner;

//------hackerRank Problem
/* ------There are N students in a classroom and they are seated in a linear order.
The teacher plans to change the seating arrangement of all the students in such a way that each student sits on
the new bench everyday.
For example; student sitting at first bench moves to the second bench
Input Format:
An integer N denoting number of students An array arr[n]
Output Format:
An array displaying the required seating arrangement
Sample Input:
6
James Logan Mason Jacob Lucas Ethan    */

public class Change_Arrangement {
    // ----------variable declaration
    int size;
    String ar[];
    //----------Constructor
    Change_Arrangement()
    {
        //---------for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of String Array:");
        ar = new String[size];
        size = sc.nextInt();
        System.out.println("Enter the String Elements of Array:");
        for (int i=0; i<ar.length; i++) {
            ar[i] = sc.next();
        }
    }
    //---------method for implementing logic
    public void shift()
    {
        String temp = ar[ar.length-1];            //-------temporary variable for storing last element of array
        for (int i=ar.length-1; i>0; i--) {         // -----running loop for shifting values to their next index
            ar[i] = ar[i-1];
        }
        ar[0] = temp;                                // ----- after performing operation on array , store last value to their first index
        System.out.println("Array After Changing the Arrangement:");
        //------  Simply print the values with the forEach loop
        for (String res:ar) {
            System.out.print(res+" ");
        }
    }
}
//------------Execution class
class change_arrangement_test
{
    public static void main(String[] args) {
        Change_Arrangement obj = new Change_Arrangement();             //-----------Object creation
        obj.shift();                                                   //-----------Method calling
    }
}
