package checkout;

//File: Washer.java from the package edu.colorado.simulations
//Additional javadoc documentation is available from the Washer link at
//http://www.cs.colorado.edu/~main/docs/

/******************************************************************************
* An <CODE>Washer</CODE> simulates a simple washing machine.
*
* <dt><b>Java Source Code for this class:</b><dd>
*   <A HREF="../../../../edu/colorado/simulations/Washer.java">
*   http://www.cs.colorado.edu/~main/edu/colorado/simulations/Washer.java
*   </A>
*
* @author Michael Main 
*   <A HREF="mailto:main@colorado.edu"> (main@colorado.edu) </A>
*
* @version
*   Jun 12, 1998
******************************************************************************/
public class Checkout
{
private int itemsForCheckout; // Seconds for a single checkout
private int CheckoutTimeLeft;   // Seconds until this cashier is no longer busy

                 
/**
* Initialize a washer.
* param <CODE>s</CODE>
*   the number of seconds required for one wash cyle of this washer
* <dt><b>Postcondition:</b><dd>
*   This washer has been initialized so that it takes <CODE>s</CODE?
*   seconds to complete one wash cycle.
**/
public Checkout(int s)
{
  itemsForCheckout = s;
  CheckoutTimeLeft = 0;
}


/**
* Determine whether this washer is currently busy.
* @param - none
* @return
*   <CODE>true</CODE> if this washer is busy (in a wash cycle);
*   otherwise <CODE>false</CODE>
**/   
public boolean isBusy( )
{
 return (CheckoutTimeLeft > 0);
}


/**
* Reduce the remaining time in the current wash cycle by one second.
* @param - none
* <dt><b>Postcondition:</b><dd>
*   If a car is being washed, then the remaining time in the current
*   wash cycle has been reduced by one second.
**/
public void reduceRemainingTime( )
{
 if (CheckoutTimeLeft > 0)
    CheckoutTimeLeft--;
} 


/**
* Start a wash cycle going for this washer.
* @param - none
* <dt><b>Precondition:</b><dd>
*   <CODE>isBusy()</CODE> is <CODE>false</CODE>.
* <dt><b>Postcondition:</b><dd>
*   This washer has started simulating one wash cycle. Therefore, 
*   <CODE>isBusy()</CODE> will return <CODE>true</CODE> until the required
*   number of simulated seconds have passed.
* @exception IllegalStateException
*   Indicates that this washer is busy.
**/
public void startCheckout( )
{
 if (CheckoutTimeLeft > 0)
    throw new IllegalStateException("Cashier is already busy.");
 CheckoutTimeLeft = itemsForCheckout;
}

}