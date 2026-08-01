/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node head = null;
        Node tail = null;
        while(head1!=null && head2 != null){
            Node newNode = null;
            if(head1.data <= head2.data ){
                newNode = new Node(head1.data);
                head1 = head1.next;
            }else{
                newNode = new Node(head2.data);
                head2 = head2.next;
            }
            
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        
        while(head1 != null){
            Node newNode = new Node(head1.data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
            head1 = head1.next;
        }
        while(head2 != null){
            Node newNode = new Node(head2.data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
            head2 = head2.next;
        }
        
        return head;
    }
}