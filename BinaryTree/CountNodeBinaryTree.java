public class CountNodeBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree {
        Node root;
        BinaryTree(){
            root=null;
        }

    }
    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftsubtree=countNodes(root.left);
        int rightsubtree=countNodes(root.right);
        return leftsubtree+rightsubtree+1;
    }

    
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        tree.root.right.right=new Node(6);
        System.out.println(countNodes(tree.root));
    }

}
