package org.selva.transferwise;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BSTValidate {

	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner in = new Scanner(System.in);
		int tot = Integer.parseInt(in.nextLine());

		for (int i = 0; i < tot; i++) {

			int N = Integer.parseInt(in.nextLine());
			String s = in.nextLine();
			String sp[] = s.split(" ");
			BinarySearchTree bst = new BinarySearchTree();
			ArrayList currentList = new ArrayList();
			for (String m : sp) {
				bst.insert(Integer.parseInt(m));
				currentList.add(Integer.parseInt(m));
			}
			if (currentList.toString().equalsIgnoreCase(bst.printPreorder())) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
	}

	static class BinarySearchTree {
		public Node root;
		public ArrayList traverseList = new ArrayList();

		public BinarySearchTree insert(int value) {
			Node node = new Node(value);

			if (root == null) {
				root = node;
				return this;
			}

			insertRec(root, node);
			return this;
		}

		private void insertRec(Node latestRoot, Node node) {

			if (latestRoot.value > node.value) {

				if (latestRoot.left == null) {
					latestRoot.left = node;
					return;
				} else {
					insertRec(latestRoot.left, node);
				}
			} else {
				if (latestRoot.right == null) {
					latestRoot.right = node;
					return;
				} else {
					insertRec(latestRoot.right, node);
				}
			}
		}

		public String printPreorder() {
			printPreOrderRec(root);
			return traverseList.toString();
		}

		private void printPreOrderRec(Node currRoot) {
			if (currRoot == null) {
				return;
			}
			traverseList.add(currRoot.value);
			printPreOrderRec(currRoot.left);
			printPreOrderRec(currRoot.right);
		}

	}

	static class Node<T> {
		public int value;
		public Node left;
		public Node right;

		public Node(int value) {
			this.value = value;
		}
	}

}
