package Model;

import java.time.LocalDate;
import java.time.LocalTime;


public class Medical_Appointment {

	protected int id_App;
	protected String app_Type;
	protected LocalDate app_Date;
	protected LocalTime app_Hour;
	
	public int getId_App() {
		return id_App;
	}
	public void setId_App(int id_App) {
		this.id_App = id_App;
	}
	public String getApp_Type() {
		return app_Type;
	}
	public void setApp_Type(String app_Type) {
		this.app_Type = app_Type;
	}
	public LocalDate getApp_Date() {
		return app_Date;
	}
	public void setApp_Date(LocalDate app_Date) {
		this.app_Date = app_Date;
	}
	public LocalTime getApp_Hour() {
		return app_Hour;
	}
	public void setApp_Hour(LocalTime app_Hour) {
		this.app_Hour = app_Hour;
	}
	
	public Medical_Appointment() {
		super();
	}
	
	public Medical_Appointment(int id_App, String app_Type, LocalDate app_Date, LocalTime app_Hour) {
		super();
		this.id_App = id_App;
		this.app_Type = app_Type;
		this.app_Date = app_Date;
		this.app_Hour = app_Hour;
	}
	
	public Medical_Appointment(String app_Type, LocalDate app_Date, LocalTime app_Hour) {
		super();
		this.app_Type = app_Type;
		this.app_Date = app_Date;
		this.app_Hour = app_Hour;
	}
	
	
	
}
