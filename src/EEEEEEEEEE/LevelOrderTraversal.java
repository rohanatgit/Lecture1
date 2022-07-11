package EEEEEEEEEE;
 import java.util.*;
class node3{
    node3 left,right;
    int data;
    node3(int item){
        data=item;
    }
}
public class LevelOrderTraversal {

    node3 root;
    void printlevelorder(){
        Queue<node3> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            node3 first=queue.poll();
            System.out.println(first.data);
            if(first.left!=null)
                queue.add(first.left);
            if(first.right!=null)
                queue.add(first.right);
        }
    }

    public static void main(String[] args) {
        LevelOrderTraversal ll=new LevelOrderTraversal();
        ll.root=new node3(50);
        ll.root.left=new node3(30);
        ll.root.right=new node3(70);
        ll.root.left.left=new node3(20);
        ll.root.left.right=new node3(40);
        ll.printlevelorder();

    }
}
