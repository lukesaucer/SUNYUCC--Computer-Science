package orderedbinarytree;

public class Main {

	public static void main(String[] args) {
		 BTNode<Integer> root = new BTNode<Integer>(8, null, null);
		 BTNode<Integer> three = new BTNode<Integer>(3, null, null);
		 BTNode<Integer> ten = new BTNode<Integer>(10, null, null);
		 root.setLeft(three);
		 root.setRight(ten);
		 BTNode<Integer> one = new BTNode<Integer>(1, null, null);
		 BTNode<Integer> six = new BTNode<Integer>(6, null, null);
		 three.setLeft(one);
		 three.setRight(six);
		 BTNode<Integer> four = new BTNode<Integer>(4, null, null);
		 BTNode<Integer> seven = new BTNode<Integer>(7, null, null);
		 six.setLeft(four);
		 six.setRight(seven);
		 BTNode<Integer> fourteen = new BTNode<Integer>(14, null, null);
		 BTNode<Integer> thirteen = new BTNode<Integer>(13, null, null);
		 ten.setRight(fourteen);
		 fourteen.setLeft(thirteen);
		 System.out.println("Preorder Print");
		 root.preorderPrint();
		 System.out.println();
		 System.out.println();
		 System.out.println("Inorder Print");
		 root.inorderPrint();
		 System.out.println();
		 System.out.println();
		 System.out.println("Postorder Print");
		 root.postorderPrint();
	}
}
