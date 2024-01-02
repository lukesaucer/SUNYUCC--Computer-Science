package animaltree;

/**
 * @author - Lucas Saucer
 * @since 11/08/2021
 * @version 1.0
 * 
 * This program uses a binary tree to create an animal guessing game that can learn from
 * the results of each previous game as the game runs.
 */
//FILE: AnimalGuess.java
//This animal-guessing program illustrates the use of the binary tree node class.

import java.util.Scanner;

/******************************************************************************
* The <CODE>AnimalGuess</CODE> Java application illustrates the use of
* the binary tree node class is a small animal-guessing game.
*
* <p><dt><b>Java Source Code for this class:</b><dd>
*   <A HREF="../applications/Animals.java">
*   http://www.cs.colorado.edu/~main/applications/Animals.java
*   </A>
*
* @author Michael Main 
*   <A HREF="mailto:main@colorado.edu"> (main@colorado.edu) </A>
*
* @version
*   Jul 22, 2005
******************************************************************************/
public class AnimalGuess
{
private static Scanner stdin = new Scanner(System.in);

/**
* The main method prints instructions and repeatedly plays the 
* animal-guessing game. As the game is played, the taxonomy tree
* grows by learning new animals. The <CODE>String</CODE> argument
* (<CODE>args</CODE>) is not used in this implementation.
**/
public static void main(String[ ] args)
{
   BTNode<String> root;

   instruct( );
   root = beginningTree( );
   do
      play(root);
   while (query("Shall we play again?"));

   System.out.println("Thanks for teaching me a thing or two.");
}


/**
* Print instructions for the animal-guessing game.
**/
public static void instruct( )
{
   System.out.println("Please think of an animal.");
   System.out.println("I will ask some yes/no questions to try to figure");
   System.out.println("out what you are.");
}


/**
* Play one round of the animal guessing game.
* @param <CODE>current</CODE>
*   a reference to the root node of a binary taxonomy tree that will be
*   used to play the game.
* <dt><b>Postcondition:</b><dd>
*   The method has played one round of the game, and possibly
*   added new information about a new animal.
* @exception java.lang.OutOfMemoryError
*   Indicates that there is insufficient memory to add new
*   information to the tree.
**/
public static void play(BTNode<String> current)
{
   while (!current.isLeaf( ))
   {
      if (query(current.getData( )))
         current = current.getLeft( );
      else
         current = current.getRight( );
   }

   System.out.print("My guess is " + current.getData( ) + ". ");
   if (!query("Am I right?"))
      learn(current);
   else
      System.out.println("I knew it all along!");
}


/**
* Construct a small taxonomy tree with four animals.
* @param - none
* @return
*   a reference to the root of a taxonomy tree with the animals:
*   kangaroo, mouse, trout, robin.
* @exception OutOfMemoryError
*   Indicates that there is insufficient memory to create the tree.
**/
public static BTNode<String> beginningTree( )   
{
   BTNode<String> root;
   BTNode<String> child;
   BTNode<String> child2;
   BTNode<String> child3 = null;
   BTNode<String> child4 = null;
   BTNode<String> child5 = null;

   final String ROOT_QUESTION = "Are you a mammal?";
   final String LEFT_QUESTION = "Are you bigger than a cat?";
   final String RIGHT_QUESTION = "Do you live underwater?";
   final String LEFT_QUESTION2 = "Are you a marsupial?";
   final String RIGHT_QUESTION2 = "Are you a vertebrate?";
   final String RIGHT_QUESTION3 = "Can you fly?";
  
   final String ANIMAL1 = "Kangaroo";
   final String ANIMAL2 = "Mouse";
   final String ANIMAL3 = "Trout";
   final String ANIMAL4 = "Robin";
   final String ANIMAL5 = "Raccoon";
   final String ANIMAL6 = "Squid";
   final String ANIMAL7 = "Snake";
   
   // Create the root node with the question ìAre you a mammal?î
   root = new BTNode<String>(ROOT_QUESTION, null, null);

   // Create and attach the left subtree.
   child = new BTNode<String>(LEFT_QUESTION, child3, null);
   child.setRight(new BTNode<String>(ANIMAL2, null, null));
   root.setLeft(child);
   
   child3 = new BTNode<String>(LEFT_QUESTION2, null, null);
   child3.setLeft(new BTNode<String>(ANIMAL1,  null, null));
   child3.setRight(new BTNode<String>(ANIMAL5, null, null));
   child.setLeft(child3);

   // Create and attach the right subtree.
   child2 = new BTNode<String>(RIGHT_QUESTION, child4, child5);
   root.setRight(child2);

   child4 = new BTNode<String>(RIGHT_QUESTION2, null, null);
   child4.setLeft(new BTNode<String>(ANIMAL3,null,null));
   child4.setRight(new BTNode<String>(ANIMAL6,null,null));
   child2.setLeft(child4);
   
   child5 = new BTNode<String>(RIGHT_QUESTION3, null, null);
   child5.setLeft(new BTNode<String>(ANIMAL4, null, null));
   child5.setRight(new BTNode<String>(ANIMAL7, null, null));
   child2.setRight(child5);
   
   return root;
}





/**
* Elicits information from the user to improve a binary taxonomy tree.
* @param <CODE>current</CODE>
*   a reference to a leaf node of a binary taxonomy tree
* <dt><b>Precondition:</b><dd>
*   <CODE>current</CODE> is a reference to a leaf in a binary
*   taxonomy tree
* <dt><b>Postcondition:</b><dd>
*   Information has been elicited from the user, and the tree has
*   been improved.
* @exception OutOfMemoryError
*   Indicates that there is insufficient memory to add new
*   information to the tree. 
**/
public static void learn(BTNode<String> current)
// Precondition: current is a reference to a leaf in a taxonomy tree. This
// leaf contains a wrong guess that was just made.
// Postcondition: Information has been elicited from the user, and the tree
// has been improved.
{
   String guessAnimal;   // The animal that was just guessed
   String correctAnimal; // The animal that the user was thinking of
   String newQuestion;   // A question to distinguish the two animals
   
   // Set Strings for the guessed animal, correct animal and a new question.
   guessAnimal = current.getData( );
   System.out.println("I give up. What are you? ");
   correctAnimal = stdin.nextLine( );
   System.out.println("Please type a yes/no question that will distinguish a");
   System.out.println(correctAnimal + " from a " + guessAnimal + ".");
   newQuestion = stdin.nextLine( );
   
   // Put the new question in the current node, and add two new children.
   current.setData(newQuestion);
   System.out.println("As a " + correctAnimal + ", " + newQuestion);
   if (query("Please answer"))
   {
      current.setLeft(new BTNode<String>(correctAnimal, null, null));
      current.setRight(new BTNode<String>(guessAnimal, null, null));
   }
   else
   {
      current.setLeft(new BTNode<String>(guessAnimal, null, null));
      current.setRight(new BTNode<String>(correctAnimal, null, null));
   }         
}

public static boolean query(String prompt)
{
   String answer;
	
   System.out.print(prompt + " [Y or N]: ");
   answer = stdin.nextLine( ).toUpperCase( );
   while (!answer.startsWith("Y") && !answer.startsWith("N"))
   {
	 System.out.print("Invalid response. Please type Y or N: ");
	 answer = stdin.nextLine( ).toUpperCase( );
   }

   return answer.startsWith("Y");
}

}




