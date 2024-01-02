package towersofhanoi;

/**
 * 
 * @author Lucas Saucer and W3spoint.com
 * @since 10/26/2021
 * @version 1.0
 * 
 * Program replicates the Towers of Hanoi game using stacks.
 */


public class TowersOfHanoi {
    private static TowersOfHanoi[] tower; 
    private int stackSize;
    private int[] stackArray;
    private int top;
 
    /**
     * Constructor to create stack of the initial tower.
     * @param size
     * 		Size of the initial tower to be created.
     */
    public TowersOfHanoi(int size) {
        this.stackSize = size;
        this.stackArray = new int[stackSize];
        this.top = -1;
    }
 
    /**
     * Adds a new entry to the top of the stack.
     * @param entry
     * 		Pushes a new disk to the top of the tower stack.
     * @throws Exception 
     */
    public void push(int entry) throws Exception {
    	this.stackArray[++top] = entry;
    }
 
    /**
     * Removes an entry from the top of the stack.
     * @return
     * 		Returns the stack array minus the top disk.
     * @throws Exception 
     */
    public int pop() throws Exception {
        if(this.isStackEmpty()){
        	System.out.println("Stack underflow.");
        }
        return this.stackArray[top--];
    }
 
    /**
     * Returns top of the stack without removing it.
     * @return
     * 		Returns the top disk on the stack.
     */
    public int peek() {
        return stackArray[top];
    }
 
    /**
     * Returns true if the stack is empty
     * @return
     * 		Returns true if the stack is empty
     */
    public boolean isStackEmpty() {
        return (top == -1);
    }
 
    /**
     * Returns true if the stack is full
     * @return
     * 		Returns true if the stack is full
     */
    public boolean isStackFull() {
        return (top == stackSize - 1);
    }
    /**
     * Creates a new game of Towers of Hanoi.
     * @param n
     * 		How many disks to include in the game.
     * @throws Exception
     */
    public void towersOfHanoi(int n) throws Exception {    	 
        //Create three stacks, tower[0] is scratch
        tower = new TowersOfHanoi[4];
        for (int i = 0; i <= 3; i++){
            tower[i] = new TowersOfHanoi(4);
        }
        for (int d = n; d > 0; d--){
            //Initialize and add disk d to tower 1
            tower[1].push(d); 
        }
        //Move n disks from tower 1 to 2 using 3 as intermediate tower
        showTowerStates(n, 1, 2, 3);
    }
 /**
  * Method is used to print the status of the game.
  * 
  * @param n
  * 	Number of disks in the game.
  * @param x
  * 	Tower X
  * @param y
  * 	Tower Y
  * @param z
  * 	Tower Z
  */
    public void showTowerStates(int n, int x, int y, int z) {         
        if (n > 0) {
            try{
                showTowerStates(n - 1, x, z, y);
                //Move d from top of tower x to top of tower 
                Integer d = (Integer) tower[x].pop(); 
                tower[y].push(d); 
                System.out.println("Move disk " + d 
                        + " from tower "+ x + " to top of tower " + y);
                showTowerStates(n - 1, z, y, x);
            } catch(Exception e){
            	e.printStackTrace();
            }
        }
    }
 
	public static void main(String args[]){
		try {
			TowersOfHanoi test = new TowersOfHanoi(10);
			test.towersOfHanoi(3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

