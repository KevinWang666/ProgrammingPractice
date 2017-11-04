package tree;

import java.util.Random;

public class BinaryTree {

	public static void main(String[] args) {
		
		Random r = new Random();
		Tree t = new Tree();
		int a;
		while (t.size < 10) {
			a = r.nextInt(100);
			System.out.println(a);
			t.add(a);
		}
		System.out.println("二叉树根节点：");
		System.out.println(t);
		System.out.println("遍历二叉树：");

		t.show(t.root);
	}

}

class Node {
	public int num;
	public Node left = null;
	public Node right = null;

	public Node(int num) {
		super();
		this.num = num;
	}

	@Override
	public String toString() {
		return "Node [num=" + num + "]";
	}

}

class Tree {
	public int num;
	public Node root;
	public int size;

	public Tree() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tree(Node root) {
		super();
		this.root = root;
	}

	public void add(int num) {

		Node parent;
		if (root == null) {// 根节点为空，直接添加
			root = new Node(num);
			size++;
		} else {
			parent = root;
			// parent.num = num;
			while (true) {
				if (num > parent.num) {
					if (parent.right == null) {
						parent.right = new Node(num);
						size++;
						return;
					} else {
						parent = parent.right;
					}
				} else if (num < parent.num) {
					if (parent.left == null) {
						parent.left = new Node(num);
						size++;
						return;
					} else {
						parent = parent.left;
					}
				} else {// 等于根节点，不添加
					return;
				}
			}
		}
	}
	
	/* public int delete(int num){
		return;
	  }
	*/

	public void show(Node n) {
		if (n.left != null) {
			show(n.left);
		}
		System.out.println(n.num);
		if (n.right != null) {
			show(n.right);
		} else {
			return;
		}

	}

	@Override
	public String toString() {
		return "Tree [root=" + root + "]";
	}

}