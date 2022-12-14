package Model;

public class User {

	protected int id_User;
	protected String username;
    protected int permission_Level;
    protected String dni;
    protected String name;
    protected String address;
    protected String phone_Number;
    protected String birthdate;
    protected String gender;
	
    public int getId_User() {
		return id_User;
	}
	public void setId_User(int id_User) {
		this.id_User = id_User;
	}
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPermission_Level() {
		return permission_Level;
	}
	public void setPermission_Level(int permission_Level) {
		this.permission_Level = permission_Level;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone_Number() {
		return phone_Number;
	}
	public void setPhone_Number(String phone_Number) {
		this.phone_Number = phone_Number;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public User() {
		super();
	}
	
	public User(int id_User, String username, int permission_Level, String dni, String name, String address,
			String phone_Number, String birthdate, String gender) {
		super();
		this.id_User = id_User;
		this.username = username;
		this.permission_Level = permission_Level;
		this.dni = dni;
		this.name = name;
		this.address = address;
		this.phone_Number = phone_Number;
		this.birthdate = birthdate;
		this.gender = gender;
	}
	
	public User(String username, int permission_Level, String dni, String name, String address, String phone_Number,
			String birthdate, String gender) {
		super();
		this.username = username;
		this.permission_Level = permission_Level;
		this.dni = dni;
		this.name = name;
		this.address = address;
		this.phone_Number = phone_Number;
		this.birthdate = birthdate;
		this.gender = gender;
	}
	
	
	
    
    
}
