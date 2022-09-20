package Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Medical_Visit {
	
	protected int id_Visit;
	protected String visit_Type;
	protected LocalDate visit_Date;
	protected LocalTime visit_Hour;
	protected Client address;
	
	public int getId_Visit() {
		return id_Visit;
	}
	public void setId_Visit(int id_Visit) {
		this.id_Visit = id_Visit;
	}
	public String getVisit_Type() {
		return visit_Type;
	}
	public void setVisit_Type(String visit_Type) {
		this.visit_Type = visit_Type;
	}
	public LocalDate getVisit_Date() {
		return visit_Date;
	}
	public void setVisit_Date(LocalDate visit_Date) {
		this.visit_Date = visit_Date;
	}
	public LocalTime getVisit_Hour() {
		return visit_Hour;
	}
	public void setVisit_Hour(LocalTime visit_Hour) {
		this.visit_Hour = visit_Hour;
	}
	public Client getAddress() {
		return address;
	}
	public void setAddress(Client address) {
		this.address = address;
	}
	
	public Medical_Visit() {
		super();
	}
	
	public Medical_Visit(int id_Visit, String visit_Type, LocalDate visit_Date, LocalTime visit_Hour, Client address) {
		super();
		this.id_Visit = id_Visit;
		this.visit_Type = visit_Type;
		this.visit_Date = visit_Date;
		this.visit_Hour = visit_Hour;
		this.address = address;
	}
	
	public Medical_Visit(String visit_Type, LocalDate visit_Date, LocalTime visit_Hour, Client address) {
		super();
		this.visit_Type = visit_Type;
		this.visit_Date = visit_Date;
		this.visit_Hour = visit_Hour;
		this.address = address;
	}
	
	

}
