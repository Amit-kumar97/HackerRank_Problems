import java.io.BufferedWriter;
import java.io.*;
import java.util.*;

/*
You’re given the pointer to the head nodes of two linked lists. Compare the data in the nodes of the linked lists to
check if they are equal. If all data attributes are equal and the lists are the same length, return . Otherwise, return .

Example:
The two lists have equal data attributes for the first  nodes.  is longer, though, so the lists are not equal. Return .

Function Description

Complete the compare_lists function in the editor below.

compare_lists has the following parameters:
SinglyLinkedListNode llist1: a reference to the head of a list
SinglyLinkedListNode llist2: a reference to the head of a list

Returns:
int: return 1 if the lists are equal, or 0 otherwise
Input Format

The first line contains an integer , the number of test cases.

Each of the test cases has the following format:
The first line contains an integer , the number of nodes in the first linked list.
Each of the next  lines contains an integer, each a value for a data attribute.
The next line contains an integer , the number of nodes in the second linked list.
Each of the next  lines contains an integer, each a value for a data attribute.

Output Format:

Compare the two linked lists and return 1 if the lists are equal. Otherwise, return 0. Do NOT print anything to stdout/console.

The output is handled by the code in the editor and it is as follows:

For each test case, in a new line, print  if the two lists are equal, else print .

Sample Input:

2
2
1
2
1
1
2
1
2
2
1
2

Sample Output:
0
1

Explanation:

There are t=2 test cases, each with a pair of linked lists.

In the first case, linked lists are: 1 -> 2 -> NULL and 1 -> NULL

In the second case, linked lists are: 1 -> 2 -> NULL and 1 -> 2 -> NULL
 */

public class HackerRank_15_03_2022_Q1 {

    public static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    public static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
    public static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        int l1=0,l2=0;
        SinglyLinkedListNode temp1=head1;
        SinglyLinkedListNode temp2=head2;
        while(temp1!=null){
            l1++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            l2++;
            temp2=temp2.next;
        }
        if(l1!=l2)
            return false;
        while(head1!=null){
            if(head1.data!=head2.data)
                return false;
            head1=head1.next;
            head2=head2.next;
        }
        return true;
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            SinglyLinkedList llist1 = new SinglyLinkedList();

            int llist1Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist1Count; i++) {
                int llist1Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist1.insertNode(llist1Item);
            }

            SinglyLinkedList llist2 = new SinglyLinkedList();

            int llist2Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist2Count; i++) {
                int llist2Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist2.insertNode(llist2Item);
            }

            boolean result = compareLists(llist1.head, llist2.head);

            bufferedWriter.write(String.valueOf(result ? 1 : 0));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
