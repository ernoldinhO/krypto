package krypto;

import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import krypto.uruchom;

public class deszyfer {
	 public static List<String> getAllCombinations() {

	        List<String> toReturn = new ArrayList<>();

	        for (int i = 0; i <= 255; i++) {
	            toReturn.add(Integer.toString(i, 2));
	        }

	        return toReturn;

	    }
	 static List<String> Klucze = getAllCombinations();	 
}
