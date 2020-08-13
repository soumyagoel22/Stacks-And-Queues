import java.util.*;

public class Solution {
    public int braces(String A) {
        Stack<Character> stack = new Stack<Character>();
        int i,n;
        n=A.length();
        boolean flag = false;
        for(i=0;i<n;i++)
        {
            char ch = A.charAt(i);
            if(ch==')')
            {
                char top = stack.pop();
                flag=true;
                while(top!='(')
                {
                    if(top=='+'||top=='-'||top=='*'||top=='/')
                    flag=false;
                    top = stack.pop();
                }
                if(flag==true)
                return 1;
            }
            else
            {
                stack.push(ch);
            }
        }
        return 0;
    }
}
