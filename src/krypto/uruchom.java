package krypto;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import krypto.deszyfer;
public class uruchom {
	public static String[][] podwojna = new String[21][999];
	
	
	
	public static void main(String args[]) throws FileNotFoundException{
		int dobryKlucz=0;
		int j,a,wynik = 0;
		for(int b=0;b<=20;b++)
    	    wczytaj(b);
		System.out.println(deszyfer.Klucze);
		for(a=0;a<53;a++)
		{
			System.out.println("-------------"+a+"---------------");
		for(j=0;j<=255;j++)
		{
			dobryKlucz=0;	    	   
	    		for(int i=0;i<=20;i++){
	    	    //wczytaj(i);
	    	   int c = Integer.parseInt(podwojna[i][a], 2) ^ Integer.parseInt(deszyfer.Klucze.get(j), 2);  
	    	   if(i==0) wynik=c;
	    	   if(c == 44 || c==46 || c==32 || c==58|| c>=65 && c<=90 || c>=97 && c<=122)
	    	   dobryKlucz+=1;
	    	   if(dobryKlucz==20)
	    	   System.out.println((char)wynik);
	    	   }
	       }
		}
	}
	 public static void wczytaj(int numerSzyfru) throws FileNotFoundException { 
		 File file = new File("kod"+Integer.toString(numerSzyfru)+".txt");
	       Scanner in = new Scanner(file);	  
	       String zdanie = in.nextLine();
	       String[] kod = null;
	       kod = zdanie.split(" ");
	      podwojna[numerSzyfru]=kod;
	 }
}
