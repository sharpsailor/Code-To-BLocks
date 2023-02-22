package Binarytree;
import java.util.*;
public class BinaryTree{
	public static class Node{
		int data;
		Node left;
		Node right;
	}
	public static class Pair{
		Node node;
		int state;
	}
	public static Node construct(Integer[]arr) {
		Stack<Pair> stack = new Stack<>();
		Node root = new Node();
		root.data = arr[0];
		Pair rootp = new Pair();
		rootp.node = root;
		rootp.state = 1;
		stack.push(rootp);
		int idx = 1;
		while(stack.size()>0) {
			Pair peekp = stack.peek();
			if(peekp.state==1) {
				if(arr[idx]!=null) {
					Node lc = new Node();
					lc.data=arr[idx];
					peekp.node.left =lc;
					Pair lp = new Pair();
					lp.node= lc;
					lp.state=1;
					stack.push(lp);
				}
				peekp.state++;
				idx++;
			}
			else if(peekp.state==2) {
				if(arr[idx]!=null) {
					Node rc = new Node();
					rc.data=arr[idx];
					peekp.node.right =rc;
					Pair rp = new Pair();
					rp.node= rc;
					rp.state=1;
					stack.push(rp);
				}
				peekp.state++;
				idx++;
			}else if(peekp.state ==3) {
				stack.pop();
			}
		}
		return root;
	}
	public static void display(Node node) {
		if(node==null) {
			return;
		}
	   	String str = "<-"+node.data+"->";
	   	String lcstr =node.left==null?".":node.left.data+"";
	   	String rcstr =node.right==null?".":node.right.data+"";
	   	System.out.println(lcstr+str+rcstr);
	   	display(node.left);
	   	display(node.right);
	}
	public static int sum(Node node) {
		if(node==null) {  
			return 0; 
		}
		int l =	sum(node.left);
		int r =	sum(node.right);
		return l+r+node.data;
	}
	public static int size(Node node) {
		if(node==null) {
			return 0;
		}
		int l = size(node.left);
		int r = size(node.right);
		return l+r+1;
	}
	public static int heightNodes(Node node) {
		if(node==null) {
			return 0;
		}
		int l = heightNodes(node.left);
		int r = heightNodes(node.right);
		return Math.max(l, r)+1;
	}
	public static int HeightEdges(Node node) {
		if(node== null) {
			return -1;
		}
		int lh = HeightEdges(node.left);
		int rh = HeightEdges(node.right);
		return Math.max(lh,rh)+1; // for edge we have added 1 
		//or we can go like this as well
		//return node==null?-1:Math.max(Height(node.left),Height(node.right))+1;
	}
	public static int Max(Node node) {
		if(node==null) {
			return Integer.MIN_VALUE;
		}
		int l = Max(node.left);
		int r = Max(node.right);
		return Math.max( Math.max(l, r),node.data);
		//return node==null?Integer.MIN_VALUE?Math.max( Math.max(Max(node.left), Max(node.right)),node.data);
	}
	public static void main(String[]args) {
		 Integer[] arr =new Integer[] {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
		 Node root = construct(arr);
		 display(root);
		 System.out.println(sum(root));
		 System.out.println(heightNodes(root));
		 System.out.println(size(root));
		 System.out.println(Max(root));
	}
}
