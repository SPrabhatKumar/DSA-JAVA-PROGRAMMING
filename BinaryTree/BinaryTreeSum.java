import java.util.LinkedList;
import java.util.Queue;


public class BinaryTreeSum {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    static class BinaryTreeBuild{
        static int idx=-1;
        public static Node buildtree(int node[]){
            idx++;
            if(node[idx]==-1){
                return null;
            }
            Node newNode=new Node(node[idx]);
            newNode.left=buildtree(node);
            newNode.right=buildtree(node);
            return newNode;
        }
    }
    public static void levelPreorder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currnode=q.remove();
            if(currnode==null){
                System.out.println();
                if(q.isEmpty()){
                    return ;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currnode.data+" ");
                if(currnode.left!=null){
                    q.add(currnode.left);
                }
                if(currnode.right!=null){
                    q.add(currnode.right);
                }
            }
             
        }
        

    }
    public static  int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftsub=sumOfNodes(root.left);
        int rigthsub=sumOfNodes(root.right);
        return leftsub+rigthsub+root.data;
    }
    public static int heigth(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=heigth( root.left);
        int rightHeight=heigth( root.right);
        int myHeight=Math.max(leftHeight, rightHeight)+1;
        return myHeight;
    }
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int leftdiameter=diameter(root.left);
        int rightdiameter=diameter(root.right);
        int diameter3=heigth(root.left)+heigth(root.right)+1;
        return Math.max(diameter3,Math.max(leftdiameter,rightdiameter)); 
    }
    public static void main(String[] args) {
        int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTreeBuild tree=new BinaryTreeBuild();
        Node root=tree.buildtree(node);
        levelPreorder(root);
        int res=sumOfNodes(root);
        System.out.println(res);
        System.out.println(heigth(root));
        System.out.println(diameter(root));
        
   }

}
