package midtermproject;

public class BTree {

	public static void main(String[] args) {
		//Build left subtree
		BTNode<Integer> leftChild = new BTNode<Integer>(1, null, null);
		BTNode<Integer> rightChild = new BTNode<Integer>(3, null, null);
		BTNode<Integer> leftParent = new BTNode<Integer>(2, leftChild, rightChild);		
		
		//Build right subtree
		leftChild = new BTNode<Integer>(13, null, null);	
		rightChild =  new BTNode<Integer>(34, null, null);	
		BTNode<Integer> rightParent = new BTNode<Integer>(21, leftChild, rightChild);
		
		//Attach both subtrees to root
		BTNode<Integer>root = new BTNode<Integer>(5, leftParent, rightParent);
		
		//Print Binary Search Tree
		System.out.println("Printing contents of binary search tree using in-order traversal:");
		root.inorderPrint(); 
		System.out.println();

	}
}