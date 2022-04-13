package GeeksForGeeks.Tree;
class Nodee{
    int key;
    Node left;
    Node right;
    Nodee(int k){
        key=k;
        left=null;
        right=null;
    }
}
public class NUmberOfNodes {
    public static int numberofnodes(Node root){
        if(root==null){
            return 0;
        }
        return 1+numberofnodes(root.left)+numberofnodes(root.right);
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.right=new Node(60);
        System.out.print(numberofnodes(root));
    }
}
