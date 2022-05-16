import java.util.Stack;
public class minStack {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    void push(int value) {
        stack1.push(value);
        //空或者新元素较小，则入栈
        if(stack2.empty() || stack2.peek() > value)
            stack2.push(value);
        else
            //重复加入栈顶
            stack2.push(stack2.peek());
    }

    public void pop() {
        stack1.pop();
        stack2.pop();
    }

    public int top() {
        return  stack1.peek();
    }

    public int min() {
        return  stack2.peek();
    }



}
