/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public boolean isSorted(Node head) {
        if(head == null || head.next ==null){
            return true;
        }
        // code here
        Node temp= head;
        while(temp.next!=null){
            if((temp.data > temp.next.data)){
                break;
            }
            temp = temp.next;
        }
        if(temp.next == null){
            return true;   
        }
        
        Node temp2 = head;
        while(temp2.next!=null){
            if((temp2.data < temp2.next.data)){
                return false;
            }
            temp2 = temp2.next;
        }
        return true;
    }
}