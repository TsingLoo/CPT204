import java.util.Stack;

public class IsPopOrder {
    public boolean IsPopOrderMothod(int[] pushA, int[] popA)
    {
        Stack<Integer> s = new Stack<>();
        int n = pushA.length;
        int pushPointer = 0;


        //i 是用来遍历出栈数组的指针
        for(int i = 0; i< pushA.length;i++)
        {

            //只要辅助栈s不为空，或者其栈顶元素和当前出栈数组的元素不等，那就压入。
            while(pushPointer < n && (s.isEmpty() || s.peek() != popA[i])){
                s.push(pushA[pushPointer]);
                pushPointer++;
            }

            //如果是因为辅助栈s的栈顶元素和当前出栈数组的元素相等而跳出循环
            if(s.peek() == popA[i])

                //弹出辅助栈s栈顶元素，并且出栈元素向后移动一位
                s.pop();
                //不匹配序列
            else
                return false;
        }
        return true;

    }
}
