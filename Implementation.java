// public class Implementation{
//     public static void main(String args[]){

//     }
//     class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }

//     }
//     class LinkedList{
//         Node head;
//     Node insert(int data){
//         if(head==null){
//             Node n1=new Node(data);
//             head=n1;
//         }
//     }
//     }
// }
public class Implementation{
    public static void main(String args[]){

        LinkedList l1=new LinkedList();
        l1.insert(1);
        l1.insert(3);
        l1.insert(7);
l1.print();

    }
   static  class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    
    }
    static class LinkedList{
        Node head;
         Node insert(int data){
            if(head==null){
                Node n1=new Node(data);
                head=n1;
            }
            else{
                Node temp=head;
                Node n1=new Node(data);
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=n1;
                n1.next=null;
            }
            return head;
        }
        void print(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
        }
    }
