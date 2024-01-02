package midtermprojectcsciii;

/**
 * 
 * @author Lucas Saucer
 * @since 11/16/2021
 * @version 1.0
 * 
 * This program creates a Binary Tree, adds values to it, then prints out an in-order search
 * of the tree.
 * 
 */

public class BTree {


	public static void main(String[] args) {
		
/**
 * @param leftParent
 * 		- Creates the Level One Node in the BST on the Left Side of the Root Node.
 * @param leftChild
 * 		- Creates the Level Two Node in the BST on the Left Side of the Level One Node.
 * @param rightChild
 * 		- Creates the Level Two Node in the BST on the Right Side of the Level One Node.
 * @param levelThreeRightChild
 * 		- Creates the Level Three Node in the BST on the Right Side of the Level Two Node.
 * @param levelThreeLeftChild
 * 		- Creates the Level Three Node in the BST on the Left Side of the Level Two Node.
 * @param levelFourLeftChild
 * 		- Creates the Level Four Node in the BST on the Left Side of the Level Three Node.
 */
		//Build left subtree
		BTNode<Integer> levelFourLeftChild = new BTNode<Integer>(1, null, null);
		BTNode<Integer> levelThreeLeftChild = new BTNode<Integer>(2, levelFourLeftChild, null);
		BTNode<Integer> levelThreeRightChild = new BTNode<Integer>(4, null, null);
		BTNode<Integer> leftChild = new BTNode<Integer>(3, levelThreeLeftChild, levelThreeRightChild);
		BTNode<Integer> rightChild = new BTNode<Integer>(11, null, null);
		BTNode<Integer> leftParent = new BTNode<Integer>(5, leftChild, rightChild);	

/**
 * @param rightParent
 * 		- Creates the Level One Node in the BST on the Left Side of the Root Node.
 * @param rightChild
 * 		- Creates the Level Two Right Node in the BST to the right side of the Level One Node.
 * @param leftChild
 * 		- Creates the Level Two Left Node in the BST to the left side of the Level One Node.
 * 		
 */
		//Build right subtree
		leftChild = new BTNode<Integer>(21, null, null);
		rightChild =  new BTNode<Integer>(34, null, null);
		BTNode<Integer> rightParent = new BTNode<Integer>(22, leftChild, rightChild);

/**
 * @param root
 * 		- Creates the Root Node in the BST.		
 */
		//Attach both subtrees to root
		BTNode<Integer>root = new BTNode<Integer>(13, leftParent, rightParent);
		
		
/**
 * {@link inorderPrint()}
 * 		- Method used to traverse the binary search tree and print the results as an in-order traversal.		
 */
		//Print Binary Search Tree
		System.out.println("Printing contents of binary search tree using in-order traversal:");
		root.inorderPrint(); 
		System.out.println();
		
		
		
		//Original code from first binary tree.
		//BTNode<Integer> leftChild = new BTNode<Integer>(1, null, null);
		//BTNode<Integer> rightChild = new BTNode<Integer>(3, null, null);
		//BTNode<Integer> leftParent = new BTNode<Integer>(2, leftChild, rightChild);		
		//leftChild = new BTNode<Integer>(13, null, null);
		//rightChild =  new BTNode<Integer>(34, null, null);
		//BTNode<Integer> rightParent = new BTNode<Integer>(21, leftChild, rightChild);
		//BTNode<Integer>root = new BTNode<Integer>(5, leftParent, rightParent);
	}
}
