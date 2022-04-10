package Stack;

import java.util.Arrays;
import java.util.Stack;

class MyStack {
    Stack st = new Stack();
    Stack min_st = new Stack();

    public void push(int x) {
        if(min_st.empty() && st.empty()){
            min_st.push(x);
            st.push(x);
        }else {
            int min_val = Math.min(x, (int) min_st.peek());
            st.push(x);
            min_st.push(min_val);
        }
    }

    public void pop() {
        if(!st.empty()) {
            st.pop();
        }
        if(!min_st.empty()) {
            min_st.pop();
        }
    }

    public int top() {
        if(min_st.empty())
            return -1;
        if(st.empty())
            return -1;
        return (int) st.peek();
    }

    public int getMin() {
//        System.out.println(min_st+"< = >"+st);
        if(min_st.empty())
            return -1;
        return (int) min_st.peek();
    }
}

public class MinStack {

    public static void main(String[] args) {
        //19 P 10 P 9 g P 8 g P 7 g P 6 g p, g, p, g, p, g, p g p g
        MyStack myStack = new MyStack();
        myStack.push(10);
        myStack.push(9);
        System.out.println(myStack.getMin());
        myStack.push(8);
        System.out.println(myStack.getMin());
        myStack.push(7);
        System.out.println(myStack.getMin());
        myStack.push(6);
        System.out.println(myStack.getMin());
        myStack.pop();
        System.out.println(myStack.getMin());
        myStack.pop();
        System.out.println(myStack.getMin());
        myStack.pop();
        System.out.println(myStack.getMin());
        myStack.pop();
        System.out.println(myStack.getMin());
        myStack.pop();
        System.out.println(myStack.getMin());
//        myStack.pop();

    }
}
