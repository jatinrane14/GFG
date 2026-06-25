/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}
*/

class Solution {
    public int count(Node head, int key) {
        // code here
        Node temp = head;
        int freq =0;
        while(temp!=null){
            if(temp.data == key){
                freq++;
            }
            temp = temp.next;
        }
        
        return freq;
    }
}