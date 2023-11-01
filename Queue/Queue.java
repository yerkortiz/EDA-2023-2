package Queue;
public class Queue {

    LinkedListNode head;
    LinkedListNode tail;

    class LinkedListNode{
        int value;
        LinkedListNode next;

        LinkedListNode(int x){
            this.value = x;
        }

        LinkedListNode(int x, LinkedListNode n){
            this.value = x;
            this.next = n;
        }
    }

    void enqueue(int x){ //O(1)
        if(this.head == null){
            this.head = new LinkedListNode(x);
            this.tail = this.head;
            return;
        }

        LinkedListNode aux = new LinkedListNode(x);
        this.tail.next = aux;
        this.tail = aux;
    }

    int dequeue(){
        if(this.head == null){
            return -1;
        }
        if(this.head.next == null){
            int x = head.value;
            this.head = null;
            this.tail = null;
            return x;
        }

        int x = head.value;
        this.head = this.head.next;
        return x;
    }

    void printQueue(){//O(N)
        LinkedListNode aux = this.head;
        while(aux!=null){
            System.out.println(aux.value);
            aux=aux.next;
        }
    }
    public static void main(String[] args) {
        Queue c = new Queue();
        c.enqueue(1);   
        c.enqueue(10);   
        c.enqueue(15);   
        c.enqueue(20);
        c.printQueue();
        System.out.println(c.dequeue());
        System.out.println(c.dequeue());
        System.out.println(c.dequeue());
        System.out.println(c.dequeue());
        System.out.println(c.dequeue());
    }
}
