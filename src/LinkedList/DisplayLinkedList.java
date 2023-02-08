package LinkedList;
import java.util.*;
import java.io.*;
public class DisplayLinkedList {

	public static class Node {
	    int data;
	    Node next;
	  }

	  public static class LinkedList {
	    Node head;
	    Node tail;
	    int size;

	    void addLast(int val) {
	      Node temp = new Node();
	      temp.data = val;
	      temp.next = null;

	      if (size == 0) {
	        head = tail = temp;
	      } else {
	        tail.next = temp;
	        tail = temp;
	      }

	      size++;
	    }

	    public int size(){
	      return size;
	    }

	    public void display(){
	      // write code here
	    	if(size==0) {
	    		return;
	    	}
	    	for(Node temp = head;temp!=null;temp = temp.next) {
	    		System.out.print(temp.data+" ");
	    	}
	    	System.out.println();
	    }
	  }

	  public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    LinkedList list = new LinkedList();
	    list.display();
	    list.addLast(10);
	    list.display();
	    list.addLast(20);
	    list.display();
	    list.addLast(30);
	    list.display();
	    System.out.println(list.size());
	  }

}
