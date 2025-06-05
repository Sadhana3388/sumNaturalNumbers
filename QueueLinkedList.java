public class QueueLinkedList<T> {
   
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> front; 
    private Node<T> rear; 

    public QueueLinkedList() {
        front = null;
        rear = null;
    }

    
    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);
        if (rear == null) {
            
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

   
    public T dequeue() {
        if (front == null) {
            throw new RuntimeException("Queue is empty");
        }
        T data = front.data;
        front = front.next;
        if (front == null) {
           
            rear = null;
        }
        return data;
    }

    
    public T peek() {
        if (front == null) {
            throw new RuntimeException("Queue is empty");
        }
        return front.data;
    }

    
    public boolean isEmpty() {
        return front == null;
    }

    
    public void printQueue() {
        Node<T> current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        QueueLinkedList<Integer> queue = new QueueWithLinkedList<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.printQueue(); 

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front element: " + queue.peek()); 

        queue.printQueue(); 
    }
}
