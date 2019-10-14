package biomatters;

class Node {
	// starting code left these public, which makes code a bit simpler
	public int value;
	public Node left, right;

	public Node(int value, Node left, Node right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
}

public class BinarySearchTree {
	public static boolean contains(Node root, int value) {
		if (root.value == value) {
			return true;
		} else if (root.value < value) {
			// value we are searching for is greater than that held by node we are at
			if (root.right != null) {
				return contains(root.right, value);
			} else {
				return false;
			}
		} else {
			// value we are searching for is greater than that held by node we are at
			if (root.left != null) {
				return contains(root.left, value);
			} else {
				return false;
			}

		}
	}

	public static void main(String[] args) {
		Node n1 = new Node(1, null, null);
		Node n3 = new Node(3, null, null);
		Node n2 = new Node(2, n1, n3);

		System.out.println(contains(n2, 3));
	}
}
