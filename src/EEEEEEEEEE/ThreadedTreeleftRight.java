package EEEEEEEEEE;

class Node1{
    Node1 left,right;
    int key;
    boolean rightthread;
    boolean leftthread;
    Node1(int item){
        key=item;
    }
}
public class ThreadedTreeleftRight {
    static Node1 leftmost(Node1 root){
        if(root==null){
            return root;
        }
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    static void inorder(Node1 root){
        Node1 current=leftmost(root);
        while(current!=null && current.key!=Integer.MIN_VALUE){
            System.out.println(current.key);
            if(current.rightthread){
                current=current.right;
            }
            else{
                current=leftmost(current.right);
            }
        }
    }

    public static void main(String[] args) {
        Node1 dummy=new Node1(Integer.MIN_VALUE);
        Node1 n1=new Node1(90);
        Node1 n2=new Node1(20);
        Node1 n3=new Node1(50);
        Node1 n4=new Node1(60);
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        dummy.left=n1;
        dummy.right=dummy;
        dummy.rightthread=true;
        n4.right=n2;
        n4.rightthread=true;
        n2.right=n1;
        n2.rightthread=true;
        n3.right=dummy;
        n3.rightthread=true;
        // n4.left=dummy;
        // n4.leftthread=true;
        //n3.left=n1;
        // n3.leftthread=true;
        inorder(dummy);
    }
}