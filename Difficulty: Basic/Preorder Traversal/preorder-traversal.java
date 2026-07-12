/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer> res = new ArrayList<>();
        preOrderSolve(root,res);
        return res;
    }
    private void preOrderSolve(Node root, ArrayList<Integer> res){
        if(root == null) return;
        res.add(root.data);
        preOrderSolve(root.left,res);
        preOrderSolve(root.right,res);
    }
}