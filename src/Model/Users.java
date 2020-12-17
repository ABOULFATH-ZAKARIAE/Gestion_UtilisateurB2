package Model;

import java.util.ArrayList;

public class Users extends Personne {
	
	private String login;
	private String password;
	private String service;

	
	public Users() {
		
	}
	public Users( String Matricule, String First_Name, String Last_Name, String Email, int Phone, double Salaire, String login, String password, String service) {
		super (Matricule,First_Name,Last_Name,Email,Phone,Salaire);
		this.login = login;
		this.password = password;
		this.service = service;
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
	
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	
	// Affiche
	
	@Override
	
	
	public String toString() {
		return "[" + super.toString() + "\n \t Login    : " + this.login + "\n \t Password : " + this.password + "\n \t Service   : " + this.service +"]";
	}
	
	
	//Calcul
	
	public void calculerSalaire(ArrayList<Users> users,String Matricule) {
		
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getMatricule() == Matricule) {
				
				if (users.get(i).getService() == "MN") {
					
					double Salaire = users.get(i).getSalaire();
					double augmentation;
					
					augmentation = (Salaire*8)/100;
					users.get(i).setSalaire(augmentation + Salaire);
					System.out.println("Salaire initial : " + Salaire + " Augmentation : " + augmentation + " New Salaire : " + (augmentation + Salaire) );
					
					
				}else if (users.get(i).getService() == "DG") {
					
					double Salaire = users.get(i).getSalaire();
					double augmentation;
					
					augmentation = (Salaire*15)/100;
					
					users.get(i).setSalaire(augmentation  + Salaire);
					System.out.println("Salaire initial : " + Salaire + " Augmentation : " + augmentation + " New Salaire : " + (augmentation + Salaire) );
				}
			}
		}
	}
	
	//creation des utilisateurs
	
	public static void AddUser(Users users,ArrayList<Users> user) {
		
		try {
			user.add(users);
			System.out.println("\n ajoute Utilisateur avec succes");
		}catch (Exception e) {
		      System.out.println(e);
		}
	}
	
	//filtrage des utilisateurs
	
	public  void FiltrageListManager(ArrayList<Users> users,String service) {
		int cnt = 0;
		for(int j=0;j<users.size();j++) {
			if(users.get(j).getService() == service) {
				System.out.println(" \n \t ---------------- \n \t Matricule    : " + users.get(j).getMatricule() + "\n \t NOM          : " + users.get(j).getFirst_Name() + "\n \t PRENOM       : " + users.get(j).getLast_Name() + "\n \t EMAIL        : "  + users.get(j).getEmail() + "\n \t TELEPHONE    : "  + users.get(j).getPhone() + "\n \t SALAIRE      : "  + users.get(j).getSalaire() + "\n \t LOGIN        : "  + users.get(j).getLogin() + "\n \t Mot De Passe : "  + users.get(j).getPassword() + "\n \t Service      : "  + users.get(j).getService()  );
				cnt ++;
			}
		}
		if(cnt == 0) {
			//System.out.println(" \n \t HAHAHAHAHA PAS DES MANAGERES (^_^)! ");
			System.out.println(" \n \t List des " +service+ " est vide (^_^)! ");

		}
		
	}

	

}
