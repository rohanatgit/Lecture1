package GeeksForGeeks.Tree.PracticeQuetions;

import java.util.ArrayList;
class Node
{
    int key;
    Node left;
    Node right;
    Node(int k){
        key=k;
        left=right=null;
    }
}


public class PreorderTree {
    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer>h=new ArrayList<>();
        if(root==null)
            return h;
        h.add(root.key);
        h.addAll(preorder(root.left));
        h.addAll(preorder(root.right));
        return h;

    }

}
