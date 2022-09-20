package Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Intervention {

	protected int id_Intervention;
	protected String description;
	protected LocalDate intervention_Date;
	protected LocalTime intervention_Hour;
	
	public int getId_Intervention() {
		return id_Intervention;
	}
	public void setId_Intervention(int id_Intervention) {
		this.id_Intervention = id_Intervention;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getIntervention_Date() {
		return intervention_Date;
	}
	public void setIntervention_Date(LocalDate intervention_Date) {
		this.intervention_Date = intervention_Date;
	}
	public LocalTime getIntervention_Hour() {
		return intervention_Hour;
	}
	public void setIntervention_Hour(LocalTime intervention_Hour) {
		this.intervention_Hour = intervention_Hour;
	}
	
	public Intervention() {
		super();
	}
	
	public Intervention(int id_Intervention, String description, LocalDate intervention_Date,
			LocalTime intervention_Hour) {
		super();
		this.id_Intervention = id_Intervention;
		this.description = description;
		this.intervention_Date = intervention_Date;
		this.intervention_Hour = intervention_Hour;
	}
	
	public Intervention(String description, LocalDate intervention_Date, LocalTime intervention_Hour) {
		super();
		this.description = description;
		this.intervention_Date = intervention_Date;
		this.intervention_Hour = intervention_Hour;
	}
	
	
	
}
