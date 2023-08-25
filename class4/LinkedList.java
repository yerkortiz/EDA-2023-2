class LinkedList{
    Node head;
    public class Node {
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    void insertHead(int x){
        if(this.head == null){
            this.head = new Node(x, null);
            return;
        }
        Node aux = new Node(x, this.head);
        this.head = aux;
    }

    void printList(){
        Node aux = this.head;
        while(aux != null){
            System.out.println(aux.value);
            aux = aux.next;
        }
    }

    void insertLast(int x){
        if(this.head == null){
            this.head = new Node(x, null);
            return;
        }
        Node aux = this.head;
        while(aux.next != null){
            aux = aux.next;
        }
        // System.out.println(aux.value);
        aux.next = new Node(x);
    }
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        // l.insertHead(5);
        // l.insertHead(9);
        // l.insertHead(4);
        // l.insertHead(6);
        // // l.printList();
        l.insertLast(13);
        l.printList();
    }
}