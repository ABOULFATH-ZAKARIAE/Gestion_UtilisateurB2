package Main;
import java.util.ArrayList;
import java.util.Scanner;

import Model.Personne;
import Model.Profile;
import Model.Users;

public class Main {
	
	public static  void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//ArrayList<Personne> Persones = new ArrayList<Personne>();
		ArrayList<Users> users = new ArrayList<Users>();
		ArrayList<Profile> profiles = new ArrayList<Profile>();
		
		
		
		
		Users user = new Users();
		Profile profile = new Profile();
		
		String code, libelle, Matricule,First_Name,Last_Name,Email,login,password,service;
		int id,Phone;
		double salaire;
		
		code ="";
		libelle ="";
		Matricule ="";
		First_Name ="";
		Last_Name ="";
		Email ="";
		login ="";
		password ="";
		service ="";
		
		while (true) {
			System.out.println(" Créer des utilisateurs            : 1 \n Afficher les utilisateurs         : 2 \n Filtrer la liste des utilisateurs : 3");
			String method = scan.next();
			String choix = "";
			//String choix = "";
			switch (method) {
				case "1":
					System.out.println("Matricule de utilisateurs");
					Matricule = scan.next();
					System.out.println("Prenom de utilisateurs");
					First_Name = scan.next();
					System.out.println("Nom de utilisateurs");
					Last_Name = scan.next();
					System.out.println("Email de utilisateurs");
					Email = scan.next();					
					System.out.println("Téléphone de utilisateurs");
					Phone = scan.nextInt();
					System.out.println("Salaire de utilisateurs");
					salaire = scan.nextInt();
					System.out.println("Login de utilisateurs");
					login = scan.next();
					System.out.println("Mot de passe de utilisateurs");
					password = scan.next();
					System.out.println("service : \n "
							+ "\t --> Chef de projet                    : 1 \n "
							+ "\t --> Manager                           : 2 \n "
							+ "\t --> Directeur de projet               : 3 \n "
							+ "\t --> Directeur des ressources humaines : 4 \n "
							+ "\t --> Directeur général                 : 5");
					String method2 = scan.next();

					switch (method2) {
						case "1":
							//1
							code = "CP";
							libelle = "Chef de projet";
							Add_Profil_And_User( code, libelle, profiles, users, Matricule, First_Name, Last_Name, Email, Phone, salaire, login, password);
							break;
						case "2" :
							//2
							code = "MN";
							libelle = "Manager";
							Add_Profil_And_User( code, libelle, profiles, users, Matricule, First_Name, Last_Name, Email, Phone, salaire, login, password);							break;
						case "3":
							//3
							code = "DP";
							libelle = "Directeur de projet";
							Add_Profil_And_User( code, libelle, profiles, users, Matricule, First_Name, Last_Name, Email, Phone, salaire, login, password);							break;
						case "4" :
							//4
							code = "DRH";
							libelle = "Directeur des ressources humaines";
							Add_Profil_And_User( code, libelle, profiles, users, Matricule, First_Name, Last_Name, Email, Phone, salaire, login, password);							break;
						case "5":
							//3
							code = "DG";
							libelle = "Directeur général";
							Add_Profil_And_User( code, libelle, profiles, users, Matricule, First_Name, Last_Name, Email, Phone, salaire, login, password);							break;
							
						default:
					}
					break;
				case "2" :
					//Afficher des utilisateurs
					if (users.size() > 0) {
						System.out.println("les Utilisateur  : \n " + users);
					}else {
						System.out.println("Liste des Utilisateur  Vide ! \n");
					}
					break;
				case "3" :
					//Filtrage des Manager
					if (users.size() > 0) {
						//utilisateur.FiltrageListManager(ListUtilisateur);
						//start test
						System.out.println(" \n \t afficher la liste des Chef de projet (CP) -------------------->: 1"
										 + " \n \t afficher la liste des Managers  (MN) ------------------------->: 2 "
										 + " \n \t afficher la liste des Directeur de projet (DP) --------------->: 3 "
										 + " \n \t afficher la liste des Directeur des ressources humaines (DRH)->: 4 "
										 + " \n \t afficher la liste des Directeur général (DG) ----------------->: 5");
						String method3 = scan.next();
						switch (method3) {
							case "1":
								//TEST
								System.out.println(" \n \t ---------------- \n \t la liste des Chef de projet (CP) \n \t ----------------");
								user.FiltrageListManager(users,"CP");
								break;
							case "2":
								//TEST
								System.out.println(" \n \t ---------------- \n \t la liste des Managers  (MN) \n \t ----------------");
								user.FiltrageListManager(users,"MN");
								break;
							case "3":
								//test
								System.out.println(" \n \t ---------------- \n \t la liste des Directeur de projet (DP) \n \t ----------------");
								user.FiltrageListManager(users,"DP");
								break;
							case "4":
								//TEST
								System.out.println(" \n \t ---------------- \n \t la liste des Directeur des ressources humaines (DRH) \n \t ----------------");
								user.FiltrageListManager(users,"DRH");
								break;
							case "5":
								//test
								System.out.println(" \n \t ---------------- \n \t la liste des Directeur général (DG) \n \t ----------------");
								user.FiltrageListManager(users,"DG");
								break;
							default:
						}
					
						
						
					}else {
						System.out.println("Liste des Utilisateur  Vide ! \n");
					}
					break;
				default:		
			}
		}

	}
	
	public static void Add_Profil_And_User(String code,String libelle,ArrayList<Profile> profiles,ArrayList<Users> users,String Matricule,String First_Name,String Last_Name,String Email,int Phone,double salaire,String login,String password) {
		Profile profile = new Profile(code,libelle);
		profile.AddProfil(profile, profiles, code);
		Users user = new Users(Matricule,First_Name,Last_Name,Email,Phone,salaire,login,password,code);
		user.AddUser(user, users);
		user.calculerSalaire(users,Matricule);
	}

}
