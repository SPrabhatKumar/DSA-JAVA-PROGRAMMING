import java.util.LinkedList;
import java.util.Queue;

public class Diameteroftree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    static class Buildtree{
        Node root=null;
        
    }
    public static void levelOrderTraversal(Node root){
        if(root==null){
            return ;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                System.out.println();
                if(q.isEmpty()){
                    return;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(curr.data+" ");
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }

        }
    }
    static class Diameter{
        int height;
        int diameter;
        Diameter(int height,int diameter){
            this.height=height;
            this.diameter=diameter;
        }
        public static Diameter diaTree(Node root){
            if(root==null){
                return new Diameter(0, 0);
            }
            Diameter leftsub=diaTree(root.left);
            Diameter rightsub=diaTree(root.right);
            int myHeight=Math.max(leftsub.height,rightsub.height)+1;
            int diameter1=leftsub.diameter;
            int diameter2=rightsub.diameter;
            int diameter3=leftsub.height+rightsub.height;
            int mydiameter=Math.max(diameter3, Math.max(diameter1, diameter2));
            Diameter myans=new Diameter(myHeight, mydiameter);
            return myans;

        }
    }
    public static void main(String[] args) {
        Buildtree tree=new Buildtree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        tree.root.right.right=new Node(6);
        tree.root.right.right.right=new Node(7);
        levelOrderTraversal(tree.root);
        System.out.println(Diameter.diaTree(tree.root).height);
        System.out.println(Diameter.diaTree(tree.root).diameter);
        

    }

}
