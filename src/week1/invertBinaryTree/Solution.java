package week1.invertBinaryTree;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

class Solution {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right = new TreeNode(7);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(9);
		System.out.println("Before inversion");
		printTree(root);
		System.out.println("\nAfter inversion");
		invertTree(root);
		printTree(root);
	}

	private static void printTree(TreeNode root) {
		if (root != null) {
			System.out.print(root.val + " ");
			printTree(root.left);
			printTree(root.right);
		}
	}

	public static TreeNode invertTree(TreeNode root) {
		TreeNode temp = new TreeNode();
		if (root == null) {
	        return null;
	    }
		temp = root.left;
		root.left = root.right;
		root.right = temp;
		invertTree(root.left);
		invertTree(root.right);
		return root;
	}
	
/*	public static TreeNode invertTree(TreeNode root) {
	    if (root == null) {
	        return null;
	    }
	    TreeNode right = invertTree(root.right);
	    TreeNode left = invertTree(root.left);
	    root.left = right;
	    root.right = left;
	    return root;
	}*/
}
