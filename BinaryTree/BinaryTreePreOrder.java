/**
 * BinaryTreePreOrder
 */
public class BinaryTreePreOrder {

    static class Node {
        int data;
        Node left;
        Node rigth;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.rigth = null;
        }
    }

    static class BinaryTreeBuild {
        static int idx = -1;

        public static Node binaryBuild(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = binaryBuild(nodes);
            newNode.rigth = binaryBuild(nodes);
            return newNode;

        }
        
    }
    public static void preOrder(Node root){
        if(root==null){
            System.out.print(-1+" ");
            return ;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.rigth);
    }
    public static void main(String[] args) {
        int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTreeBuild tree = new BinaryTreeBuild();
        Node root = tree.binaryBuild(node);
        System.out.println(root.data);
        System.out.println("Pre Order Sequence :");
        preOrder(root);

    }

}