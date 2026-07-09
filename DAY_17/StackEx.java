//Stack implement using array--------->

package DAY_17;

public class StackEx {
    int stack[];
    int top;
    int size;

    StackEx(int size) {

        this.size = size;
        stack = new int[size];
        top = 1;

    }

    void push(int element) {

        if (top == size - 1) {
            System.out.println("Stack over flow!!");
            return;
        }
        stack[++top] = element;
        System.out.println("Element insernted successfully " + element);

    }

    void pop() {
        if (top == size - 1) {
            System.out.println("Stack under flow!!");
            return;
        }
        System.out.println("/nElement remove successfully " + stack[top]);
        top--;
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty!!");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty!!");
            return;
        }
        System.out.println("Top element is: " + stack[top]);
    }

    void isEmpty() {
        if (top == -1) {
            System.out.println("Stack is empty!!");
            return;
        }
        System.out.println("Stack is not empty!!");
    }

    void isFull() {
        if (top == size - 1) {
            System.out.println("Stack is full!!");
            return;
        }
        System.out.println("Stack is not full!!");
    }

    public static void main(String args[]) {

        StackEx obj = new StackEx(6);

        obj.isEmpty();
        obj.isFull();
        obj.push(122);
        obj.push(120);
        obj.push(120);
        obj.push(120);
        obj.push(120);
        obj.push(1320);
        obj.peek();

        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.peek();

        obj.display();

    }
}