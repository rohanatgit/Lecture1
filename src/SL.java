public class SL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public class singlyLL{
        Node head;
        public void insertAtBeg(int x){
            Node n =new Node(x);
            if(head==null){
                head=n;
            }
            else{
                n.next=head;
                head=n;
            }
        }
        public void insertAtEnd(int x){
            Node n =new Node(x);
            if(head==null){
                head=n;
            }
            else{
                Node temp=head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=n;
            }
        }
        public int count(){
            int c=0;
            Node temp=head;
            while(temp!=null){
                c++;
                temp=temp.next;
            }
            return c;
        }
        public void AnyPos(int pos ,int data){
            Node n =new Node(data);
            if(head==null){
                if(pos>1){
                    System.out.println("LL is emptyso u can not add node at any position"+"greater than 1.");
                }
                else{
                    head=n;
                }
            }
            else{
                if(pos==1){
                    n.next=head;
                    head=n;
                }
                else if(pos>count()+1){
                    System.out.println("Position out of LL");
                }
                else{
                    Node temp =head;
                    int c=1;
                    while(temp.next!=null){
                        if(c==pos-1){
                            break;
                        }
                        c++;
                        temp=temp.next;
                    }
                    n.next=temp.next;
                    temp.next=n;
                }
            }
        }
        public void deleteAtBeg(){
            if(head==null){
                return;
            }
            else{

            }
        }
    }
}
