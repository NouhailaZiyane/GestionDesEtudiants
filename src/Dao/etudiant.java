package Dao;

public class etudiant {
	private static int id;
	private String prenom, nom, filiere;
	public etudiant() {
		id++;
		prenom="";
		nom="";
		filiere="";
	}
	public static int getId() {
		return id;
	}
	
	public etudiant(String prenom, String nom, String filiere) {
		id++;
		this.prenom = prenom;
		this.nom = nom;
		this.filiere = filiere;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	@Override
	public String toString() {
		return "etudiant [prenom=" + prenom + ", nom=" + nom + ", filiere=" + filiere + "]";
	}
	public void affiche() {
		System.out.println(this.toString());
	}

}
