package c8;

public class LinkedList {
    public class LinkedListNode{
        int value;
        LinkedListNode next;
        LinkedListNode(int value){
            this.value = value;
        }
    }
    LinkedListNode head;

    public void print(){
        LinkedListNode aux = head;
        while(aux != null){
            System.out.printf("%d \n", aux.value);
            aux = aux.next;
        }
    }

    public void insertSorted(int x){
        
        /*
         * Si la lista está vacía inserto al elemento
         * como head de la lista
         */
        if(this.head == null){
            this.head = new LinkedListNode(x);
        }

        LinkedListNode aux = head;
        LinkedListNode prev = null;
        while(aux != null){
            if(x < aux.value){
                //elemento va al inicio de la lista porque prev es nulo
                if(prev == null){
                    LinkedListNode temp = new LinkedListNode(x);
                    temp.next = this.head;
                    this.head = temp;
                    return;
                }
                //elemento va en medio de dos elementos, por lo que prev.next = el nuevo valor
                // el siguiente del nuevo es aux
                prev.next = new LinkedListNode(x);
                prev.next.next = aux;
                return;
            }
            prev = aux;
            aux = aux.next;
        }
        //el ultimo elemento es el valor a insertar
        prev.next = new LinkedListNode(x);
    }
}
