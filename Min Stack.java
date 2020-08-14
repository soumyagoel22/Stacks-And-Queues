import java.util.*;

class Solution {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minstack = new Stack<Integer>();
    public void push(int x) {
        stack.push(x);
        if(minstack.empty() || x<=minstack.peek())
        minstack.push(x);
    }

    public void pop() {
        if(!stack.empty())
        {
            int num = stack.pop();
            if(num==minstack.peek())
            {
                minstack.pop();
            }
        }
    }

    public int top() {
        if(stack.empty())
        return -1;
        return stack.peek();
    }

    public int getMin() {
        if(minstack.empty())
        return -1;
        return minstack.peek();
    }
}
