package Model;

import java.util.ArrayList;

public class Profile {
	
	private int id;
	private String code;
	private String libelle;
	private int count;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public Profile (int id, String code) {
		this.id = count++;
		this.code = code;
	}
	
	public Profile() {
		
	}
	public Profile(String code, String libelle) {
		
	}
	public String toString() {
		return "Profile[id=" + id +", code=" + code + ", libelle=" + libelle +"]\n";
	}
	
	//creation des profile
	public static void AddProfil(Profile profiles,ArrayList<Profile> profile,String code) {
		int cnt = 0;
		for (int j = 0; j < profile.size(); j++) {
			if (code == profile.get(j).getCode()) {
				cnt++;
			}
		}
		if(cnt ==0) {
			profile.add(profiles);
			System.out.println("\n ajoute profil avec succes");
		}else {
			System.out.println("\n profil deja exist");
		}
	}

}
