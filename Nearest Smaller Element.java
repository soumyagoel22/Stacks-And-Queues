import java.util.*;

public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        int i,n;
        n = A.size();
        for(i=0;i<n;i++)
        {
            while(!stack.empty() && stack.peek()>=A.get(i))
            {
                stack.pop();
            }
            if(stack.empty())
            {
                arr.add(-1);
            }
            else
            {
                arr.add(stack.peek());
            }
            stack.push(A.get(i));
        }
        return arr;
    }
}
