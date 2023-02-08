package stacksAndQueueBasic;
import java.util.*;
public class StacksDemo2 {
	public static void main(String[]args) {
		Stack<String> stack = new Stack<>();
		stack.push("hello");//"hello'
		stack.push("Bye");//"hello","Bye"
		stack.push("Hi");//"hello","Bye","Hi"
		while(stack.size()>0) {
			String tos = stack.peek();
			System.out.println(tos);
			stack.pop();
		}
	}
}
