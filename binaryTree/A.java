package binaryTree;

class Node {
	int data;
	Node left;
	Node right ;
	Node(int data){
		this.data =  data;
	}
}

public class A {
	
	public static void main(String[]args) {
		Node n1 = new Node(10);
		Node n2 = new Node(100);
		Node n3 = new Node(101);
		Node n4 = new Node(105);
		Node n5 = new Node(109);
		
		n1.left = n2;
		n1.right =  n3;
		n2.left = n4;
		n2.right =  n5;
		
		System.out.println(n1.data);
		System.out.println(n1.left.data);
		System.out.println(n1.right.data);
		System.out.println(n1.left.left.data);
		System.out.println(n1.left.right.data);
	}

}
