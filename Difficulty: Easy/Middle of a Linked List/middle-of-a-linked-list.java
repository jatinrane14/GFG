/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        Node temp = head;
        int len=0;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        
        Node temp1 = head;
        int count =0;
        int mid = (len%2==0)?len/2+1:len/2+1;
        while(temp1!=null){
            count++;
            if(count==mid){
                return temp1.data;
            }
            temp1 = temp1.next;
        }
        return -1;
    }
}