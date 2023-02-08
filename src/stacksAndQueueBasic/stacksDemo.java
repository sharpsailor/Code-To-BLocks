package stacksAndQueueBasic;
import java.util.*;
public class stacksDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		stack.push(10);//10
		stack.push(20);//10,20
		stack.push(30);//10,20,30
		stack.push(40);//10,20,30,40
		System.out.println(stack.peek());//40
		stack.pop();//10,20,30
		System.out.println(stack.peek());//30
		stack.pop();//10,20
		System.out.println(stack.peek());//20
		stack.pop();//10
		System.out.println(stack.peek());//10
		stack.pop();//
		System.out.println(stack.peek());//error
		stack.pop();//error
		
	}

}
