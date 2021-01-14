

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Matriculation {
	
	public static Scanner getMatriculation(String file) throws FileNotFoundException {
		Scanner in;
		
		in = new Scanner(new FileReader(file + ".txt"));
		
		return in;
	}
	
	public static void setMatriculationHex(Scanner in) throws IOException {
		FileWriter file;
		
		file = new FileWriter("matriculasComDV.txt");
	    PrintWriter gravarArq = new PrintWriter(file);
	    
		while (in.hasNextLine()) {
		    String cod = in.nextLine();

			String hexadecimal = Calculations.calculateHexdecimal(cod);
			
			System.out.println(cod + "-" + hexadecimal);
			gravarArq.printf(cod + "-" + hexadecimal + "\n");
		}
		
		file.close();
	}
	
	public static void setMatriculationHexComparation(Scanner in) throws IOException {
		FileWriter file;
		
		file = new FileWriter("matriculasVerificadas.txt");
		
	    PrintWriter gravarArq = new PrintWriter(file);
	
		while (in.hasNextLine()) {
		    String cod = in.nextLine();
		    
			String hexadecimal = Calculations.calculateHexdecimal(cod);
			
			String possiblyHexadecimal = Character.toString(cod.charAt(5));
			
			if(possiblyHexadecimal.equalsIgnoreCase(hexadecimal)) {
				System.out.println(cod +" Verdadeiro");
				gravarArq.printf(cod +" Verdadeiro\n");
			} else {
				System.out.println(cod +" Falso");
				gravarArq.printf(cod +" Falso\n");
			}
		}
		
		file.close();
	}
}
