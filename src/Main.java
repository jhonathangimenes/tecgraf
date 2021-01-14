import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import repository.Matriculation;

public class Main {

	public static void main(String[] args) {

		Scanner in;

		System.out.println("Quest�o 1:");

		try {
			in = Matriculation.getMatriculation("matriculasSemDV");

			try {
				Matriculation.setMatriculationHex(in);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("\nQuest�o 2:");

		try {
			in = Matriculation.getMatriculation("matriculasParaVerificar");

			try {
				Matriculation.setMatriculationHexComparation(in);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
