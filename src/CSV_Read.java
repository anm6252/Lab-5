import java.io.*;
import java.util.Scanner;
public class CSV_Read {

	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw = new FileWriter("input.csv");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);

		outFile.print("1,4,6,7,8 \n 2,3,1,5,6 \n 3,2,1,4,5");

		outFile.println();

	}

}
