package controle;

import java.sql.*;

import Dao.etudiant;

public class baseD {
	public Connection connexion(){
	try {
	     Class c= Class.forName("com.mysql.cj.jdbc.Driver");
	     Driver pilote=(Driver)c.newInstance();
	     DriverManager.registerDriver(pilote);
	     String protocole="jdbc:mysql:";
	     String ip="localhost";
	     String port="3306";
	     String nomBase="Ecole";
	     String conString=protocole+"//"+ip+":"+port+"/"+nomBase;
	     String nomConnexion="root";
	     String motDePasse="";

	     Connection con = DriverManager.getConnection(conString, nomConnexion, motDePasse);
	     
	         return con;
	    } catch (Exception e) {
	      e.printStackTrace();
	      return null;
	    }    }
	
	
	// Methode pour la selection
	 public ResultSet selection(Connection con) {
		 try {
			 String sql="select * from etudiant";
	    	 Statement smt= con.createStatement();
		      ResultSet rs=smt.executeQuery(sql);
		      while(rs.next())
		      {
		      System.out.println(rs.getString("nom")+" "+rs.getString("prenom")+" "+rs.getString("filiere"));
		      }
		      return rs;
		      
		 }catch(Exception e) {
			 e.printStackTrace();
			 return null;
		 }
		 
     }
	 public ResultSet selectionn(Connection con) {
		 try {
			 String sql="select * from etudiant";
	    	 Statement smt= con.createStatement();
		      ResultSet rs=smt.executeQuery(sql);
		      
		      return rs;
		      
		 }catch(Exception e) {
			 e.printStackTrace();
			 return null;
		 }
		 
     }
	 public ResultSet selectionn1(Connection con, int id) {
		 try {
			 String sql="select * from etudiant where id="+id+"";
	    	 Statement smt= con.createStatement();
		      ResultSet rs=smt.executeQuery(sql);
		      
		      return rs;
		      
		 }catch(Exception e) {
			 e.printStackTrace();
			 return null;
		 }
		 
     }
	 
	 // methode pour l'insertion
	 public int insertion(Connection con,etudiant e) {
		 try {
			 String sql="INSERT INTO `etudiant`(`nom`,`prenom`,`filiere`) VALUES ('"+e.getNom()+"','"+e.getPrenom()+"','"+e.getFiliere()+"')";
			 Statement smt=con.createStatement();
			 int rs= smt.executeUpdate(sql);
			 return rs;
		 }catch(Exception e1) {
			 e1.printStackTrace();
			 return 0;
		 }}
		 
		 // methode de modification
		 public int modification(Connection con, etudiant e2) {
			 try {
				 String sql="UPDATE etudiant SET nom='"+e2.getNom()+"' where id="+e2.getId()+"";
				 Statement smt=con.createStatement();
				 int rs= smt.executeUpdate(sql);
				 return rs;
			 }catch(Exception ex) {
				 ex.printStackTrace();
				 return 0;
			 }
		 }
		 public int modification1(Connection con,String nom, int id) {
			 try {
				 String sql="UPDATE etudiant SET nom='"+nom+"' where id="+id+"";
				 Statement smt=con.createStatement();
				 int rs= smt.executeUpdate(sql);
				 return rs;
			 }catch(Exception ex) {
				 ex.printStackTrace();
				 return 0;
			 }
		 }
		 public ResultSet selection1(Connection con) {
			 try {
				 String sql="select * from connexion";
		    	 Statement smt= con.createStatement();
			      ResultSet rs=smt.executeQuery(sql);
			      return rs;
			      
			 }catch(Exception e) {
				 e.printStackTrace();
				 return null;
			 }
			 
	     }
		 
		          
		 
	 }
	

