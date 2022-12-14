package Model;

public class Veterinarian extends User {

	protected int id_Veterinarian;
	protected String medical_License;
	
	public int getId_Veterinarian() {
		return id_Veterinarian;
	}
	public void setId_Veterinarian(int id_Veterinarian) {
		this.id_Veterinarian = id_Veterinarian;
	}
	public String getMedical_License() {
		return medical_License;
	}
	public void setMedical_License(String medical_License) {
		this.medical_License = medical_License;
	}
	
	public Veterinarian() {
		super();
	}
	
	public Veterinarian(int id_User, String username, int permission_Level, String dni, String name, String address,
			String phone_Number, String birthdate, String gender, int id_Veterinarian, String medical_License) {
		super(id_User, username, permission_Level, dni, name, address, phone_Number, birthdate, gender);
		this.id_Veterinarian = id_Veterinarian;
		this.medical_License = medical_License;
	}
	
	public Veterinarian(String username, int permission_Level, String dni, String name, String address,
			String phone_Number, String birthdate, String gender, int id_Veterinarian, String medical_License) {
		super(username, permission_Level, dni, name, address, phone_Number, birthdate, gender);
		this.id_Veterinarian = id_Veterinarian;
		this.medical_License = medical_License;
	}
	
	
	
	
	
	
	
}
