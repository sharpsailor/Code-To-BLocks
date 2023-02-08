package GenericTree;
import java.util.*;
public class genericTree {
	public static class Node{
		int data;
		ArrayList<Node> children = new ArrayList<>();
		Node(int data ){
			this.data = data;
		}
	}
	
	public static void levelOrderDisplay(Node root) {
		Queue<Node> queue = new ArrayDeque<Node>();
		queue.add(root);
		while(queue.size()!=0) {
			//r,p,ac
			Node temp = queue.remove();
			System.out.print(temp.data+" ");
			for(Node child:temp.children) {
				queue.add(child);
			}
		}
		System.out.println(".");
	}
	public static void LevelOrderLinewise(Node root) {
		Queue<Node> queue = new ArrayDeque<Node>();
		Queue<Node> cqueue = new ArrayDeque<Node>();
		queue.add(root);
		while(queue.size()!=0) {
			//r,p,ac
			Node temp = queue.remove();
			System.out.println(temp.data+" ");
			for(Node child:temp.children) {
				queue.add(child);
			}
			if(queue.size()==0) {
				queue = cqueue;
				cqueue = new ArrayDeque<>();
				System.out.println(".");
			}
		}
	}
	public static void LevelOrderZigzag(Node root) {
		Queue<Node> queue = new ArrayDeque<>();
		Stack<Node> stack = new Stack<>();
		queue.add(root);
		while(queue.size()!=0) {
			Node temp = queue.remove();
			System.out.println(temp.data+" ");
			for(Node child:temp.children) {
				stack.add(child);
			}
			if(queue.size()==0) {
//				queue= stack;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		Node twenty = new Node(20);
		root.children.add(twenty);
		
		Node thirty = new Node(30);
		root.children.add(thirty);
		Node forty= new Node(40);
		root.children.add(forty);
		Node fifty = new Node(50);
		twenty.children.add(fifty);
		Node sixty = new Node(60);
		twenty.children.add(sixty);
		
		Node seventy = new Node(70);
		thirty.children.add(seventy);
		Node eighty = new Node(80);
		thirty.children.add(eighty);
		Node ninty = new Node(90);
		thirty.children.add(ninty);
		

		Node hundred = new Node(100);
		forty.children.add(hundred);


		Node hundredten = new Node(110);
		eighty.children.add(hundredten);
		
		Node hundredtwenty = new Node(120);
		eighty.children.add(hundredtwenty);
		levelOrderDisplay(root);
		LevelOrderLinewise(root);
	}

}
