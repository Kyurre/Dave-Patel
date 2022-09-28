package Assignment2;

public class SeLinkList {
    
    public int a, b, c;
    public SeLinkList next;

    
    public SeLinkList(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.next = next;
    }
    
    /*
    Node head; 
   
    static class Node {
   
        int a, b, c;
        Node next;
   
        // Constructor
        public Node(int a, int b, int c)
        {
            this.a = a;
            this.b = b;
            this.c = c;
            this.next = null;
        }
    }


    public SeLinkList insert(SeLinkList list, int a, int b, int c){
        Node node = new Node(a, b, c);

        if (list.head == null){
            list.head = node;
        }else {
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }

            last.next = node;
        }

        return list;
    }
    
    public void printList(SeLinkList list){
        Node curr = list.head;
        System.out.println("Data in the list: ");

        while(curr != null){
            System.out.print(curr.a +  " " + curr.b + " " + curr.c + "\n");

            curr = curr.next;
        }
    }
    */


    public static void main(String[] args){
        SeLinkList list = new SeLinkList(1, 5, 10);
        System.out.println("Current list data: a) " + list.a + " b) " + list.b + " c) " + list.c);
        //list.insert(list, 5, 10, 20);
        //list.insert(list, 3, 4, 5);
        //printList(list);
    }
}
