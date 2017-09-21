/**
 * CS 2003 - Lab 2
 * Program that reads names from a file and arranges the
 * names into a seating chart using a two-dimensional array.
 * @author Josh Esau
 * @since 2017-09-05
 * @version 0.5
 */

package Lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SeatMap {
	
	/** Defines the current column in the seat map*/
	int col = 0;
	/** Defines the current row in the seat map*/
	int row = 0;
	/** Initialize String array for names and seat positions*/
	static String[][] seatArray; 
	
	/** readFile method iterates through specified file and saves
	 * names to defined position in the array*/
	public void readFile() {
		File names = new File("names.dat");
		try {
			Scanner input = new Scanner(names);
			while (input.next() != null) {
				for (col = 0; col <= 5; col++){
					seatArray [col] [row] = input.next();
					col++;
				}
				row++;
			}
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File Not Found");
			e.printStackTrace();
		}

	}
	/**main method calls seat map and initializes readFile method
	 * the final line is for debugging purposes as the program is not complete
	 * I was attempting to print a specific name from a specific position
	 * to verify that the program was working correctly so far
	 * 
	 * I was encountering a null pointer exception in my array was in the process
	 * of troubleshooting the error when I ran out of time.
	 */
	public static void main(String[] args) {
		SeatMap blah = new SeatMap();
		blah.readFile();
		System.out.println(seatArray[4][2]);
		
	}

}
