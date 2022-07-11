package EEEEEEEEEE;
class node{
    node left,right;
    int key;
    node(int item){
        this.key=item;
    }
}
public class BinaryTree {
    node root;
    BinaryTree(){
        root=null;
    }
    void preorder(node node){
        if(node==null){
            return;
        }
        System.out.println(node.key);
        preorder(node.left);
        preorder(node.right);
    }
    void inorder(node node){
        if(node==null){
            return;
        }
        inorder(node.left);
        System.out.println(node.key);
        inorder(node.right);
    }
    void postorder(node node){
        if(node==null){
            return ;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.key);
    }
    void preorder(){
        preorder(root);
    }
    void postorder(){
        postorder(root);
    }
    void inorder(){
        inorder(root);
    }

    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.root=new node(1);
        tree.root.left=new node(2);
        tree.root.right=new node(3);
        tree.root.left.left=new node(4);
        tree.root.left.right=new node(5);
        System.out.println("preorder");
        tree.preorder();
        System.out.println();
        System.out.println("postorder");
        tree.postorder();
        System.out.println("inorder");
        tree.inorder();
    }
}