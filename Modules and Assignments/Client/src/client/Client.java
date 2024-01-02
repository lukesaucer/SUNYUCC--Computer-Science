package client;

/**
 * This program creates a client class that attempts to connect to a local server and to process
 * the information from that server back to the client to be displayed.
 * <p>
 * @author Lucas Saucer and John Sheehan
 * @since 04/26/2021
 * @version 1.0
 */

import java.io.*;
import java.net.*;

public class Client {
	
	private static Socket client;
	private static ObjectInputStream input;
	private static ObjectOutputStream output;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		connectToServer();
		sendData();
		processConnection();
		client.close();
		}
		catch (IOException ex) {
    		ex.printStackTrace();
    	}
	}

/**
 * {@link connectToSever()} method is used to connect the client to a local server.
 */
	
    public static void connectToServer() {
    	try {
    	//client = new Socket(InetAddress.getByName("localhost"), 12345);
        client = new Socket("127.0.0.1", 12345);
    	}
    	catch (IOException ex) {
    		ex.printStackTrace();
    	}
    }
    
  /**
   * {@link sendData()} method is used to send data from the client to the local server.
   */
    
    public static void sendData()  {
    	// put any text we write on the network into a stream
    	try {
    	output = new ObjectOutputStream(client.getOutputStream());
    	output.writeObject("CLIENT: Hello World from Luke's Computer!");
    	output.flush(); // sends the message
    	}
    	catch (IOException ex) {
    		ex.printStackTrace();
    	}
    }
  
 /**
  * {@link processConnection()} method is used to process information going out from the client
  * to the server. 
  */
  
    public static void processConnection() {
    ;
    	try {
    	   input = new ObjectInputStream(client.getInputStream());
    	   String message = (String) input.readObject();
    	   System.out.printf("%s\n",message);
    	}
    	catch (IOException ex) {
    		ex.printStackTrace();
    	} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    	
}





