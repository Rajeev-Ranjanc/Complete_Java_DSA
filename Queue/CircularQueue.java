package Queue;

/*
Implementation of circular queue using array
 */
public class CircularQueue {
    static class Queue {
        static int[] arr;
        static int size;
        static int front = -1;
        static int rear = -1;

        Queue(int size) {
            arr = new int[size];
            Queue.size = size;
        }

        //queue is empty
        public static boolean isEmpty() {
            return front == -1 && rear == -1;
        }

        //queue is full
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }


        //enqueue
        public static void enqueue(int data) {
            if (isFull()) {
                System.out.println("queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        //   removing the elements from the queue
        public static int dequeue() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int deq = arr[front];
            //only single elements
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return deq;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];

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
        while (!Queue.isEmpty()) {
            System.out.print(Queue.peek()+" ");
            Queue.dequeue();
        }

    }
}
