package Assignment2;

public class seLinkList {
    public seLinkList next;
    public int a, b, c;

    public seLinkList(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        next = null;
    }

    public static void main(String args[]){
        seLinkList list = new seLinkList(1, 5, 10);
        System.out.println("Current list data: a) " + list.a + " b) " + list.b + " c) " + list.c);
    }
}
