import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeKeySearch {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node buildBinarySearchTree(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = buildBinarySearchTree(root.left, val);
        }
        else {
            root.right = buildBinarySearchTree(root.right, val);
        }
        return root;
    }

    public static void levelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    return;
                } else {
                    q.add(null);
                }
            } 
            else {
                System.out.print(currNode.data+" ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }
    static boolean res=false;
    public static boolean keyValueSearch(Node root,int key){
        if(root==null){
            return res;
        }
        if(root.data==key){
            res=true;
            return res;
        }
        if(root.data>key){
            keyValueSearch(root.left, key);
        }
        else{
            keyValueSearch(root.right, key);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = buildBinarySearchTree(root, arr[i]);
        }
        System.out.println();
        levelOrderTraversal(root);
        System.out.println(keyValueSearch(root, 1));
        
    }

}
