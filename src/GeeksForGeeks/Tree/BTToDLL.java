package GeeksForGeeks.Tree;
public class BTToDLL {
    static Node prev=null;
    public static Node BTTODLL(Node root){
        if(root==null){
            return root;
        }
        Node head=BTTODLL(root.left);
        if(prev==null){
            head=root;
        }
        else{
          root.left=prev;
          prev.right=root;
        }
        prev=root;
        BTTODLL(root.right);
        return head;
    }
    public static void printList(Node head){
        Node curr=head;
        while(curr!=head){
            System.out.println(curr.key+" ");
            curr=curr.right;
        }
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(20);
        root.right.left=new Node(30);
        root.right.right=new Node(35);

        Node head=BTTODLL(root);
        printList(head);
    }
}
