/*
By PW
Stack implementation using array
 */
package Stack;

public class ImplementationUsingArray {
    public static class Stack {
        private int[] arr = new int[4];
        private int indx = 0; ///vvv important

        //putting elements into the stack
        void push(int x) {
            if(isFull()){
                System.out.println("Stack is full!");
                return;
            }
            arr[indx++] = x;
        }

        //this function will return the top element of the stack
        int peek() {
            if (indx == 0) {
                System.out.println("stack is empty!");
                return -1;
            }
            return arr[indx - 1];
        }

        //this function will remove the top element of the stack and will return that element to the calling function
        int pop() {
            if (indx == 0) {
                System.out.println("stack is empty!");
                return -1;
            }

            int top = arr[indx - 1];
            arr[indx - 1] = 0;
            indx--;
            return top;
        }

        //printing the elements of the array
        void display(){
            for (int i = 0; i <=indx-1 ; i++) {
                System.out.print(arr[i] +" ");
            }
            System.out.println();
        }

        //retuning the length of the array
        int size(){
            return indx;
        }
        //function to check is stack is full
        boolean isFull(){
            return indx == arr.length;
        }

        //function to check is stack is empty
        boolean isempty(){
            return indx == 0;
        }
        int capacity(){
            return arr.length;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.display();//4
        st.push(5);
        st.display();//4 5
        st.push(1);
        st.display();//4 5 1
        System.out.println(st.size());//3
        st.pop();
        st.display();// 4 5
        System.out.println(st.size());//2
        st.push(99);
        st.push(78);
        System.out.println(st.isFull());
        st.push(100);
        System.out.println(st.capacity());

    }
}
