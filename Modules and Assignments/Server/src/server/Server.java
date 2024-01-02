package server;

/**
 * This program creates a client class that attempts to connect to a local server and to process
 * the information from that server back to the client to be displayed.
 * <p>
 * @author Lucas Saucer and John Sheehan
 * @since 04/26/2021
 * @version 1.0
 */

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	private static ServerSocket server;
	private static Socket connection;
	private static ObjectInputStream input;
	private static ObjectOutputStream output;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			server = new ServerSocket(12345, 100); //create socket
	    
			while (true)
			{
				waitForConnection();
				getStreams();
				processConnection();
			}
		}
		catch (EOFException eofException)
			{
		    System.out.printf("\nServer terminated connection");
			}
		catch (IOException ioException)
		{
			ioException.printStackTrace();
		}
	}

/**
 * {@link waitForConnection()} method is used to accept a connection to the local server from an
 * external client.
 * @throws IOException
 */
	
	private static void waitForConnection() throws IOException
	{
		System.out.printf("Waiting for Connection");
		connection = server.accept();
		System.out.printf("Connection Received from %s\n",connection.getInetAddress().getHostName());
	}
/**
 * {@link getStreams()} method is used to receive connections to the server.
 * @throws IOException
 */
	private static void getStreams() throws IOException
	{
	   output = new ObjectOutputStream(connection.getOutputStream());
	   output.flush();
	   
	   System.out.printf("Message Received!\n");
	}
/**
 * {@link processConnection()} is used to process the input connection to the server.
 * @throws IOException
 */
	private static void processConnection() throws IOException
	{
	   String message = "Connection successful!";
	   input = new ObjectInputStream(connection.getInputStream());
    	do
    	{
    		try
    		{
    			message = (String) input.readObject();
    			System.out.printf("%s\n",message);
    		}
    		catch (ClassNotFoundException classNotFoundException)
    		{
    			System.out.printf("Unknown Message Type\n");
    		}
    	} while (!message.equals("CLIENT>>> TERMINATE:"));
	}
}