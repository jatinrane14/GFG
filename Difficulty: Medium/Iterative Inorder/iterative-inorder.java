/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
};
*/
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        inOrderSolve(root,res);
        return res;
    }
    private void inOrderSolve(Node root, ArrayList<Integer> res){
        if(root == null) return;
        inOrderSolve(root.left,res);
        res.add(root.data);
        inOrderSolve(root.right,res);
    }
}