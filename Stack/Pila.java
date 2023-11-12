package stack;

public class Pila {
    LinkedListNode top;

    static class LinkedListNode {
        int value;
        LinkedListNode next;

        LinkedListNode(int x) {
            this.value = x;
        }

        LinkedListNode(int x, LinkedListNode n) {
            this.value = x;
            this.next = n;
        }
    }

    void push(int x){
        if(this.top == null){
            this.top = new LinkedListNode(x);
            return;
        }

        LinkedListNode aux = new LinkedListNode(x);
        aux.next = this.top;
        this.top = aux;
    }

    int pop(){
        if(this.top == null){
            return -1;
        }

        int x;
        x = this.top.value;
        if(this.top.next == null){
            this.top = null;
            return x;
        }
        this.top = this.top.next;
        return x;
    }
    public static void main(String[] args) {
        Pila p = new Pila();
        p.push(1);
        p.push(2);
        p.push(3);
        System.out.println(p.pop());
        System.out.println(p.pop());
        System.out.println(p.pop());
        System.out.println(p.pop());
    }
}
