package graph;

/**
 * @author Lucas Saucer
 * @since 12/10/2021
 * @version 1.0
 * 
 * This program is not completed and will not run as requested. I cannot figure out how to correctly
 * implement the isEdge() method.
 */

import java.util.Scanner;

public class Main {

	static final int NY = 1;
	static final int MIAMI = 2;
	static final int DALLAS = 3;
	static final int CHICAGO = 4;
	static final int DENVER = 5;
	static final int SD = 6;
	static final int LA = 7;
	static final int SF = 8;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Graph usa = new Graph(9);

		usa.addEdge(NY, MIAMI);
		usa.addEdge(NY, DALLAS);
		usa.addEdge(NY, CHICAGO);
		usa.addEdge(NY, DENVER);
		usa.addEdge(CHICAGO, DENVER);
		usa.addEdge(CHICAGO, SF);
		usa.addEdge(DENVER, SF);
		usa.addEdge(DENVER, LA);
		usa.addEdge(SF, LA);
		usa.addEdge(SD, LA);
		usa.addEdge(DALLAS, LA);
		usa.addEdge(DALLAS, SD);

		System.out.println("Enter Source City:");
		String sourceCity = input.nextLine();

		System.out.println("Enter Destination City:");
		String destinationCity = input.nextLine();
		
		usa.setLabel(NY, "New York");
		usa.setLabel(MIAMI, "Miami");
		usa.setLabel(CHICAGO, "Chicago");
		usa.setLabel(LA, "Los Angeles");
		usa.setLabel(DENVER, "Denver");
		usa.setLabel(SD, "San Diego");
		usa.setLabel(SF, "San Francisco");
		usa.setLabel(DALLAS, "Dallas");
		
		int sourceLabel = 0;
		int destinationLabel = 0;
		
		if (sourceCity.equals("New York")) {
			usa.getLabel(1);
		}

		if (sourceCity.equals("Miami")) {
			usa.getLabel(2);
		}

		if (sourceCity.equals("Dallas")) {
			usa.getLabel(3);
		}

		if (sourceCity.equals("Chicago")) {
			usa.getLabel(4);
		}

		if (sourceCity.equals("Denver")) {
			usa.getLabel(5);
		}

		if (sourceCity.equals("San Diego")) {
			usa.getLabel(6);
		}

		if (sourceCity.equals("Los Angeles")) {
			usa.getLabel(7);
		}

		if (sourceCity.equals("San Francisco")) {
			usa.getLabel(8);
		}

		if (destinationCity.equals("New York")) {
			usa.getLabel(1);
		}

		if (destinationCity.equals("Miami")) {
			usa.getLabel(2);
		}

		if (destinationCity.equals("Dallas")) {
			usa.getLabel(3);
		}

		if (destinationCity.equals("Chicago")) {
			usa.getLabel(4);
		}

		if (destinationCity.equals("Denver")) {
			usa.getLabel(5);
		}

		if (destinationCity.equals("San Diego")) {
			usa.getLabel(6);
		}

		if (destinationCity.equals("Los Angeles")) {
			usa.getLabel(7);
			return;
		}

		if (destinationCity.equals("San Francisco")) {
			usa.getLabel(8);
		}
		
		usa.isEdge(sourceLabel, destinationLabel);
	}
}
