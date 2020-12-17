package Model;

public class Personne {
	
	private String Matricule;
	private String First_Name;
	private String Last_Name;
	private String Email;
	private int Phone;
	private double Salaire;
	
	
	public String getMatricule() {
		return Matricule;
	}
	public void setMatricule(String Matricule) {
		this.Matricule = Matricule;
	}
	
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String First_Name) {
		this.First_Name = First_Name;
	}
	
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String Last_Name) {
		this.Last_Name = Last_Name;
	}
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int Phone) {
		this.Phone = Phone;
	}
	
	public double getSalaire() {
		return Salaire;
	}
	public void setSalaire(double Salaire) {
		this.Salaire = Salaire;
	}
	
	public Personne() {
		
	}
	
	public Personne (String Matricule, String First_Name, String Last_Name, String Email, int Phone, double Salaire) {
		this.Matricule = Matricule;
		this.First_Name = First_Name;
		this.Last_Name = Last_Name;
		this.Email = Email;
		this.Phone = Phone;
		this.Salaire = Salaire;
	}
	
	public String toString() {
		return "Personne [id=" + Matricule +", First_Name=" + First_Name + ", Last_Name=" + Last_Name + ", Email=" + Email + ", Phone=" + Phone + ", Salaire=" + Salaire + "]\n";
	}
	
	
	
	

}
