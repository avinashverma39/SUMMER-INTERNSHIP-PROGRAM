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

    public static void main(String args[]){

        StackEx obj = new StackEx(6);
        obj.push(122);
        obj.push(120);
        obj.push(120);
        obj.push(120);
        obj.push(120);
        obj.push(1320);
       }
}