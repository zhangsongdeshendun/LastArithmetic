package algorithm;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class TwoStackReplaceQueue {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);

    }

    public int pop() {

        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }


        if(!stack2.empty())
            return stack2.pop();

        return -1;



    }

    public static void main(String[] args) {

        TwoStackReplaceQueue twoStackReplaceQueue=new TwoStackReplaceQueue();

        twoStackReplaceQueue.push(1);
        twoStackReplaceQueue.push(2);
        twoStackReplaceQueue.push(3);
        twoStackReplaceQueue.push(4);
        System.out.println(twoStackReplaceQueue.pop()+"");
        System.out.println(twoStackReplaceQueue.pop()+"");
        System.out.println(twoStackReplaceQueue.pop()+"");

        twoStackReplaceQueue.push(5);
        twoStackReplaceQueue.push(6);

        System.out.println(twoStackReplaceQueue.pop()+"");
        System.out.println(twoStackReplaceQueue.pop()+"");




    }
}
