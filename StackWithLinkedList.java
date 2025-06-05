public class StackWithLinkedList<T> {

   
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> top;  
    public StackWithLinkedList() {
        top = null;
    }

   
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
    }

   
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow - The stack is empty");
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

  
    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        Node<T> current = top;
        System.out.print("Stack (top to bottom): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

   
    public static void main(String[] args) {
        StackWithLinkedList<Integer> stack = new StackWithLinkedList<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack();  

        System.out.println("Peek: " + stack.peek()); 

        System.out.println("Pop: " + stack.pop());    

        stack.printStack();  
    }
}