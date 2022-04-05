package Tree;
class Node{
    Node left,right;
    int key;
    public Node(int item){
        key =item;
        left=right=null;
    }
}//node creation complete

public class BinaryTree {
       Node root;
       BinaryTree() { //constructor
           root=null;
       }
       void preorder(Node node){  //preorder
           if(node==null){
               return;
           }
           System.out.println(node.key  );
           preorder(node.left);
           preorder(node.right);
       }
       void inorder(Node node){    //inorderTraversel
           if(node ==null){
               return;
           }
           inorder(node.left);
           System.out.println(node.key);
           inorder(node.right);
       }
       void postorder(Node node){
            if(node ==null){
                return;
            }
            postorder(node.left);
            postorder(node.right);
           System.out.println(node.key);
       }
       void preorder(){
           preorder(root);
       }
       void inorder(){
           inorder(root);
       }
       void postorder(){
           postorder(root);
       }

    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        System.out.println("preorder traversel =   "   );
        tree.preorder();
        System.out.println("inorder traversel =   "  );
        tree.inorder();
        System.out.println("post traversel =    "  );
        tree.postorder();
    }//main close
}/*binary tree close
fuzzy interface
level or depth same
 2^(d+1) -1 = total number of node only in complete binary tree
total number of non-leaf internal nodes 2^d -1
height =1 se START hoti *//*hai */