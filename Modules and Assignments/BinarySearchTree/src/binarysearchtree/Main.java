package binarysearchtree;

/**
 * Code does not work as is intended.
 * 
 * @author Lucas Saucer
 * @since 11/09/2021
 * @version 1.0
 * 
 * This program creates a binary search tree that can be traversed and have a key that searches for
 * a special value within the tree and returns if that value is present. If that value is not present,
 * it will return the next closest node to the key.
 *
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// root
		BTNode<Integer> root = new BTNode<Integer>(8, null, null);
		
		//leftSubtree
		BTNode<Integer> child1 = new BTNode<Integer>(3, null, null);
		child1.setLeft(new BTNode<Integer>(1, null, null));
		root.setLeft(child1);
		
		BTNode<Integer> child4 = new BTNode<Integer>(6, null, null);
		child4.setLeft(new BTNode<Integer>(4, null, null));
		child4.setRight(new BTNode<Integer>(7, null, null));
		child1.setRight(child4);
		
		//rightSubtree
		BTNode<Integer> child7 = new BTNode<Integer>(10, null, null);
		root.setRight(child7);
		
		BTNode<Integer> child8 = new BTNode<Integer>(14, null, null);
		child8.setLeft(new BTNode<Integer>(13, null, null));
		
		
	        //print the BST
	        System.out.println("The BST Created with input data(Left-root-right):"); 
	        root.inorderPrint(); 
	        System.out.println(" ");
	        System.out.println(" ");
	        System.out.println(" ");
	        root.preorderPrint();
	        System.out.println(" ");
	        System.out.println(" ");
	        System.out.println(" ");
	        root.postorderPrint();
	        System.out.println(" ");
	        System.out.println(" ");
	        System.out.println(" ");
	        BTNode<Integer> returnValue = root.search(10);
	        System.out.println("\nKey 3 found in Binary Search Tree: " + returnValue );

	     } 
	}


