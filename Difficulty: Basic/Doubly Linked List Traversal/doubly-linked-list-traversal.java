// User function Template for Java

/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public static ArrayList<Integer> displayList(Node head) {
        // your code here
        Node trve = head;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(trve!=null){
            list.add(trve.data);
            trve = trve.next;
        }
        return list;
    }
}