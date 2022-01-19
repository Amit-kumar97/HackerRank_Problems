import java.util.Scanner;

/*
From the given set of values in the array, the children inside the array is the element which is the smallest among
all the elements present in the right of it and the rightmost element is always a child.
Input Format:
An integer n, denoting number of elements An array of size n
Output Format:
Output all the n elements of the array space separated containing the Children in the arrays.
Sample Input:
6
2 5 3 4 17 16
 */

public class Children_Array {
    //-------variable declaration
    int size;
    int ar[];
    //---------constructor
    Children_Array()
    {
        //-------for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        size = sc.nextInt();
        ar = new int[size];
        System.out.println("Enter the Elements of Array:");
        for(int i=0; i<ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
    }
    //------------method for implementing logic
    public void checkchild()
    {
        //------------checking each element of array with their all right side elements
        System.out.println("Children Array:");
        for(int i=0; i< ar.length; i++){
            int j=0;
            for(j=i+1; j< ar.length; j++)
            {
                if(ar[i]>=ar[j])                         // ----------if condition gets fail it breaks from that element 
                    break;
            }
            if(j==size)
                System.out.print(ar[i]+" ");
        }
    }
}
//------execution class
class childrenarraytest
{
    public static void main(String[] args) {
        Children_Array obj = new Children_Array();                 //-------object creation
        obj.checkchild();                                          //-------calling method
    }
}
import java.util.Scanner;

/*
From the given set of values in the array, the children inside the array is the element which is the smallest among
all the elements present in the right of it and the rightmost element is always a child.
Input Format:
An integer n, denoting number of elements An array of size n
Output Format:
Output all the n elements of the array space separated containing the Children in the arrays.
Sample Input:
6
2 5 3 4 17 16
 */

public class Children_Array {
    //-------variable declaration
    int size;
    int ar[];
    //---------constructor
    Children_Array()
    {
        //-------for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        size = sc.nextInt();
        ar = new int[size];
        System.out.println("Enter the Elements of Array:");
        for(int i=0; i<ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
    }
    //------------method for implementing logic
    public void checkchild()
    {
        //------------checking each element of array with their all right side elements
        System.out.println("Children Array:");
        for(int i=0; i< ar.length; i++){
            int j=0;
            for(j=i+1; j< ar.length; j++)
            {
                if(ar[i]>=ar[j])                         // ----------if condition gets fail it breaks from that element 
                    break;
            }
            if(j==size)
                System.out.print(ar[i]+" ");
        }
    }
}
//------execution class
class childrenarraytest
{
    public static void main(String[] args) {
        Children_Array obj = new Children_Array();                 //-------object creation
        obj.checkchild();                                          //-------calling method
    }
}
