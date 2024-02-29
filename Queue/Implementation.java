/*
implementation of queue using array

 */
package Queue;

public class Implementation {
    static class Queue {
        static int size;
        static int[] array;
        static int rear = -1;

        Queue(int size) {
            array = new int[size];
            Queue.size = size;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static boolean isFull() {
            return rear == size - 1;
        }

        //adding elements into the queue called enqueue
        public static void enqueue(int x) {
            if (isFull()) {
                System.out.println("queue is full");
                return;
            }
            rear++;
            array[rear] = x;
        }

        //deleting the elements from the queue
        public static int dequeue() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int front = array[0];
            //now move every element to right place
            for (int i = 0; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            rear--;
            return front;
        }

        //returning peek elements of the array
        public static int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return array[0];
        }
        //printing the queue
        public static void display(){
            if(isEmpty()){
                System.out.println("Queue is empty");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(array[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        Queue.enqueue(5);
        Queue.enqueue(4);
        Queue.enqueue(3);
        Queue.enqueue(2);
        Queue.enqueue(1);

        //to display the queue elements
        Queue.display();
        System.out.println();
        System.out.println(Queue.dequeue());
        System.out.println(Queue.dequeue());
        Queue.display();
        System.out.println();
        System.out.println(Queue.peek());
    }
}
