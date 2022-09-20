package Model;

public class Provider_Type {

	protected int id_Provider_Type;
	protected String owner;
	protected String address;
	protected int id_Laboratory;
	
	public int getId_Provider_Type() {
		return id_Provider_Type;
	}
	public void setId_Provider_Type(int id_Provider_Type) {
		this.id_Provider_Type = id_Provider_Type;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getId_Laboratory() {
		return id_Laboratory;
	}
	public void setId_Laboratory(int id_Laboratory) {
		this.id_Laboratory = id_Laboratory;
	}
	
	public Provider_Type() {
		super();
	}
	
	public Provider_Type(int id_Provider_Type, String owner, String address, int id_Laboratory) {
		super();
		this.id_Provider_Type = id_Provider_Type;
		this.owner = owner;
		this.address = address;
		this.id_Laboratory = id_Laboratory;
	}
	
	public Provider_Type(String owner, String address, int id_Laboratory) {
		super();
		this.owner = owner;
		this.address = address;
		this.id_Laboratory = id_Laboratory;
	}
	
	
	
}
