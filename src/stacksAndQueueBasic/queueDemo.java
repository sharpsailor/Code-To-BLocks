package stacksAndQueueBasic;
import java.util.*;
public class queueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(10);//10
		queue.add(20);//10,20
		queue.add(30);//10,20,30
		System.out.println(queue);//10,20,30
		System.out.println(queue.peek());//10->10,20,30
		queue.remove();//20,30
		System.out.println(queue);//20,30
		System.out.println(queue.peek());//20->20,30
		queue.remove();//30
		System.out.println(queue);//30
		System.out.println(queue.peek());//30->30
		queue.remove();//empty
		
		
	}

}
