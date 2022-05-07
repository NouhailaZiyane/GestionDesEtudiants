package User;
import Dao.etudiant;
import controle.baseD;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;



import java.io.*;



public class test
{

	public static void main(String[] args) {
		String nom,prenom,filiere;
		baseD t= new baseD();
		Scanner s= new Scanner(System.in);
		etudiant e=new etudiant("Nouhaila","Ziyane","Genie Informatique");
		Connection con=t.connexion();
		//t.insertion(con, e);
		System.out.print("Vous voulez:\n1-selectionner les informations d'un etudiant\n2-inserer les infos d un etudiant\n3-faire une mise a jour des infos d un etudiant");
		int i=s.nextInt();
		switch(i) {
		case 1: t.selection(con);
			break;
			
		case 2: 
			Scanner scan=new Scanner(System.in);
			System.out.println("entrez votre nom");
		    nom=s.next();
		    System.out.println("entrez votre prenom");
		    prenom=s.next();
		    System.out.println("entrez la filiere");
		    filiere=s.next();
			etudiant e1=new etudiant(prenom,nom,filiere);
			t.insertion(con, e1);
			break;
		case 3: 
			
			System.out.println("entrez le nouveau nom");
		    String nom1=s.next();
		    e.setNom(nom1);
			t.modification(con, e);
			break;
		}

	}

}
