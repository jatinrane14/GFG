/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Tree {
    ArrayList<Integer> postOrder(Node node) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        postOrderSolve(node ,res);
        return res;
    }
    private void postOrderSolve(Node node, ArrayList<Integer> res){
        if(node == null) return;
        
        postOrderSolve(node.left,res);
        postOrderSolve(node.right,res);
        res.add(node.data);
    }
}