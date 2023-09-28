package c8;

// import java.util.Stack;
// import java.util.Queue;
// import java.util.LinkedList;

public class Main {

    static boolean evalString(char[] s){
        for(int i = 0; i < s.length; i++){
            switch(s[i]){
                case '(':
                case '[':
                case '{':
                case ')':
                case ']':
                case '}':
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Stack<Integer> st = new Stack<Integer>();
        // Queue<Integer> q = new LinkedList<Integer>();
        LinkedList ll = new LinkedList();
        ll.insertSorted(10);
        // ll.print();
        ll.insertSorted(2);
        ll.insertSorted(5);
        ll.insertSorted(12);
        ll.print();

    }
}