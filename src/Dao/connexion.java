package Dao;

public class connexion {
	private static int id;
	private String login, password;
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		connexion.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public connexion() {
		id++;
	}
	@Override
	public String toString() {
		return "connexion [login=" + login + ", password=" + password + "]";
	}
	
}
