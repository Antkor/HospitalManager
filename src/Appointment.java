import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Appointment {
	
	private Date day;
	private String time;
	private String amkaPatient;
	private String arMitrwoyDoctor;
	private String info;
	private DbConnector connector;
	
	public Appointment(Date day, String time, String amkaPatient, String arMitrwoyDoctor, String info) {
		this.day = day;
		this.time = time;
		this.amkaPatient = amkaPatient;
		this.arMitrwoyDoctor = arMitrwoyDoctor;
		this.info = info;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getAmkaPatient() {
		return amkaPatient;
	}
	public void setAmkaPatient(String amkaPatient) {
		this.amkaPatient = amkaPatient;
	}
	public String getArMitrwoyDoctor() {
		return arMitrwoyDoctor;
	}
	public void setArMitrwoyDoctor(String arMitrwoyDoctor) {
		this.arMitrwoyDoctor = arMitrwoyDoctor;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public ArrayList<Appointment> getData(){
		return AppointmentList.getAppointments();
	}
	
}
