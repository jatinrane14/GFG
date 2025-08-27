/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        // Code here
        Node newNode = new Node(x);
        if(head == null){
                newNode.next = head;
                head = newNode;
               return head;
        }
        int len = 0;
        Node temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        
        int mid = (len % 2 == 0) ? len / 2 : (len / 2) + 1;
        int count=0;
        Node temp2 = head;
        while(temp2!=null){
            count++;
            if(count==mid){
                newNode.next = temp2.next;
                temp2.next = newNode;
                break;
            }
            temp2 = temp2.next;
        }
        return head;
    }
}