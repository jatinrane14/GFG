/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> res= new ArrayList<>();
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